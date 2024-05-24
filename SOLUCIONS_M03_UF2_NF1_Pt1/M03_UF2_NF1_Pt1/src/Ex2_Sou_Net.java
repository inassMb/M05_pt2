
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergipons
 */
public class Ex2_Sou_Net {
    //Programa principal
    public static void main(String[] args) {
        //definim variables
        Scanner entrada = new Scanner(System.in);
        int sou_brut;
        do{
            System.out.printf("Introdueix sou brut: ");
            sou_brut=entrada.nextInt();
            if(sou_brut<0){
                System.out.println("El sou no pot ser negatiu! Torna-hi!");
            }
        }while(sou_brut<0);
        //desenvolupament programa
        mostrarResultats(calculRetencio(sou_brut,calculPercentatgeIRPF(sou_brut)));
        
    }
    
    //FUNCIONS
    public static double calculPercentatgeIRPF(int sou_brut){
        //definim variables
        double retencio;
        //assignem valor a la retenció en funció sou_brut
        if(sou_brut<10000){
            retencio=2;
        }
        else if(sou_brut>=10000 && sou_brut<15000){
            retencio=11.5;
        }
        else if(sou_brut>=15000 && sou_brut<30000){
            retencio=15;
        }
        else if(sou_brut>=30000 && sou_brut<45000){
            retencio=18.5;
        }
        else{
            retencio=22;
        }
        //retornem el valor de la retenció
        return retencio;        
    }
    
    public static double calculRetencio(int sou_brut,double retencio){
        //definim variables
        double sou_net;
        //mostrem valors
        System.out.printf("El sou brut és de %d\n",sou_brut);
        System.out.printf("La retenció que s'aplicarà és de %.2f\n",retencio);
        //calculem sou net
        sou_net=sou_brut*(1-retencio/100);
        //retornem valor funció
        return sou_net;
    }
    
    public static void mostrarResultats(double sou_net){
        //definim variables i calculem valors
        double paga12=sou_net/12;
        double paga14=sou_net/14;
        //mostres informació
        System.out.println("Pots escollir si repartir el sou amb:");
        System.out.printf("Opció 1: 12 pagues de %.2f\n",paga12);
        System.out.printf("Opció 2: 12 pagues de %.2f i 2 pagues dobles del mateix import\n",paga14);        
    }
}
