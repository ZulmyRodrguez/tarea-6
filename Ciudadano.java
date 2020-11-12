
package com.mycompany.ejercicioencapsulamiento;


public class Ciudadano {
private int  Edad;
private String Nombre;
private double AniosDeExperencia;

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getAniosDeExperencia() {
        return AniosDeExperencia;
    }

    public void setAniosDeExperencia(double AniosDeExperencia) {
        this.AniosDeExperencia = AniosDeExperencia;
    }
       
}

