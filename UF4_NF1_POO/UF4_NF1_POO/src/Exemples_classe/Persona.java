/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemples_classe;

/**
 *
 * @author sergipons
 */
public class Persona {
    //VARIABLES
    private String nom;
    private int edat;
    private boolean vestit;
    //FUNCIONS
    //Getters - Per llegir valors
    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    
    
    //Setters  - Per escriure valors
    public void setNom(String nom) {
        this.nom=nom;
    }
    public void setEdat(int edat) {
        if(edat>0){
            this.edat = edat;
        }
        else{
            System.out.println("L'edat no pot ser negativa");
        }
    }
    public void setVestit(boolean vestit) {
        this.vestit = vestit;
    }
    //FÇUNCIONS
    public void imprimeNombre(){
        System.out.println(nom);
    }
    boolean esMayorEdad(){
        return(edat>=18);
    }
    public void vesteixte(){
        this.vestit=true;
    }
    public void desvesteixte(){
        this.vestit=false;
    }
    public void esVestit(){
        if(this.vestit){
            System.out.println("La persona va vestida");
        }
        else{
            System.out.println("La persona va despullada");
        }
    }
    //CONSTRUCTORS
    public Persona(String nom,int edat,boolean vestit)
    {
        this.nom=nom;
        this.edat=edat;
        this.vestit=vestit;
    }
    public Persona()
    {
        
    }
    public Persona(String nom)
    {
        this.nom=nom;
    }
    public Persona(int edat)
    {
        this.edat=edat;
    }
    public static void main(String[] args) {
        
    }
    
    
    
}
    



