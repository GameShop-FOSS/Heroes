package com.gameshopcorp.heroes.characters.rune.head;

import com.gameshopcorp.heroes.graphics.ATMS;
import com.gameshopcorp.heroes.graphics.CurrencyLine;
import com.gameshopcorp.heroes.graphics.CurrencyMesh;
import com.gameshopcorp.heroes.graphics.Layer;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.texture.Image;
import com.jme3.texture.Texture2D;
import com.jme3.texture.image.ColorSpace;
import com.jme3.util.BufferUtils;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class Head {

    CurrencyMesh front;
    CurrencyMesh back;
    CurrencyMesh left;
    CurrencyMesh right;
    CurrencyMesh bottom;
    CurrencyMesh top;
    SimpleApplication app;

    CurrencyLine frontTop;
    CurrencyLine frontBottom;
    CurrencyLine frontRight;
    CurrencyLine frontLeft;

    CurrencyLine backTop;
    CurrencyLine backBottom;
    CurrencyLine backRight;
    CurrencyLine backLeft;

    CurrencyLine topRight;
    CurrencyLine topLeft;
    CurrencyLine bottomLeft;
    CurrencyLine bottomRight;

    public Vector3f axis; //
    public Node node;

    public HashMap<String, Vector3f[]> exports;

    public Head(SimpleApplication app, Vector3f axis, Node node){

        this.app = app;

        this.axis = new Vector3f(axis);

        this.node = node;

        exports = new HashMap<>();
        addEdgeCurrencyLines();
        addFront();
        addBack();
        addRight();
        addLeft();
        addTop();
        addBottom();
    }

    public void addEdgeCurrencyLines(){

          Vector3f[] corners = new Vector3f[]{
                  //Front:0
                  axis.add(new Vector3f(.5f,-1,0)),axis.add(new Vector3f(.75f,3f,0)), axis.add(new Vector3f(2.25f,3,0)),axis.add(new Vector3f(2.5f,-1,0)),
                  //Back:4
                  axis.add(new Vector3f(.75f,1,-3)), axis.add(new Vector3f(.75f,3,-3)),axis.add(new Vector3f(2.25f,3,-3)), axis.add(new Vector3f(2.25f,1,-3))};

          //Top Of Head
          frontTop =  new CurrencyLine(new Vector3f[]{ corners[1], axis.add(new Vector3f(1,3,0)), axis.add( new Vector3f(2,3f,0)), corners[2]}, (byte) 16);

          //Chin
          frontBottom = new CurrencyLine(new Vector3f[]{corners[0], axis.add(new Vector3f(1,-2,0)), axis.add(new Vector3f(2,-2,0)), corners[3]}, (byte) 16);

          frontRight = new CurrencyLine(new Vector3f[]{corners[0],axis.add(new Vector3f(0,1,0)) ,axis.add( new Vector3f(0,2,0)),corners[1]}, (byte) 16);
          frontLeft = new CurrencyLine(new Vector3f[]{corners[3],axis.add(new Vector3f(3,1,0)) , axis.add(new Vector3f(3,2,0)), corners[2]}, (byte) 16);

          backTop = new CurrencyLine(new Vector3f[]{corners[5], axis.add(new Vector3f(1,3,-3)),axis.add( new Vector3f(2,3,-3)), corners[6] }, (byte) 16);

          //Back Of Neck
          backBottom = new CurrencyLine(new Vector3f[]{corners[4], axis.add(new Vector3f(1,1,-3)),axis.add( new Vector3f(2,1,-3)), corners[7]}, (byte) 16);

        //Back Of Skull
          backRight = new CurrencyLine(new Vector3f[]{corners[4],axis.add(new Vector3f(0,1.5f,-4)), axis.add( new Vector3f(0f,2.5f,-4)), corners[5]}, (byte)16);
          backLeft =  new CurrencyLine(new Vector3f[]{corners[7],axis.add(new Vector3f(3,1.5f,-4)),axis.add( new Vector3f(3,2.5f,-4)), corners[6]}, (byte)16);

        topLeft = new CurrencyLine(new Vector3f[]{corners[6],   axis.add(new Vector3f(2.25f,4,-2)), axis.add(new Vector3f(2.25f,4,-1)),corners[2]}, (byte)16);
        topRight = new CurrencyLine(new Vector3f[]{corners[5],axis.add(new Vector3f(0.75f,4,-2)), axis.add(new Vector3f(0.75f,4,-1)),corners[1]}, (byte)16);

          //Chin Sides
        bottomLeft = new CurrencyLine(new Vector3f[]{corners[7],axis.add(new Vector3f(3,-1,-2)),axis.add(new Vector3f(3,-1f,-1)),corners[3] }, (byte)16) ;
        bottomRight = new CurrencyLine(new Vector3f[]{corners[4],axis.add(new Vector3f(0,-1,-2)),axis.add(new Vector3f(0,-1,-1)),corners[0] }, (byte)16) ;

    }
    public void addFront(){

        Vector3f[] mid = new Vector3f[]{axis.add(new Vector3f(1,1,2f)), axis.add(new Vector3f(2,1,2f)), axis.add(new Vector3f(1,2,2f)), axis.add(new Vector3f(2,2,2f)),};
        CurrencyLine cl = frontBottom;
        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{new Vector3f(frontRight.points[1]),mid[0], mid[1], new Vector3f(frontLeft.points[1])}, (byte) 16);
        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{new Vector3f(frontRight.points[2]), mid[2], mid[3], new Vector3f(frontLeft.points[2])}, (byte) 16);
        CurrencyLine cl3 = frontTop;
        Layer layer= new Layer((short) 128, (short) 128);
        //layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        //DRAW FEACHURES
       // layer.drawCircle((short) 25, (short) 25, (short) 4, ColorRGBA.fromRGBA255(255,225,185,255));

        //DRILL COLOR CODE
        //layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(0,0,255,255));

        ATMS atms = new ATMS((byte) 1, layer);
        //atmsFront.frames[0] = layerFront;
        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
        Texture2D texture2D = new Texture2D(image);
        front = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);


        System.out.println("Front Dim: x:" + front.width +  " y:" + front.height);
        exports.put("EyeRight", new Vector3f[]{
                new Vector3f(front.getMeshFromValue(2,6).vertices[0]),
                new Vector3f(front.getMeshFromValue(2,10).vertices[0]),
                new Vector3f(front.getMeshFromValue(6,10).vertices[0]),
                new Vector3f(front.getMeshFromValue(6,6).vertices[0]) // 4 right, 12 Up
        });
    }

    public void addBack(){

        Vector3f[] mid = new Vector3f[]{axis.add(new Vector3f(2,1.5f,-3.5f)), axis.add(new Vector3f(1,1.5f,-3.5f)), axis.add(new Vector3f(2,2.5f,-3.5f)), axis.add(new Vector3f(1,2.5f,-3.5f))};
        CurrencyLine cl = backBottom;
        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{new Vector3f(backRight.points[1]), mid[0], mid[1] , new Vector3f(backLeft.points[1])}, (byte) 16);
        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{new Vector3f(backRight.points[2]), mid[2], mid[3] , new Vector3f(backLeft.points[2])}, (byte) 16);
        CurrencyLine cl3 = backTop;

        Layer layer = new Layer((short) 128, (short) 128);
        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        //DRILL COLOR CODE
       // layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(0,0,255,255));

        ATMS atms = new ATMS((byte) 1, layer);
        //atmsFront.frames[0] = layerFront;
        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
        Texture2D texture2D = new Texture2D(image);
        back = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);

    }

    public void addRight(){
        Vector3f[] mid = new Vector3f[]{axis.add(new Vector3f(-1f,1,-2)), axis.add(new Vector3f(-1,1, -1)), axis.add(new Vector3f(-1,2,-2)), axis.add(new Vector3f(-1,2,-1)), };
        CurrencyLine cl = bottomRight;
        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{new Vector3f(backRight.points[1]), mid[0], mid[1], new Vector3f(frontRight.points[1])}, (byte) 16);
        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{new Vector3f(backRight.points[2]), mid[2], mid[3], new Vector3f(frontRight.points[2])}, (byte) 16);
        CurrencyLine cl3 = topRight;

        Layer layer= new Layer((short) 128, (short) 128);
        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        ATMS atms = new ATMS((byte) 1, layer);
        //atmsFront.frames[0] = layerFront;
        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
        Texture2D texture2D = new Texture2D(image);
        right = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);
    }

    public void addLeft(){

        Vector3f[] mid = new Vector3f[]{ axis.add(new Vector3f(4f,1,-2)), axis.add(new Vector3f(4,1,-1)), axis.add(new Vector3f(4,2,-2)), axis.add(new Vector3f(4,2,-1)) };
        CurrencyLine cl = bottomLeft;
        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{new Vector3f(backLeft.points[1]), mid[0], mid[1], new Vector3f(frontLeft.points[1]),}, (byte) 16);
        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{new Vector3f(backLeft.points[2]), mid[2], mid[3], new Vector3f(frontLeft.points[2]),}, (byte) 16);
        CurrencyLine cl3 = topLeft;

        Layer layer= new Layer((short) 128, (short) 128);
        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        //layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(0,0,255,255));

        ATMS atms = new ATMS((byte) 1, layer);
        //atmsFront.frames[0] = layerFront;
        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
        Texture2D texture2D = new Texture2D(image);
        left = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);
    }

    public void addTop(){
        Vector3f[] mid = new Vector3f[]{axis.add(new Vector3f(1,4.5f,-1)), axis.add(new Vector3f(2,4.5f,-1)), axis.add(new Vector3f(1,4.5f,-2)), axis.add(new Vector3f(2,4,-2)),};
        CurrencyLine cl = frontTop;
        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{topRight.points[1], mid[0], mid[1],  topLeft.points[1]}, (byte) 16);
        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{topRight.points[2], mid[2], mid[3],  topLeft.points[2]}, (byte) 16);
        CurrencyLine cl3 = backTop;

        Layer layer= new Layer((short) 128, (short) 128);
        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        ATMS atms = new ATMS((byte) 1, layer);
        //atmsFront.frames[0] = layerFront;
        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
        Texture2D texture2D = new Texture2D(image);
        top = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);

    }

    public void addBottom(){
        Vector3f[] mid = new Vector3f[]{axis.add(new Vector3f(1,-1,-2)), axis.add(new Vector3f(2,-1,-2)),axis.add(new Vector3f(1,-2,-1)),axis.add(new Vector3f(2,-2,-1))};
        CurrencyLine cl = backBottom;
        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{bottomRight.points[1], mid[0], mid[1],  bottomLeft.points[1]}, (byte) 16);
        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{bottomRight.points[2], mid[2], mid[3] , bottomLeft.points[2]}, (byte) 16);
        CurrencyLine cl3 = frontBottom;

        Layer layer= new Layer((short) 128, (short) 128);
        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));

        //DRILL COLOR CODE
       // layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(0,0,0,255));

        ATMS atms = new ATMS((byte) 1, layer);
        //atmsFront.frames[0] = layerFront;
        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
        Texture2D texture2D = new Texture2D(image);
        bottom = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);

        exports.put("Neck", mid);
    }




}
