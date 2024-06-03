package com.gameshopcorp.heroes.characters.rune;

import com.gameshopcorp.heroes.characters.rune.head.Eye;
import com.gameshopcorp.heroes.characters.rune.head.Hair;
import com.gameshopcorp.heroes.characters.rune.head.Head;
import com.gameshopcorp.heroes.characters.rune.head.Nose;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

public class Rune {

    public Rune(SimpleApplication app){

        Node headNode = new Node("Head");
        Head head = new Head(app, new Vector3f(), headNode);
        Node noseNode = new Node("Nose");
        Nose nose = new Nose(app, new Vector3f(), noseNode);
        noseNode.scale(.25f);
        noseNode.scale(1,2,1);
        noseNode.move(new Vector3f(1.1f, 0f,1.25f));
        headNode.attachChild(noseNode);

        Node hairTopNode = new Node("HairTop");
        Hair hairTop = new Hair(app, new Vector3f(), hairTopNode);
       // hairTopNode.scale(.75f,1.5f,.75f);
        hairTopNode.scale(1.5f);
        hairTopNode.scale(1.1f, 1.25f,1.1f);
        hairTopNode.move(-1,5,-1.5f);
        hairTopNode.rotate(-45,0,0);
        headNode.attachChild(hairTopNode);

        Node hairBottomLeftNode = new Node("HairBottomLeft");
        Hair hairBottomLeft = new Hair(app, new Vector3f(), hairBottomLeftNode);
        // hairTopNode.scale(.75f,1.5f,.75f);
        hairBottomLeftNode.scale(1.5f);
        hairBottomLeftNode.scale(1.1f, 1.25f,1.1f);
        hairBottomLeftNode.move(-1,2,-1.5f);
        hairBottomLeftNode.rotate(-115,45,0);
        headNode.attachChild(hairBottomLeftNode);

        Node hairBottomRightNode = new Node("HairBottomRight");
        Hair hairBottomRight = new Hair(app, new Vector3f(), hairBottomRightNode);
        // hairTopNode.scale(.75f,1.5f,.75f);
        hairBottomRightNode.scale(1.5f);
        hairBottomRightNode.scale(1.1f, 1.25f,1.1f);
        hairBottomRightNode.move(1,2,-5.5f);
        hairBottomRightNode.rotate(-115,-45,0);
        headNode.attachChild(hairBottomRightNode);


        Node eyeLeftNode = new Node("EyeLeft");
        Eye eyeLeft = new Eye(app, new Vector3f(), eyeLeftNode);
        eyeLeftNode.scale(.25f);
        eyeLeftNode.move(.25f,1.25f,1f);
        headNode.attachChild(eyeLeftNode);

        Node eyeRightNode = new Node("EyeRight");
        Eye eyeRight = new Eye(app, new Vector3f(), eyeRightNode);
        eyeRightNode.scale(.25f);
        eyeRightNode.move(1.75f,1.25f,1f);
        headNode.attachChild(eyeRightNode);

        //headNode.rotate(0,90,0);
        Node runeNode = new Node("Rune");
        runeNode.attachChild(headNode);
        app.getRootNode().attachChild(runeNode);
        //SuperCube superCube = new SuperCube(app, new Vector3f(), app.getRootNode());
    }
}
