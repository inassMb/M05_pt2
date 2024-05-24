/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_A1_Punto;

/**
 *
 * @author sergipons
 */
public class Programa {
    public static void main(String[] args) {
        Punto A = new Punto(5,0);
        Punto B = new Punto(3,2);
        Punto C = new Punto(-2,4);
        A.imprime();
        B.imprime();
        C.imprime();
        System.out.println("modifico 1r punt");
        A.setXY(-3, -4);
        A.imprime();
        B.imprime();
        C.imprime();
        System.out.println("Desplaço (2,1) el segon punt");
        B.desplaza(2, 1);
        A.imprime();
        B.imprime();
        C.imprime();
        Punto D = Punto.creaPuntoAleatorio();
        System.out.println("Calculem distancia 3r punt a punt"
                + " aleatori ");
        D.imprime();
        System.out.printf("Distancia = " + C.distancia(D));
    }
}
