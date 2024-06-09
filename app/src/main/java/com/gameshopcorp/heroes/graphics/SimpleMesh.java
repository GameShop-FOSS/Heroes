package com.gameshopcorp.heroes.graphics;
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.VertexBuffer;
import com.jme3.scene.mesh.IndexBuffer;
import com.jme3.texture.Image;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture2D;
import com.jme3.texture.image.ColorSpace;
import com.jme3.util.BufferUtils;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class SimpleMesh {
    public Vector3f[] vertices;
    Vector2f[] texCoord;

//    public SimpleMesh(SimpleApplication app, Vector3f[] vertices, Vector2f[] texCoord, Texture2D texture2D, Node node){
//
//        Mesh m = new Mesh();
//
//        // Vertex positions in space
//        this.vertices = new Vector3f[4];
//        this.vertices[0] = new Vector3f(vertices[0]);
//        this.vertices[1] = new Vector3f(vertices[1]);
//        this.vertices[2] = new Vector3f(vertices[2]);
//        this.vertices[3] = new Vector3f(vertices[3]);
//
//        // Texture coordinates
//        this.texCoord = new Vector2f[4];
//        this.texCoord[0] = new Vector2f(texCoord[0]); // new Vector2f(0,0);
//        this.texCoord[1] = new Vector2f(texCoord[1]);//new Vector2f(1,0);
//        this.texCoord[2] = new Vector2f(texCoord[2]);//new Vector2f(0,1);
//        this.texCoord[3] = new Vector2f(texCoord[3]);//new Vector2f(1,1);
//
//        // Indexes. We define the order in which mesh should be constructed
//        short[] indexes = {2, 0, 1, 1, 3, 2};
//                           // ,2,3,1,1,0,2};
//
//
//
//        // Setting buffers
//        m.setBuffer(VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(this.vertices));
//        m.setBuffer(VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(this.texCoord));
//        m.setBuffer(VertexBuffer.Type.Index, 1, BufferUtils.createShortBuffer(indexes));
//
//        m.updateBound();
//
//
//        //*****RenderState*****
//
//        // *************************************************************************
//        // First mesh uses one solid color
//        // *************************************************************************
//
//        // Creating a geometry, and apply a single color material to it
//        Geometry geom = new Geometry("OurMesh", m);
//
//        Material mat = new Material(app.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
//        mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
//        // mat.setColor("Color", ColorRGBA.fromRGBA255(255,255,255,255));
//        mat.setTexture("ColorMap", texture2D);
//        geom.setMaterial(mat);
//
//        // Attaching our geometry to the root node.
//        //app.getRootNode().attachChild(geom);
//        node.attachChild(geom);
//    }

    public SimpleMesh(SimpleApplication app, Vector3f[] vertices, Vector2f[] texCoord, Texture2D texture, Node node){

        Mesh m = new Mesh();

        // Vertex positions in space
        this.vertices = new Vector3f[4];
        this.vertices[0] = new Vector3f(vertices[0]);
        this.vertices[1] = new Vector3f(vertices[1]);
        this.vertices[2] = new Vector3f(vertices[2]);
        this.vertices[3] = new Vector3f(vertices[3]);

        // Texture coordinates
        this.texCoord = new Vector2f[4];
        this.texCoord[0] = new Vector2f(texCoord[0]); // new Vector2f(0,0);
        this.texCoord[1] = new Vector2f(texCoord[1]);//new Vector2f(1,0);
        this.texCoord[2] = new Vector2f(texCoord[2]);//new Vector2f(0,1);
        this.texCoord[3] = new Vector2f(texCoord[3]);//new Vector2f(1,1);

        // Indexes. We define the order in which mesh should be constructed
        short[] indexes = {2, 0, 1, 1, 3, 2};
         //,2,3,1,1,0,2};



        // Setting buffers
        m.setBuffer(VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(this.vertices));
        m.setBuffer(VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(this.texCoord));
        m.setBuffer(VertexBuffer.Type.Index, 1, BufferUtils.createShortBuffer(indexes));

        m.updateBound();


        //*****RenderState*****

       // texture.setWrap(Texture.WrapMode.Repeat);
        // *************************************************************************
        // First mesh uses one solid color
        // *************************************************************************

        // Creating a geometry, and apply a single color material to it
        Geometry geom = new Geometry("OurMesh", m);

        Material mat = new Material(app.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
        mat.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);

        // mat.setColor("Color", ColorRGBA.fromRGBA255(255,255,255,255));
        mat.setTexture("ColorMap", texture);
        geom.setMaterial(mat);
        //geom.getMesh().scaleTextureCoordinates(new Vector2f(2, 2));

        // Attaching our geometry to the root node.
        //app.getRootNode().attachChild(geom);
        node.attachChild(geom);
    }

}

