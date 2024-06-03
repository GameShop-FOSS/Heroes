package com.gameshopcorp.heroes.graphics;

import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;

public class CurrencyLine {

    public Vector3f[] points;
    public Vector3f[] infinitesimals;
    public CurrencyLine(Vector3f[] points, byte numPoints){

        this.points = new Vector3f[4];
        this.points[0] = new Vector3f(points[0]);
        this.points[1] = new Vector3f(points[1]);
        this.points[2] = new Vector3f(points[2]);
        this.points[3] = new Vector3f(points[3]);

        infinitesimals = new Vector3f[numPoints + 1];

        for (int i = 0; i <= numPoints; i++){
            infinitesimals[i] = new Vector3f(FastMath.interpolateBezier((float)i/numPoints, this.points[0], this.points[1], this.points[2], this.points[3]));
        }
    }



}