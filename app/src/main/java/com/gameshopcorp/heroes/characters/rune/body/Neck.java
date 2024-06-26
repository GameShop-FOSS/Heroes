package com.gameshopcorp.heroes.characters.rune.body;
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

public class Neck extends SuperCube {



    public Neck(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides){
        super(app, axis, node, imports, renderSides);

       // makeExports();
    }

    @Override
    public void makeExports() {

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

            HashMap<String, Vector3f> torso = new HashMap<>();

            torso.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(1,-4,1)); //bot
            torso.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(4,0,1));
            torso.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(-4,0,1));
            torso.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(-1,-4,1));//bot
            torso.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 0).vertices[0]).add(1,-4,-1));//bot
            torso.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 0).vertices[0]).add(4,0,-1));
            torso.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 0).vertices[0]).add(-4,0,-1));
            torso.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 0).vertices[0]).add(-1,-4,-1));//bot

            exports.put("Torso", torso);

        }

    }
}
