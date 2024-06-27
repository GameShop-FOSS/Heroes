package com.gameshopcorp.heroes.characters.rune.body;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Abs extends SuperCube {

    public Abs(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides) {
        super(app, axis, node, imports, renderSides);
    }

    @Override
    public void makeExports() {

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

            HashMap<String, Vector3f> waist = new HashMap<>();

            waist.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]).add(-1,-2,-1)); //bot
            waist.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 15).vertices[0]));
            waist.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]));
            waist.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 15).vertices[0]).add(1,-2,-1));//bot
            waist.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 0).vertices[0]).add(-1,-2,1));//bot
            waist.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(15, 0).vertices[0]));
            waist.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 0).vertices[0]));
            waist.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(0, 0).vertices[0]).add(1,-2,1));//bot

            exports.put("Waist", waist);

        }
    }
}
