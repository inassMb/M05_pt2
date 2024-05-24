/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_A1_Punto;

import java.util.Random;

/**
 *
 * @author sergipons
 */
public class Punto {
    private int x;
    private int y;
    //CONSTRUCTOR
    public Punto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    //GETTERS

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //SETTERS

    public void setX(int x) {
        if(x<-5 || x>5){
            System.out.println("Punt fora del rang");
        }
        else{
            this.x = x;
        }
    }

    public void setY(int y) {
        if(y<-5 || y>5){
            System.out.println("Punt fora del rang");
        }
        else{
            this.y = y;
        }
    }
    //METODES
    public void imprime(){
        System.out.printf("(%d,%d)\n",
            this.getX(),this.getY());
    }
    public void setXY(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public void desplaza(int dx, int dy) 
    {
        this.x+=dx;
        this.y+=dy;
    }
    public double distancia(Punto p)
    {
        return Math.sqrt(Math.pow(this.x-p.getX(),2)+
                Math.pow(this.y-p.getY(), 2));
    }
    public static Punto creaPuntoAleatorio(){
        Random aleatori = new Random();
        Punto Paleatori = new Punto
        (aleatori.nextInt(-99, 100),
        aleatori.nextInt(-99, 100));
        return Paleatori;
    }
}
