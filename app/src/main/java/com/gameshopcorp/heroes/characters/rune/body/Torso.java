package com.gameshopcorp.heroes.characters.rune.body;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.HashMap;

public class Torso extends SuperCube {
    public Torso(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides) {
        super(app, axis, node, imports, renderSides);
    }
}
