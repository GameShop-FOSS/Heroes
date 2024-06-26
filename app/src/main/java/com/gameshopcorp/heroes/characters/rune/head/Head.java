package com.gameshopcorp.heroes.characters.rune.head;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

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
            setCurrencyLine("front", (byte) 0, (byte) 1, new Vector3f(1, -2, 0));
            setCurrencyLine("front", (byte) 0, (byte) 2, new Vector3f(2, -2, 0));

//            addCurrencyLine("front", (byte) 0, (byte) 1, new Vector3f(-.1600001f, -1,0));
//            addCurrencyLine("front", (byte) 0, (byte) 2, new Vector3f(.18f, -1,0));

            setCurrencyLine("front", (byte) 3, (byte) 1, new Vector3f(1, 3.5f, 0));
            setCurrencyLine("front", (byte) 3, (byte) 2, new Vector3f(2, 3.5f, 0));

//            addCurrencyLine("front", (byte) 3, (byte) 1, new Vector3f(-.2449999f, .5f,0));
//            addCurrencyLine("front", (byte) 3, (byte) 2, new Vector3f(.26f, .5f,0));


            setCurrencyLine("front", (byte) 1, (byte) 1, new Vector3f(1, 1, 2));
            setCurrencyLine("front", (byte) 1, (byte) 2, new Vector3f(2, 1f, 2));
            setCurrencyLine("front", (byte) 2, (byte) 1, new Vector3f(1, 2, 2));
            setCurrencyLine("front", (byte) 2, (byte) 2, new Vector3f(2, 2f, 2));

            //frontmid
//            modCurrencyLine("front", (byte) 2, (byte) 2, new Vector3f(2, 2f, 2));

//            addCurrencyLine("front", (byte) 1, (byte) 1, new Vector3f(-.18805f, (.68f - .000000005f), 2));
//            addCurrencyLine("front", (byte) 1, (byte) 2, new Vector3f((.21f - .0036001f), (.68f - .000000005f), 2));
//            addCurrencyLine("front", (byte) 2, (byte) 1, new Vector3f(-.2161f, (.36f - 0000001f), 2));
//            addCurrencyLine("front", (byte) 2, (byte) 2, new Vector3f((.24f - .0072001f), (.36f - 0000001f), 2));

        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("back")) {
            //right

            setCurrencyLine("back", (byte) 1, (byte) 0, new Vector3f(0, 1.5f, -4));
            setCurrencyLine("back", (byte) 2, (byte) 0, new Vector3f(0, 2.5f, -4));

//            addCurrencyLine("back", (byte) 1, (byte) 0, new Vector3f(-.75f, -.11f, -1));
//            addCurrencyLine("back", (byte) 2, (byte) 0, new Vector3f(-.75f, .18f, -1));

            //left
            setCurrencyLine("back", (byte) 1, (byte) 3, new Vector3f(3, 1.5f, -4));
            setCurrencyLine("back", (byte) 2, (byte) 3, new Vector3f(3, 2.5f, -4));

//            addCurrencyLine("back", (byte) 1, (byte) 3, new Vector3f(.75f, -.16f, -1));
//            addCurrencyLine("back", (byte) 2, (byte) 3, new Vector3f(.75f, .18f, -1));

            //backmid
            setCurrencyLine("back", (byte) 1, (byte) 1, new Vector3f(2, 1.5f, -3.5f));
            setCurrencyLine("back", (byte) 1, (byte) 2, new Vector3f(1, 1.5f, -3.5f));
            setCurrencyLine("back", (byte) 2, (byte) 1, new Vector3f(2, 2.5f, -3.5f));
            setCurrencyLine("back", (byte) 2, (byte) 2, new Vector3f(1, 2.5f, -3.5f));

//            addCurrencyLine("back", (byte) 1, (byte) 1, new Vector3f(.75f, -.16f, -.5f));
//            addCurrencyLine("back", (byte) 1, (byte) 2, new Vector3f(-.74f, -.16f, -.5f));
//            addCurrencyLine("back", (byte) 2, (byte) 1, new Vector3f(.75f, .18f, -.5f));
//            addCurrencyLine("back", (byte) 2, (byte) 2, new Vector3f(.25f, .18f, -.5f));

        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("right")){
            setCurrencyLine("right", (byte) 1, (byte) 1, new Vector3f(-1, 1, -2));
            setCurrencyLine("right", (byte) 1, (byte) 2, new Vector3f(-1, 1f, -1));
            setCurrencyLine("right", (byte) 2, (byte) 1, new Vector3f(-1, 2, -2));
            setCurrencyLine("right", (byte) 2, (byte) 2, new Vector3f(-1, 2f, -1));

            //topright
            setCurrencyLine("right", (byte) 3, (byte) 1, new Vector3f(.75f, 4f, -2));
            setCurrencyLine("right", (byte) 3, (byte) 2, new Vector3f(.75f, 4f, -1));

            //bottomright
            setCurrencyLine("right", (byte) 0, (byte) 1, new Vector3f(0, -1f, -1));
            setCurrencyLine("right", (byte) 0, (byte) 2, new Vector3f(0, -1f, -2));
        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("left")) {

            setCurrencyLine("left", (byte) 1, (byte) 1, new Vector3f(4, 1, -2));
            setCurrencyLine("left", (byte) 1, (byte) 2, new Vector3f(4, 1f, -1));
            setCurrencyLine("left", (byte) 2, (byte) 1, new Vector3f(4, 2, -2));
            setCurrencyLine("left", (byte) 2, (byte) 2, new Vector3f(4, 2f, -1));

            //topleft
            setCurrencyLine("left", (byte) 3, (byte) 1, new Vector3f(2.25f, 4f, -2));
            setCurrencyLine("left", (byte) 3, (byte) 2, new Vector3f(2.25f, 4f, -1));

            //bottomleft
            setCurrencyLine("left", (byte) 0, (byte) 1, new Vector3f(3, -1f, -2));
            setCurrencyLine("left", (byte) 0, (byte) 2, new Vector3f(3, -1f, -1f));
        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("top")) {
            //topleft
            setCurrencyLine("top", (byte) 2, (byte) 3, new Vector3f(2.25f, 4f, -2));
            setCurrencyLine("top", (byte) 1, (byte) 3, new Vector3f(2.25f, 4f, -1));

            //topright
            setCurrencyLine("top", (byte) 2, (byte) 0, new Vector3f(.75f, 4f, -2));
            setCurrencyLine("top", (byte) 1, (byte) 0, new Vector3f(.75f, 4f, -1));


            setCurrencyLine("top", (byte) 2, (byte) 1, new Vector3f(1, 4.5f, -1));
            setCurrencyLine("top", (byte) 2, (byte) 2, new Vector3f(2,4.5f,-1));
            setCurrencyLine("top", (byte) 1, (byte) 1, new Vector3f(1, 4.5f, -2));
            setCurrencyLine("top", (byte) 1, (byte) 2, new Vector3f(2,4.5f,-2));
        }

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {
            //bottomleft
            setCurrencyLine("bottom", (byte) 1, (byte) 3, new Vector3f(3, -1f, -2));
            setCurrencyLine("bottom", (byte) 2, (byte) 3, new Vector3f(3, -1f, -1f));

            //bottomright
            setCurrencyLine("bottom", (byte) 1, (byte) 0, new Vector3f(0, -1f, -1));
            setCurrencyLine("bottom", (byte) 2, (byte) 0, new Vector3f(0, -1f, -2));

            setCurrencyLine("bottom", (byte) 1, (byte) 1, new Vector3f(1, -1, -2));
            setCurrencyLine("bottom", (byte) 1, (byte) 2, new Vector3f(2,-1f,-2));
            setCurrencyLine("bottom", (byte) 2, (byte) 1, new Vector3f(1, -2, -1));
            setCurrencyLine("bottom", (byte) 2, (byte) 2, new Vector3f(2,-2f,-1));
        }

    }

    @Override
    public void makeExports(){

        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")) {

            HashMap<String, Vector3f> eyeRight = new HashMap<>();

            eyeRight.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]));
            eyeRight.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 10).vertices[0]));
            eyeRight.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 10).vertices[0]));
            eyeRight.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 6).vertices[0]));
            eyeRight.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]));
            eyeRight.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 10).vertices[0]));
            eyeRight.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 10).vertices[0]));
            eyeRight.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 6).vertices[0]));

            exports.put("EyeRight", eyeRight);
//            exports.put("EyeRight", eyeRight);
//
//
//            exports.put("EyeRight", new Vector3f[]{
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 6).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(2, 10).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 10).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]) // 4 right, 12 Up
//            });
        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")) {


            HashMap<String, Vector3f> eyeLeft = new HashMap<>();

            eyeLeft.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 6).vertices[0]));
            eyeLeft.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 10).vertices[0]));
            eyeLeft.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 10).vertices[0]));
            eyeLeft.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]));
            eyeLeft.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 6).vertices[0]));
            eyeLeft.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 10).vertices[0]));
            eyeLeft.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 10).vertices[0]));
            eyeLeft.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]));

            exports.put("EyeLeft", eyeLeft);

//            exports.put("EyeLeft", new Vector3f[]{
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 10).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 10).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(14, 6).vertices[0]) // 4 right, 12 Up
//            });
        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

            HashMap<String, Vector3f> neck = new HashMap<>();

            neck.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 0).vertices[0]));
            neck.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 8).vertices[0]));
            neck.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 8).vertices[0]));
            neck.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 0).vertices[0]));
            neck.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 0).vertices[0]));
            neck.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 8).vertices[0]));
            neck.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 8).vertices[0]));
            neck.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 0).vertices[0]));


            exports.put("Neck", neck);
//            exports.put("Neck", new Vector3f[]{
//                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 0).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(4, 8).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 8).vertices[0]),
//                    new Vector3f(Objects.requireNonNull(sides.get("bottom")).getMeshFromValue(12, 0).vertices[0])
//            });
        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")){


            HashMap<String, Vector3f> nose = new HashMap<>();

//            add(0,0, 1));
//            corners1.put("frontTopLeft", (Objects.requireNonNull(head.exports.get("Nose"))[2]).add(-.125f,-.25f, .5f));
//            corners1.put("frontTopRight", (Objects.requireNonNull(head.exports.get("Nose"))[1]).add(.125f,-.25f,.5f));
//            corners1.put("frontBottomRight", (Objects.requireNonNull(head.exports.get("Nose"))[0]).add(0,0,1));

            nose.put("frontBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 2).vertices[0]).add(0,0,1));
            nose.put("frontTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]).add(-.125f,-.25f, .5f));
            nose.put("frontTopRight",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]).add(.125f,-.25f,.5f));
            nose.put("frontBottomRight", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 2).vertices[0]).add(0,0,1));
            nose.put("backBottomLeft", new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 2).vertices[0]));
            nose.put("backTopLeft",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]));
            nose.put("backTopRight",  new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]));
            nose.put("backBottomRight",new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 2).vertices[0]));


            exports.put("Nose", nose);
//            exports.put("Nose", new Vector3f[]{
//                new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 2).vertices[0]),
//                        new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(6, 6).vertices[0]),
//                        new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 6).vertices[0]),
//                        new Vector3f(Objects.requireNonNull(sides.get("front")).getMeshFromValue(10, 2).vertices[0])
//            });
        }

    }
}
