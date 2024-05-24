/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3_Rectangulo;

/**
 *
 * @author sergipons
 */
public class Programa {

    public static void main(String[] args) {
        Rectangulo A = new Rectangulo(0,0,5,5);
        Rectangulo B = new Rectangulo(7,9,2,3);
        
        A.imprimir();
        System.out.println("----------------------------");
        B.imprimir();
        System.out.println("----------------------------");
        System.out.println("Es modifiquen dades dels rectangles");
        System.out.println("----------------------------");
        A.setX1Y1(2,4);
        A.setX2Y2(3,8);
        B.setAll(-2,-2,8,9);
        A.imprimir();
        System.out.println("----------------------------");
        B.imprimir();
        System.out.println("----------------------------");
        System.out.println("Genero un rectangle aleatori");
        System.out.println("----------------------------");
        Rectangulo C = Rectangulo.generarRectangulo();
        C.imprimir();

    }

}
