package com.gameshopcorp.heroes.graphics;

import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture2D;

import java.nio.ByteBuffer;
public class CurrencyMesh {

    public CurrencyLine[] vInfinitesimals;
    public SimpleMesh[] simpleMeshes;

    public float width;
    public float height;


//    public CurrencyMesh(SimpleApplication app, CurrencyLine[] currencyLines, Texture2D texture2D, Node node){
//
//        float dim = 3;
//
//        width = currencyLines[0].points[currencyLines[0].points.length - 1].x - currencyLines[0].points[0].x;
//        height = currencyLines[currencyLines.length - 1].points[0].y - currencyLines[0].points[0].y;
//        this.vInfinitesimals = new CurrencyLine[currencyLines[0].infinitesimals.length];
//
//        for (int i = 0; i < this.vInfinitesimals.length; i++){
//
//            this.vInfinitesimals[i] = new CurrencyLine(new Vector3f[]{currencyLines[0].infinitesimals[i], currencyLines[1].infinitesimals[i], currencyLines[2].infinitesimals[i], currencyLines[3].infinitesimals[i]}, (byte)16);
//
//        }
//
//        int imageArray = 1;
//
//        width = this.vInfinitesimals.length;
//        height = this.vInfinitesimals[0].infinitesimals.length;
//
//        imageArray = (int)width * (int)height;
//
//        simpleMeshes = new SimpleMesh[imageArray];
//
//        for (int y = 0; y < this.vInfinitesimals.length - 1; y++){
//            for (int x = 0; x < this.vInfinitesimals[0].infinitesimals.length - 1; x++){
//
//                Vector3f[] simpleMesh = new Vector3f[4];
////                simpleMesh[0] = this.vInfinitesimals[y].infinitesimals[x];
////                simpleMesh[1] = this.vInfinitesimals[y].infinitesimals[x + 1];
////                simpleMesh[2] = this.vInfinitesimals[y + 1].infinitesimals[x];
////                simpleMesh[3] = this.vInfinitesimals[y + 1].infinitesimals[x + 1];
//                simpleMesh[0] = this.vInfinitesimals[y].infinitesimals[x];
//                simpleMesh[1] = this.vInfinitesimals[y + 1].infinitesimals[x];
//                simpleMesh[2] = this.vInfinitesimals[y].infinitesimals[x + 1];
//                simpleMesh[3] = this.vInfinitesimals[y + 1].infinitesimals[x + 1];
//                Vector2f[] texCoord = new Vector2f[4];
//                texCoord[0] = new Vector2f( new Vector2f(this.vInfinitesimals[y].infinitesimals[x].x/width,this.vInfinitesimals[y].infinitesimals[x].y/height)); // new Vector2f(0,0);
//                texCoord[1] = new Vector2f( new Vector2f(this.vInfinitesimals[y + 1].infinitesimals[x].x/width,this.vInfinitesimals[y + 1].infinitesimals[x].y/height));//new Vector2f(1,0);
//                texCoord[2] = new Vector2f( new Vector2f(this.vInfinitesimals[y].infinitesimals[x + 1].x/width,this.vInfinitesimals[y].infinitesimals[x + 1].y/height));//new Vector2f(0,1);
//                texCoord[3] = new Vector2f( new Vector2f(this.vInfinitesimals[y + 1].infinitesimals[x + 1].x/width,this.vInfinitesimals[y + 1].infinitesimals[x + 1].y/height));//new Vector2f(1,1);
//                simpleMeshes[(this.vInfinitesimals[0].infinitesimals.length * y) + x] = new SimpleMesh(app, simpleMesh, texCoord, texture2D, node);
//
//
//            }
//        }
//
//    }

    public CurrencyMesh(SimpleApplication app, CurrencyLine[] currencyLines, Texture2D texture, Node node){

        float dim = 3;

        width = currencyLines[0].points[currencyLines[0].points.length - 1].x - currencyLines[0].points[0].x;
        height = currencyLines[currencyLines.length - 1].points[0].y - currencyLines[0].points[0].y;
        this.vInfinitesimals = new CurrencyLine[currencyLines[0].infinitesimals.length];

        for (int i = 0; i < this.vInfinitesimals.length; i++){

            this.vInfinitesimals[i] = new CurrencyLine(new Vector3f[]{currencyLines[0].infinitesimals[i], currencyLines[1].infinitesimals[i], currencyLines[2].infinitesimals[i], currencyLines[3].infinitesimals[i]}, (byte)16);

        }

        int imageArray = 1;

        width = this.vInfinitesimals.length;
        height = this.vInfinitesimals[0].infinitesimals.length;

        imageArray = (int)width * (int)height;

        simpleMeshes = new SimpleMesh[imageArray];

        int maxX = this.vInfinitesimals[0].infinitesimals.length - 1;
        int maxY = this.vInfinitesimals.length - 1;
        for (int y = 0; y < maxY; y++){
            for (int x = 0; x < maxX; x++){

                Vector3f[] simpleMesh = new Vector3f[4];
//                simpleMesh[0] = this.vInfinitesimals[y].infinitesimals[x];
//                simpleMesh[1] = this.vInfinitesimals[y].infinitesimals[x + 1];
//                simpleMesh[2] = this.vInfinitesimals[y + 1].infinitesimals[x];
//                simpleMesh[3] = this.vInfinitesimals[y + 1].infinitesimals[x + 1];
                simpleMesh[0] = this.vInfinitesimals[y].infinitesimals[x];
                simpleMesh[1] = this.vInfinitesimals[y + 1].infinitesimals[x];
                simpleMesh[2] = this.vInfinitesimals[y].infinitesimals[x + 1];
                simpleMesh[3] = this.vInfinitesimals[y + 1].infinitesimals[x + 1];
                Vector2f[] texCoord = new Vector2f[4];
//                texCoord[0] = new Vector2f( new Vector2f(this.vInfinitesimals[y].infinitesimals[x].x/width,this.vInfinitesimals[y].infinitesimals[x].y/height)); // new Vector2f(0,0);
//                texCoord[1] = new Vector2f( new Vector2f(this.vInfinitesimals[y + 1].infinitesimals[x].x/width,this.vInfinitesimals[y + 1].infinitesimals[x].y/height));//new Vector2f(1,0);
//                texCoord[2] = new Vector2f( new Vector2f(this.vInfinitesimals[y].infinitesimals[x + 1].x/width,this.vInfinitesimals[y].infinitesimals[x + 1].y/height));//new Vector2f(0,1);
//                texCoord[3] = new Vector2f( new Vector2f(this.vInfinitesimals[y + 1].infinitesimals[x + 1].x/width,this.vInfinitesimals[y + 1].infinitesimals[x + 1].y/height));//new Vector2f(1,1);

                //First Make 0 From First Point Subtraction.  Then Do Distance

                System.out.println("Distance: " + ((this.vInfinitesimals[maxY].infinitesimals[maxX].x) - (this.vInfinitesimals[0].infinitesimals[0].x)));
                System.out.println( (this.vInfinitesimals[0].infinitesimals[0].x)+ " "+ (this.vInfinitesimals[maxY].infinitesimals[maxX].x));
                System.out.println("texCoord[0]: " + "infX " + this.vInfinitesimals[y].infinitesimals[x].x/(this.vInfinitesimals[maxY].infinitesimals[maxX].x) + " infY: " + this.vInfinitesimals[y].infinitesimals[x].y/(this.vInfinitesimals[maxY].infinitesimals[maxX].y));
                Vector2f distance = new Vector2f(((this.vInfinitesimals[maxY].infinitesimals[maxX].x) - (this.vInfinitesimals[0].infinitesimals[0].x)), ((this.vInfinitesimals[maxY].infinitesimals[maxX].y) - (this.vInfinitesimals[0].infinitesimals[0].y)));
                Vector2f base = new Vector2f(this.vInfinitesimals[0].infinitesimals[0].x, this.vInfinitesimals[0].infinitesimals[0].y);
               // Vector2f max = new Vector2f(this.vInfinitesimals[maxY].infinitesimals[maxX].x, this.vInfinitesimals[maxY].infinitesimals[maxX].y);

                //Equation: (current - base) / distance

                texCoord[0] = new Vector2f( new Vector2f(((this.vInfinitesimals[y].infinitesimals[x].x) - base.x) / distance.x,(this.vInfinitesimals[y].infinitesimals[x].y - base.y)/distance.y)); // new Vector2f(0,0);
                texCoord[1] = new Vector2f( new Vector2f(((this.vInfinitesimals[y + 1].infinitesimals[x].x) - base.x) / distance.x,(this.vInfinitesimals[y + 1].infinitesimals[x].y - base.y )/distance.y));//new Vector2f(1,0);
                texCoord[2] = new Vector2f( new Vector2f(((this.vInfinitesimals[y].infinitesimals[x + 1].x) - base.x) / distance.x,(this.vInfinitesimals[y].infinitesimals[x + 1].y - base.y)/distance.y));//new Vector2f(0,1);
                texCoord[3] = new Vector2f( new Vector2f(((this.vInfinitesimals[y + 1].infinitesimals[x + 1].x) - base.x)/distance.x,(this.vInfinitesimals[y + 1].infinitesimals[x + 1].y - base.y)/distance.y));//new Vector2f(1,1);

//                texCoord[0] = new Vector2f( new Vector2f((this.vInfinitesimals[y].infinitesimals[x].x)/(this.vInfinitesimals[maxY].infinitesimals[maxX].x),(this.vInfinitesimals[y].infinitesimals[x].y)/(this.vInfinitesimals[maxY].infinitesimals[maxX].y))); // new Vector2f(0,0);
//                texCoord[1] = new Vector2f( new Vector2f((this.vInfinitesimals[y + 1].infinitesimals[x].x)/(this.vInfinitesimals[maxY].infinitesimals[maxX].x),(this.vInfinitesimals[y + 1].infinitesimals[x].y )/(this.vInfinitesimals[maxY].infinitesimals[maxX].y)));//new Vector2f(1,0);
//                texCoord[2] = new Vector2f( new Vector2f((this.vInfinitesimals[y].infinitesimals[x + 1].x)/(this.vInfinitesimals[maxY].infinitesimals[maxX].x),(this.vInfinitesimals[y].infinitesimals[x + 1].y)/(this.vInfinitesimals[maxY].infinitesimals[maxX].y)));//new Vector2f(0,1);
//                texCoord[3] = new Vector2f( new Vector2f((this.vInfinitesimals[y + 1].infinitesimals[x + 1].x)/(this.vInfinitesimals[maxY].infinitesimals[maxX].x),(this.vInfinitesimals[y + 1].infinitesimals[x + 1].y )/(this.vInfinitesimals[maxY].infinitesimals[maxX].y)));//new Vector2f(1,1);


                simpleMeshes[(this.vInfinitesimals[0].infinitesimals.length * y) + x] = new SimpleMesh(app, simpleMesh, texCoord, texture, node);


            }
        }

    }

//    public CurrencyMesh(SimpleApplication app, SimpleMesh[] simpleMeshes, Texture2D texture2D, Node node){
//
//
//    }
    public SimpleMesh getMeshFromValue(int x, int y){

        return  simpleMeshes[(this.vInfinitesimals[0].infinitesimals.length * x) + y];
    }
}
