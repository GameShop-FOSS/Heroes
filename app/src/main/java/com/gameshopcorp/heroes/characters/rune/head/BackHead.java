package com.gameshopcorp.heroes.characters.rune.head;

import com.gameshopcorp.heroes.graphics.SuperCube;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.HashMap;

public class BackHead extends SuperCube {
    public BackHead(SimpleApplication app, Vector3f axis, Node node, HashMap<String, Vector3f> imports, String[] renderSides) {
        super(app, axis, node, imports, renderSides);
    }

    @Override
    public void make() {

        //back
        updateCurrencyLine("bottom", (byte) 3, (byte) 0, new Vector3f(.5f,.5f,.5f));
        updateCurrencyLine("bottom", (byte) 3, (byte) 3, new Vector3f(-.5f,.5f,.5f));

        //front
        updateCurrencyLine("bottom", (byte) 0, (byte) 0, new Vector3f(.5f,0,0));
        updateCurrencyLine("bottom", (byte) 0, (byte) 3, new Vector3f(-.5f,0,0));
    }
}
