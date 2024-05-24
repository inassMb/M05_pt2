/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2_Persona;

import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author sergipons
 */
public class Persona {

    private final String dni;
    private String nom;
    private String cognom;
    private int edat;
    private static final int MAJORIAEDAT = 18;

    //CONSTRUCTORS
    public Persona(String dni, String nom, String cognom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    //GETTERS
    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    //SETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    //Metodes
    public void imprime() {
        System.out.printf("%s %s amb DNI %s te %d anys!\n",
                nom, cognom, dni, edat);
    }

    public boolean esMajorEdat() {
        if (edat >= MAJORIAEDAT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        if (edat >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public int diferenciaEdad(Persona p) {
        if (edat >= p.edat) {
            return edat - p.edat;
        } else {
            return p.edat - edat;
        }
    }

    public static boolean validarDNI(String valor) {
        String dniRegex = "\\d{4}[A-Z]";
        return Pattern.matches(dniRegex, valor);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + '}';
    }
    
    

}
