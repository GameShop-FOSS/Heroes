package com.gameshopcorp.heroes.characters.rune;

import com.gameshopcorp.heroes.characters.rune.body.Neck;
import com.gameshopcorp.heroes.characters.rune.body.Torso;
import com.gameshopcorp.heroes.characters.rune.head.Eye;
import com.gameshopcorp.heroes.characters.rune.head.Head;
import com.gameshopcorp.heroes.characters.rune.head.Nose;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.HashMap;
import java.util.Objects;

public class Rune {

    public Rune(SimpleApplication app){

        Node headNode = new Node("Head");

        HashMap<String, Vector3f> corners = new HashMap<>();
        corners.put("frontBottomLeft", (new Vector3f(.5f,-1,0)));
        corners.put("frontTopLeft", new Vector3f(.75f, 3,0));
        corners.put("frontTopRight", (new Vector3f(2.25f,3,0)));
        corners.put("frontBottomRight", (new Vector3f(2.5f,-1,0)));
        corners.put("backBottomLeft", (new Vector3f(.75f,1,-3)));
        corners.put("backTopLeft", (new Vector3f(.75f,3,-3)));
        corners.put("backTopRight", (new Vector3f(2.25f,3,-3)));
        corners.put("backBottomRight", (new Vector3f(2.25f,1,-3)));

        //Axis Should Be Average Of All The Corners
    Head head = new Head(app, new Vector3f(1.5f, 1.5f, -1.5f), headNode, corners, new String[]{"all"});

  //  head.updateUsingNormalAngleCurrencyLine("front", (byte) 0, (byte) 0, new Vector3f(180f,180f,90f),5);
//    head.updateUsingNormalAngleCurrencyLine("front", (byte) 1, (byte) 0, new Vector3f(0f,1f,0f));
//    head.updateUsingNormalAngleCurrencyLine("front", (byte) 1, (byte) 0, new Vector3f(0f,1f,0f));

        Node noseNode = new Node("Nose");

        Nose nose = new Nose(app, new Vector3f(), noseNode, head.exports.get("Nose"), new String[]{"all"});// CHANGE BEFORE RUNNING

        headNode.attachChild(noseNode);

//        Node hairTopNode = new Node("HairTop");
//        Hair hairTop = new Hair(app, new Vector3f(), hairTopNode);
//       // hairTopNode.scale(.75f,1.5f,.75f);
//        hairTopNode.scale(1.5f);
//        hairTopNode.scale(1.1f, 1.25f,1.1f);
//        hairTopNode.move(-1,5,-1.5f);
//        hairTopNode.rotate(-45,0,0);
//         headNode.attachChild(hairTopNode);
//
//        Node hairBottomLeftNode = new Node("HairBottomLeft");
//        Hair hairBottomLeft = new Hair(app, new Vector3f(), hairBottomLeftNode);
//        // hairTopNode.scale(.75f,1.5f,.75f);
//        hairBottomLeftNode.scale(1.5f);
//        hairBottomLeftNode.scale(1.1f, 1.25f,1.1f);
//        hairBottomLeftNode.move(-1,2,-1.5f);
//        hairBottomLeftNode.rotate(-115,45,0);
//        headNode.attachChild(hairBottomLeftNode);
//
//        Node hairBottomRightNode = new Node("HairBottomRight");
//        Hair hairBottomRight = new Hair(app, new Vector3f(), hairBottomRightNode);
//        // hairTopNode.scale(.75f,1.5f,.75f);
//        hairBottomRightNode.scale(1.5f);
//        hairBottomRightNode.scale(1.1f, 1.25f,1.1f);
//        hairBottomRightNode.move(1,2,-5.5f);
//        hairBottomRightNode.rotate(-115,-45,0);
//        headNode.attachChild(hairBottomRightNode);


        Node eyeLeftNode = new Node("EyeLeft");
        Eye eyeLeft = new Eye(app, new Vector3f(), eyeLeftNode, head.exports.get("EyeLeft"), new String[]{"front"}, "left");
//        eyeLeftNode.scale(.25f);
        eyeLeftNode.move(0,0,.1f);
        headNode.attachChild(eyeLeftNode);


        Node eyeRightNode = new Node("EyeRight");
        Eye eyeRight = new Eye(app, new Vector3f(), eyeRightNode, head.exports.get("EyeRight"), new String[]{"front"}, "right");
        //eyeRightNode.scale(.25f);
        eyeRightNode.move(0,0,.1f);
        headNode.attachChild(eyeRightNode);

        Node neckNode = new Node("Neck");
        Neck neck = new Neck(app, new Vector3f(), neckNode, head.exports.get("Neck"), new String[]{"all"});
        headNode.attachChild(neckNode);

        Node torsoNode = new Node("Torso");
        Torso torso = new Torso(app, new Vector3f(), torsoNode, neck.exports.get("Torso"), new String[]{"all"});
        neckNode.attachChild(torsoNode);




        //headNode.rotate(0,90,0);
        Node runeNode = new Node("Rune");
        runeNode.attachChild(headNode);
        app.getRootNode().attachChild(runeNode);
        //SuperCube superCube = new SuperCube(app, new Vector3f(), app.getRootNode());
    }
}
