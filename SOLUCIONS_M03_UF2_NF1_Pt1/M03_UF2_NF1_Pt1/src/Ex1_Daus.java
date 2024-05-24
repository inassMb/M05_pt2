
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergipons
 */
public class Ex1_Daus {
    //Programa principal
    public static void main(String[] args) {
        //definim variables
        int saldo=10,dau1,dau2,aposta;
        //la lògica del programa
        do{
            aposta=quantitat_apostada(saldo);
            dau1=tirada_dau();
            dau2=tirada_dau();
            mostrar_tirada(dau1, dau2);
            saldo=saldo-aposta+calcular_premi(dau1, dau2, aposta);            
        }while(seguir_jugant(saldo)&&(dau1!=6 || dau2!=6));
        //mostrem els resultats de la partida
        if(saldo==0){
            System.out.println("T'has quedat sense saldo!");
        }
        else if(saldo>30){
            System.out.println("No pots guanyar més de 30 monedes. El joc s'ha "
                    + "acabat amb un saldo de 30 monedes.");
        }
        else{
            System.out.println("Enhorabona, has guanyat aconseguint dos 6's!!");
            System.out.printf("El teu saldo és de %d\n",saldo);
        }
    }
    //FUNCIONS
    public static int quantitat_apostada(int saldo){
        //definició variables
        Scanner entrada = new Scanner(System.in);
        int aposta;
        //validació aposta
        do{
            System.out.printf("El teu saldo és de %d\n",saldo);
            System.out.print("Quina quantitat vols apostar? ");
            aposta=entrada.nextInt();
            if(aposta<=0 || aposta>saldo){
                System.out.println("L'aposta no pot ser superior al saldo!!! Tornem-hi!");
            }
        }while(aposta<=0 || aposta>saldo);
        //retorna la quantitat apostada
        return aposta;
    }
    
    public static int tirada_dau(){
        //generem aleatori i es retorna a la funció
        Random aleatori = new Random();
        return aleatori.nextInt(6)+1;
    }
    
    public static void mostrar_tirada(int dau1,int dau2){
        //mostrem per pantalla el valor dels 2 daus
        System.out.printf("***************************\n");
        System.out.printf("* Dau1: %d *\n",dau1);
        System.out.printf("* Dau2: %d *\n",dau2);
        System.out.printf("***************************\n");
    }
    
    public static int calcular_premi(int dau1, int dau2, int aposta){
        //definim variable premi
        int premi;
        //calculem el premi
        if(dau1==6 && dau2==6){
            premi=3*aposta;
        }
        else if((dau1+dau2)==10){
            premi=aposta+4;
        }
        else if(dau1==dau2){
            premi=aposta;
        }
        else{
            premi=0;
        }
        //retornem el valor del premi
        return premi;
    }
    
    public static boolean seguir_jugant(int saldo){
        //en funció dels límits retornem true o false a seguir jugant!
        if(saldo<=0 || saldo>=30){
            return false;
        }
        else{
            return true;
        }
    }
    
}
