package com.gameshopcorp.heroes.characters.legacyrune.head;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.Arrays;
import java.util.HashMap;

public class Nose extends SuperCube {
//    CurrencyMesh front;
//    CurrencyMesh back;
//    CurrencyMesh left;
//    CurrencyMesh right;
//    CurrencyMesh bottom;
//    CurrencyMesh top;
//    SimpleApplication app;
//
//    CurrencyLine frontTop;
//    CurrencyLine frontBottom;
//    CurrencyLine frontRight;
//    CurrencyLine frontLeft;
//
//    CurrencyLine backTop;
//    CurrencyLine backBottom;
//    CurrencyLine backRight;
//    CurrencyLine backLeft;
//
//    CurrencyLine topRight;
//    CurrencyLine topLeft;
//    CurrencyLine bottomLeft;
//    CurrencyLine bottomRight;
//
//    public Vector3f axis;
//
//    Node node;
    public Nose(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides) {
        super(app, axis, node, imports, renderSides);

       // make();
    }

    @Override
    public void make(){
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("front")) {

          //  modCurrencyLine("front", 3,1,sides.get("front").currencyLines[3].points[1].);
        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("back")) {

        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("left")) {

        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("right")) {

        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("top")) {

        }
        if (Arrays.asList(renderSides).contains("all") || Arrays.asList(renderSides).contains("bottom")) {

        }

    }
//    public void addEdgeCurrencyLines() {
//
//
//    }


}
