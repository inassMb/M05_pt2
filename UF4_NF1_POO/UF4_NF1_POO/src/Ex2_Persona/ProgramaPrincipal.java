/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_Persona;

import java.util.Scanner;

/**
 *
 * @author sergipons
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona[] lista = new Persona[2];
        String dni,nom,cognom;
        int edat;
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Persona "+(i+1));
            System.out.print("DNI: ");
            dni=entrada.next();
            System.out.print("Nom: ");
            nom=entrada.next();
            System.out.print("Cognom: ");
            cognom=entrada.next();
            System.out.print("Edat: ");
            edat=entrada.nextInt();
            if(Persona.validarDNI(dni)){
                Persona A = new Persona(dni,nom,cognom,edat);
                lista[i]=A;
            }
            else{
                System.out.println("El DNI no és correcte i no es pot afegir la persona");
            }
            
        }
        System.out.println("Llistat de les persones afegides: ");
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].esMajorEdat())
            {
                System.out.printf("%s %s amb DNI %s es major d'edat!\n",
                        lista[i].getNom(),lista[i].getCognom(),
                        lista[i].getDni());
            }
            else{
                System.out.printf("%s %s amb DNI %s NO es major d'edat!\n",
                        lista[i].getNom(),lista[i].getCognom(),
                        lista[i].getDni());
            }
        }
        //modifiquem usuari 1
        System.out.println("Modifiquem dades Persona 1");
        System.out.println("DNI actual: " + lista[0].getDni());        
        System.out.println("Nom actual: " + lista[0].getNom());        
        System.out.print("Nou nom: ");
        lista[0].setNom(entrada.next());
        System.out.println("Cognom actual: " + lista[0].getCognom());        
        System.out.print("Nou Cognom: ");
        lista[0].setCognom(entrada.next());
        System.out.println("Edat actual: " + lista[0].getEdat());        
        System.out.print("Nova edat: ");
        lista[0].setEdat(entrada.nextInt());
        //Mostrem dades usuari 1
        System.out.println("Dades Persona 1 que s'ha modificat: ");
        lista[0].imprime();
        //diferencia edat
        System.out.printf("La diferencia edat entre persona 1 i "
                + "Persona 2 es: %d\n",lista[0].diferenciaEdad(lista[1]));
        //comparo persones
        if(lista[0].equals(lista[1])){
            System.out.println("les 2 persones son iguals");
        }
        else{
            System.out.println("Les persones son diferents");
        }
        //llistat usuaris
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].toString());    
        }
        
    }
}
