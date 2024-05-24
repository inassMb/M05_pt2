/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemples_classe;

import java.util.Scanner;

/**
 *
 * @author sergipons
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona[] persones = new Persona[2];
        Persona A = new Persona();
        Persona B = new Persona();
        Persona C = new Persona("Pepito",30,true);
        Persona D = new Persona("Antonio");
        Persona E = new Persona(44);
        //definim les seves variables
        persones[0]=A;
        persones[1]=B;
        for (int i = 0; i < persones.length; i++) {
            System.out.printf("Introduim dades Persona %d:\n",i);
            System.out.print("Nom: ");
            persones[i].setNom(entrada.next());
            System.out.print("Edat: ");
            persones[i].setEdat(entrada.nextInt());
        }
        System.out.println("Imprimim el nom de la 1a persona");
        persones[0].imprimeNombre();
        System.out.println("Mirem si la 2a persona es major edat");
        if(persones[1].esMayorEdad()){
            System.out.println("Es mayor de edat");
        }
        else{
            System.out.println("No es mayor de edat");
        }
        
    }
}
