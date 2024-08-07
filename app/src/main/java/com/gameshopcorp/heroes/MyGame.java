package com.gameshopcorp.heroes;

import com.gameshopcorp.heroes.characters.legacyrune.Rune;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;

import jme3tools.optimize.GeometryBatchFactory;

import de.lessvoid.nifty.Nifty;

/**
 * @author gameshopcorp
 */
public final class MyGame extends SimpleApplication {


    private Nifty nifty;


    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(true);
        //for (int i = 0; i < 2; i++) {
        //Front:0

//    SuperCube superCube = new SuperCube(this, new Vector3f(), getRootNode(), null, new String[]{"front"}){
//            @Override
//            public void make() {
//                super.make();
//                modCurrencyLine("front", (byte) 0, (byte) 0,new Vector3f(-4,0,0));
//
//            }
//        };
//        superCube.make();

         Rune rune = new Rune(this);
         GeometryBatchFactory.optimize(getRootNode());
       // }
        //Publishing To Google Play Store
        //com.google.android.gms.permission.AD_ID
        //SuperCube superCube = new SuperCube(this, new Vector3f(), getRootNode(), null, new String[]{"all"});
        getViewPort().setBackgroundColor(ColorRGBA.Black);

    }

}
