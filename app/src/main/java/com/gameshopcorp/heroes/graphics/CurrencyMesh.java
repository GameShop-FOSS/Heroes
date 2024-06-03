package com.gameshopcorp.heroes.graphics;

import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.texture.Texture2D;

import java.nio.ByteBuffer;
public class CurrencyMesh {

    CurrencyLine[] vInfinitesimals;
    SimpleMesh[] simpleMeshes;
    public CurrencyMesh(SimpleApplication app, CurrencyLine[] currencyLines, Texture2D texture2D, Node node){

        float dim = 3;

        float width = currencyLines[0].points[currencyLines[0].points.length - 1].x - currencyLines[0].points[0].x;
        float height = currencyLines[currencyLines.length - 1].points[0].y - currencyLines[0].points[0].y;
        this.vInfinitesimals = new CurrencyLine[currencyLines[0].infinitesimals.length];

        for (int i = 0; i < this.vInfinitesimals.length; i++){

            this.vInfinitesimals[i] = new CurrencyLine(new Vector3f[]{currencyLines[0].infinitesimals[i], currencyLines[1].infinitesimals[i], currencyLines[2].infinitesimals[i], currencyLines[3].infinitesimals[i]}, (byte)8);

        }

        int imageArray = 1;

        imageArray = this.vInfinitesimals.length * this.vInfinitesimals[0].infinitesimals.length;

        simpleMeshes = new SimpleMesh[imageArray];

        for (int y = 0; y < this.vInfinitesimals.length - 1; y++){
            for (int x = 0; x < this.vInfinitesimals[0].infinitesimals.length - 1; x++){

                Vector3f[] simpleMesh = new Vector3f[4];
//                simpleMesh[0] = this.vInfinitesimals[y].infinitesimals[x];
//                simpleMesh[1] = this.vInfinitesimals[y].infinitesimals[x + 1];
//                simpleMesh[2] = this.vInfinitesimals[y + 1].infinitesimals[x];
//                simpleMesh[3] = this.vInfinitesimals[y + 1].infinitesimals[x + 1];
                simpleMesh[0] = this.vInfinitesimals[y].infinitesimals[x];
                simpleMesh[1] = this.vInfinitesimals[y + 1].infinitesimals[x];
                simpleMesh[2] = this.vInfinitesimals[y].infinitesimals[x + 1];
                simpleMesh[3] = this.vInfinitesimals[y + 1].infinitesimals[x + 1];
                Vector2f[] texCoord = new Vector2f[4];
                texCoord[0] = new Vector2f( new Vector2f(this.vInfinitesimals[y].infinitesimals[x].x/width,this.vInfinitesimals[y].infinitesimals[x].y/height)); // new Vector2f(0,0);
                texCoord[1] = new Vector2f( new Vector2f(this.vInfinitesimals[y + 1].infinitesimals[x].x/width,this.vInfinitesimals[y + 1].infinitesimals[x].y/height));//new Vector2f(1,0);
                texCoord[2] = new Vector2f( new Vector2f(this.vInfinitesimals[y].infinitesimals[x + 1].x/width,this.vInfinitesimals[y].infinitesimals[x + 1].y/height));//new Vector2f(0,1);
                texCoord[3] = new Vector2f( new Vector2f(this.vInfinitesimals[y + 1].infinitesimals[x + 1].x/width,this.vInfinitesimals[y + 1].infinitesimals[x + 1].y/height));//new Vector2f(1,1);
                simpleMeshes[(this.vInfinitesimals[0].infinitesimals.length * y) + x] = new SimpleMesh(app, simpleMesh, texCoord, texture2D, node);


            }
        }


        //        Mesh m = new Mesh();
//
//        // Vertex positions in space
//        Vector3f[] vertices = new Vector3f[4];
//        vertices[0] = new Vector3f(0,0,0);
//        vertices[1] = new Vector3f(3,0,0);
//        vertices[2] = new Vector3f(0,3,0);
//        vertices[3] = new Vector3f(3,3,0);
//
//        // Texture coordinates
//        Vector2f[] texCoord = new Vector2f[4];
//        texCoord[0] = new Vector2f(0,0);
//        texCoord[1] = new Vector2f(1,0);
//        texCoord[2] = new Vector2f(0,1);
//        texCoord[3] = new Vector2f(1,1);
//
//        // Indexes. We define the order in which mesh should be constructed
//        short[] indexes = {2, 0, 1, 1, 3, 2};
//
//        ByteBuffer data = BufferUtils.createByteBuffer((byte)0,(byte)127,(byte)0,(byte)62);
//        Image image = new Image(Image.Format.RGBA8, 1, 1, data, ColorSpace.Linear);
//        Texture2D texture2D = new Texture2D(image);
//        // Setting buffers
//        m.setBuffer(VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(vertices));
//        m.setBuffer(VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(texCoord));
//        m.setBuffer(VertexBuffer.Type.Index, 1, BufferUtils.createShortBuffer(indexes));
//        m.updateBound();
//
//        // *************************************************************************
//        // First mesh uses one solid color
//        // *************************************************************************
//
//        // Creating a geometry, and apply a single color material to it
//        Geometry geom = new Geometry("OurMesh", m);
//        Material mat = new Material(app.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
//        //mat.setColor("Color", ColorRGBA.fromRGBA255(255,255,255,128));
//        mat.setTexture("ColorMap", texture2D);
//        geom.setMaterial(mat);
//
//        // Attaching our geometry to the root node.
//        app.getRootNode().attachChild(geom);

    }
}
