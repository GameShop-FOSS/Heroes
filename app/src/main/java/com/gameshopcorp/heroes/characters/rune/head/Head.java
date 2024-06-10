package com.gameshopcorp.heroes.characters.rune.head;

import com.gameshopcorp.heroes.graphics.ATMS;
import com.gameshopcorp.heroes.graphics.CurrencyLine;
import com.gameshopcorp.heroes.graphics.CurrencyMesh;
import com.gameshopcorp.heroes.graphics.Layer;
import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.texture.Image;
import com.jme3.texture.Texture2D;
import com.jme3.texture.image.ColorSpace;
import com.jme3.util.BufferUtils;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Head extends SuperCube {

    public Head(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides){
        super(app, axis, node, imports, renderSides);

        make();
        makeExports();
    }

    @Override
    public void make() {

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")) {
            modCurrencyLine("front", (byte) 0, (byte) 1, new Vector3f(1, -2, 0));
            modCurrencyLine("front", (byte) 0, (byte) 2, new Vector3f(2, -2, 0));

            modCurrencyLine("front", (byte) 3, (byte) 1, new Vector3f(1, 3.5f, 0));
            modCurrencyLine("front", (byte) 3, (byte) 2, new Vector3f(2, 3.5f, 0));

            //frontmid
            modCurrencyLine("front", (byte) 1, (byte) 1, new Vector3f(1, 1, 2));
            modCurrencyLine("front", (byte) 1, (byte) 2, new Vector3f(2, 1f, 2));
            modCurrencyLine("front", (byte) 2, (byte) 1, new Vector3f(1, 2, 2));
            modCurrencyLine("front", (byte) 2, (byte) 2, new Vector3f(2, 2f, 2));

        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("back")) {
            //right
            modCurrencyLine("back", (byte) 1, (byte) 0, new Vector3f(0, 1.5f, -4));
            modCurrencyLine("back", (byte) 2, (byte) 0, new Vector3f(0, 2.5f, -4));

            //left
            modCurrencyLine("back", (byte) 1, (byte) 3, new Vector3f(3, 1.5f, -4));
            modCurrencyLine("back", (byte) 2, (byte) 3, new Vector3f(3, 2.5f, -4));

            //backmid
            modCurrencyLine("back", (byte) 1, (byte) 1, new Vector3f(2, 1.5f, -3.5f));
            modCurrencyLine("back", (byte) 1, (byte) 2, new Vector3f(1, 1.5f, -3.5f));
            modCurrencyLine("back", (byte) 2, (byte) 1, new Vector3f(2, 2.5f, -3.5f));
            modCurrencyLine("back", (byte) 2, (byte) 2, new Vector3f(1, 2.5f, -3.5f));
        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("right")){
            modCurrencyLine("right", (byte) 1, (byte) 1, new Vector3f(-1, 1, -2));
            modCurrencyLine("right", (byte) 1, (byte) 2, new Vector3f(-1, 1f, -1));
            modCurrencyLine("right", (byte) 2, (byte) 1, new Vector3f(-1, 2, -2));
            modCurrencyLine("right", (byte) 2, (byte) 2, new Vector3f(-1, 2f, -1));

            //topright
            modCurrencyLine("right", (byte) 3, (byte) 1, new Vector3f(.75f, 4f, -2));
            modCurrencyLine("right", (byte) 3, (byte) 2, new Vector3f(.75f, 4f, -1));

            //bottomright
            modCurrencyLine("right", (byte) 0, (byte) 1, new Vector3f(0, -1f, -2));
            modCurrencyLine("right", (byte) 0, (byte) 2, new Vector3f(0, -1f, -1));
        }


        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("left")) {

            modCurrencyLine("left", (byte) 1, (byte) 1, new Vector3f(4, 1, -2));
            modCurrencyLine("left", (byte) 1, (byte) 2, new Vector3f(4, 1f, -1));
            modCurrencyLine("left", (byte) 2, (byte) 1, new Vector3f(4, 2, -2));
            modCurrencyLine("left", (byte) 2, (byte) 2, new Vector3f(4, 2f, -1));

            //topleft
            modCurrencyLine("left", (byte) 3, (byte) 1, new Vector3f(2.25f, 4f, -2));
            modCurrencyLine("left", (byte) 3, (byte) 2, new Vector3f(2.25f, 4f, -1));

            //bottomleft
            modCurrencyLine("left", (byte) 0, (byte) 1, new Vector3f(3, -1f, -2));
            modCurrencyLine("left", (byte) 0, (byte) 2, new Vector3f(3, -1f, -1f));
        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("top")) {
            //topleft
            modCurrencyLine("top", (byte) 2, (byte) 3, new Vector3f(2.25f, 4f, -2));
            modCurrencyLine("top", (byte) 1, (byte) 3, new Vector3f(2.25f, 4f, -1));

            //topright
            modCurrencyLine("top", (byte) 2, (byte) 0, new Vector3f(.75f, 4f, -2));
            modCurrencyLine("top", (byte) 1, (byte) 0, new Vector3f(.75f, 4f, -1));


            modCurrencyLine("top", (byte) 2, (byte) 1, new Vector3f(1, 4.5f, -1));
            modCurrencyLine("top", (byte) 2, (byte) 2, new Vector3f(2,4.5f,-1));
            modCurrencyLine("top", (byte) 1, (byte) 1, new Vector3f(1, 4.5f, -2));
            modCurrencyLine("top", (byte) 1, (byte) 2, new Vector3f(2,4.5f,-2));
        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {
            //bottomleft
            modCurrencyLine("bottom", (byte) 1, (byte) 3, new Vector3f(3, -1f, -2));
            modCurrencyLine("bottom", (byte) 2, (byte) 3, new Vector3f(3, -1f, -1f));

            //bottomright
            modCurrencyLine("bottom", (byte) 1, (byte) 0, new Vector3f(0, -1f, -1));
            modCurrencyLine("bottom", (byte) 2, (byte) 0, new Vector3f(0, -1f, -2));

            modCurrencyLine("bottom", (byte) 1, (byte) 1, new Vector3f(1, -1, -2));
            modCurrencyLine("bottom", (byte) 1, (byte) 2, new Vector3f(2,-1f,-2));
            modCurrencyLine("bottom", (byte) 2, (byte) 1, new Vector3f(1, -2, -1));
            modCurrencyLine("bottom", (byte) 2, (byte) 2, new Vector3f(2,-2f,-1));
        }

    }

//
//    public void addBottom(){
//        Vector3f[] mid = new Vector3f[]{axis.add(new Vector3f(1,-1,-2)), axis.add(new Vector3f(2,-1,-2)),axis.add(new Vector3f(1,-2,-1)),axis.add(new Vector3f(2,-2,-1))};
//        CurrencyLine cl = backBottom;
//        CurrencyLine cl1 = new CurrencyLine(new Vector3f[]{bottomRight.points[1], mid[0], mid[1],  bottomLeft.points[1]}, (byte) 16);
//        CurrencyLine cl2 = new CurrencyLine(new Vector3f[]{bottomRight.points[2], mid[2], mid[3] , bottomLeft.points[2]}, (byte) 16);
//        CurrencyLine cl3 = frontBottom;
//
//        Layer layer= new Layer((short) 128, (short) 128);
//        layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(255,215,175,255));
//
//        //DRILL COLOR CODE
//       // layer.drawCircle((short) 63, (short) 63, (short) 128, ColorRGBA.fromRGBA255(0,0,0,255));
//
//        ATMS atms = new ATMS((byte) 1, layer);
//        //atmsFront.frames[0] = layerFront;
//        ByteBuffer data = BufferUtils.createByteBuffer(atms.frames[0].outputLayer());
//        // ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
//        Image image = new Image(Image.Format.RGBA8, 128, 128, data, ColorSpace.Linear);
//        Texture2D texture2D = new Texture2D(image);
//        bottom = new CurrencyMesh(app, new CurrencyLine[]{cl, cl1, cl2, cl3}, texture2D, node);
//
//
//    }

    @Override
    public void makeExports(){

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")) {
            exports.put("EyeRight", new Vector3f[]{
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 6).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 10).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 10).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]) // 4 right, 12 Up
            });
        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")) {
            exports.put("EyeLeft", new Vector3f[]{
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 10).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 10).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 6).vertices[0]) // 4 right, 12 Up
            });
        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {
            exports.put("Neck", new Vector3f[]{
                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 0).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 8).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 8).vertices[0]),
                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 0).vertices[0])
            });
        }
    }
}
