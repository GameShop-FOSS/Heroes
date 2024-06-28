package com.gameshopcorp.heroes.characters.rune;

import com.gameshopcorp.heroes.characters.rune.head.TopHead;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.HashMap;

public class Rune {

    public Rune(SimpleApplication app){

        Node topHeadNode = new Node("TopHead");

        HashMap<String, Vector3f> corners = new HashMap<>();
        corners.put("frontBottomLeft", (new Vector3f(1.5f,.5f,1f)));
        corners.put("frontTopLeft", new Vector3f(.5f,1.5f,.5f));
        corners.put("frontTopRight", (new Vector3f(-.5f,1.5f,.5f)));
        corners.put("frontBottomRight", (new Vector3f(-1.5f,.5f,1f)));
        corners.put("backBottomLeft", (new Vector3f(1.5f,.5f,-1f)));
        corners.put("backTopLeft", (new Vector3f(.5f,1.5f,-.5f)));
        corners.put("backTopRight", (new Vector3f(-.5f,1.5f,-.5f)));
        corners.put("backBottomRight", (new Vector3f(-1.5f,.5f,-1f)));

        TopHead topHead = new TopHead(app, new Vector3f(), topHeadNode, corners, new String[]{"all"});
        Node runeNode = new Node("Rune");
        runeNode.attachChild(topHeadNode);
        app.getRootNode().attachChild(runeNode);
    }
}
