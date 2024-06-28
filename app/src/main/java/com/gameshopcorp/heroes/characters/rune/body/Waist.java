package com.gameshopcorp.heroes.characters.rune.body;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Waist extends SuperCube {
    public Waist(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides) {
        super(app, axis, node, imports, renderSides);
    }

    @Override
    public void makeExports() {
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("right")) {

            HashMap<String, Vector3f> backLegRight = new HashMap<>();

            backLegRight.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(0, 15).vertices[0]).add(0,-5,0)); //bot
            backLegRight.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(0, 15).vertices[0]));
            backLegRight.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(15, 15).vertices[0]));
            backLegRight.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(15, 15).vertices[0]).add(0,-5,0));//bot
            backLegRight.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(0, 0).vertices[0]).add(0,-5,0));//bot
            backLegRight.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(0, 0).vertices[0]));
            backLegRight.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(15, 0).vertices[0]));
            backLegRight.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("right")).getMeshFromValue(15, 0).vertices[0]).add(0,-5,0));//bot

            exports.put("BackLegRight", backLegRight);

        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("left")) {

            HashMap<String, Vector3f> backLegLeft = new HashMap<>();

            backLegLeft.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(0, 15).vertices[0]).add(0,-5,0)); //bot
            backLegLeft.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(0, 15).vertices[0]));
            backLegLeft.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(15, 15).vertices[0]));
            backLegLeft.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(15, 15).vertices[0]).add(0,-5,0));//bot
            backLegLeft.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(0, 0).vertices[0]).add(0,-5,0));//bot
            backLegLeft.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(0, 0).vertices[0]));
            backLegLeft.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(15, 0).vertices[0]));
            backLegLeft.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("left")).getMeshFromValue(15, 0).vertices[0]).add(0,-5,0));//bot

            exports.put("BackLegLeft", backLegLeft);

        }
    }
}
