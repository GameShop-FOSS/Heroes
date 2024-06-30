package com.gameshopcorp.heroes.characters.rune.head;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class TopHead extends SuperCube {
    public TopHead(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides) {
        super(app, axis, node, imports, renderSides);
    }

    @Override
    public void make() {

        //top
        updateCurrencyLine("top", (byte) 1, (byte) 1,new Vector3f(0,.35f,0f));
        updateCurrencyLine("top", (byte) 1, (byte) 2,new Vector3f(0,.35f,0));
        updateCurrencyLine("top", (byte) 2, (byte) 1,new Vector3f(0,.35f,0));
        updateCurrencyLine("top", (byte) 2, (byte) 1,new Vector3f(0,.35f,0));

        //front

        updateCurrencyLine("front", (byte) 1, (byte) 1,new Vector3f(0,.15f,.35f));
        updateCurrencyLine("front", (byte) 1, (byte) 2,new Vector3f(0,.15f,.35f));
        updateCurrencyLine("front", (byte) 2, (byte) 1,new Vector3f(0,.35f,.15f));
        updateCurrencyLine("front", (byte) 2, (byte) 1,new Vector3f(0,.35f,.15f));

        //back
        updateCurrencyLine("back", (byte) 1, (byte) 1,new Vector3f(0,.15f,-.35f));
        updateCurrencyLine("back", (byte) 1, (byte) 2,new Vector3f(0,.15f,-.35f));
        updateCurrencyLine("back", (byte) 2, (byte) 1,new Vector3f(0,.35f,-.15f));
        updateCurrencyLine("back", (byte) 2, (byte) 1,new Vector3f(0,.35f,-.15f));

        //right
        updateCurrencyLine("right", (byte) 1, (byte) 1,new Vector3f(.35f,.15f,0));
        updateCurrencyLine("right", (byte) 1, (byte) 2,new Vector3f(.35f,.15f,0));
        updateCurrencyLine("right", (byte) 2, (byte) 1,new Vector3f(.15f,.35f,0));
        updateCurrencyLine("right", (byte) 2, (byte) 1,new Vector3f(.15f,.35f,0));

        //left
        updateCurrencyLine("left", (byte) 1, (byte) 1,new Vector3f(-.35f,.15f,0));
        updateCurrencyLine("left", (byte) 1, (byte) 2,new Vector3f(-.35f,.15f,0));
        updateCurrencyLine("left", (byte) 2, (byte) 1,new Vector3f(-.15f,.35f,0));
        updateCurrencyLine("left", (byte) 2, (byte) 1,new Vector3f(-.15f,.35f,0));

    }

    @Override
    public void makeExports() {
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

            HashMap<String, Vector3f> backHead = new HashMap<>();

            backHead.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 0).vertices[0]).add(0,-2,0));
            backHead.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 0).vertices[0]));
            backHead.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 0).vertices[0]));
            backHead.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 0).vertices[0]).add(0,-2,0));
            backHead.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 7).vertices[0]).add(0,-2,0));
            backHead.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 7).vertices[0]));
            backHead.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 7).vertices[0]));
            backHead.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 7).vertices[0]).add(0,-2,0));

            exports.put("BackHead", backHead);

        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

            HashMap<String, Vector3f> chinHead = new HashMap<>();

            chinHead.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 7).vertices[0]).add(0,-2.75f,0f));
            chinHead.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 7).vertices[0]).add(0,-1.5f,0f));
            chinHead.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 7).vertices[0]).add(0,-1.5f,0f));
            chinHead.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 7).vertices[0]).add(0,-2.75f,0f));
            chinHead.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(0,-2.75f,.5f));
            chinHead.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(0,-1.5f,.5f));
            chinHead.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(0,-1.5f,.5f));
            chinHead.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(0,-2.75f,.5f));

            exports.put("ChinHead", chinHead);

        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

            HashMap<String, Vector3f> foreHead = new HashMap<>();

            foreHead.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 7).vertices[0]).add(0,-1.5f,0f));
            foreHead.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 7).vertices[0]).add(0,0,0f));
            foreHead.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 7).vertices[0]).add(0,0,0f));
            foreHead.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 7).vertices[0]).add(0,-1.5f,0f));
            foreHead.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(0,-1.5f,0));
            foreHead.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(0,0,0));
            foreHead.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(0,0,0));
            foreHead.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(0,-1.5f,0));

            exports.put("ForeHead", foreHead);

        }


    }
}
