/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_Rectangulo;

import java.util.Random;

/**
 *
 * @author sergipons
 */
public class Rectangulo {

    //ATRIBUTS
    private int x1, y1, x2, y2;
    private final static int MIN=0;
    private final static int MAX=100;

    //CONSTRUCTOR
    public Rectangulo(int x1, int y1, int x2, int y2) {
        if ((x1 < x2) && (y1 < y2) && (x1>=Rectangulo.MIN && x1<=Rectangulo.MAX)
                && (x2>=Rectangulo.MIN && x2<=Rectangulo.MAX)&&
                (y1>=Rectangulo.MIN && y1<=Rectangulo.MAX) &&
                (y2>=Rectangulo.MIN && y2<=Rectangulo.MAX))    
        {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("Error cordenades incorrectes!");
        }
    }

    //GETTERS
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    //SETTERS

    public void setX1(int x1) {
        if (x1 < x2) {
            this.x1 = x1;
        } else {
            System.out.println("Error, X2 ha de ser més gran que X1!");
        }

    }

    public void setY1(int y1) {
        if ((y1 < y2)) {
            this.y1 = y1;
        } else {
            System.out.println("Error, Y2 ha de ser més gran que Y1!");
        }
    }

    public void setX2(int x2) {
        if ((x2 > x1)) {
            this.x2 = x2;
        } else {
            System.out.println("Error, X2 ha de ser més gran que X1!");
        }
    }

    public void setY2(int y2) {
        if ((y2 > y1)) {
            this.y2 = y2;
        } else {
            System.out.println("Error, Y2 ha de ser més gran que Y1!");
        }
    }
    public void setX1Y1(int x1,int y1){
        this.setX1(x1);
        this.setY1(y1);
    }
    public void setX2Y2(int x2,int y2){
        this.setX2(x2);
        this.setY2(y2);
    }
    public void setAll(int x1,int y1,int x2, int y2){
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
    }
    
    //METODES
    @Override
    public String toString() {
        return "Rectangulo{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }

    public double getPerimetro() {
        int costat1 = Math.abs(this.x1 - this.x2);
        int costat2 = Math.abs(this.y1 - this.y2);
        return (costat1 + costat2) * 2;
    }

    public double getArea()
    {
        int base = Math.abs(this.x1 -this.x2);
        int altura = Math.abs(this.y1-this.y2);
        return base * altura;
    }
    public void imprimir(){
        System.out.println(this.toString());
        System.out.printf("Perimetre=%.2f\n",this.getPerimetro());
        System.out.printf("Area=%.2f\n",this.getArea());
    }
    public static Rectangulo generarRectangulo(){
        Random aleatori = new Random();
        int a,b,c,d;
        a=aleatori.nextInt(Rectangulo.MAX+1);
        b=aleatori.nextInt(Rectangulo.MAX+1);
        c=Math.min(100,a+aleatori.nextInt(Rectangulo.MAX));
        d=Math.min(100,b+aleatori.nextInt(Rectangulo.MAX));
        Rectangulo rect = new Rectangulo(a,b,c,d);
        return rect;
    }
    

}
