/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

import java.util.Scanner;
import com.mycompany.ejercicio2.Recursos;

/**
 *
 * @author Latitude 3330
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Recursos control=new Recursos();
        Scanner clase=new Scanner(System.in );
        control.metodoAprendiendo();
        System.out.println("Escriba su edad : ");
        float edad=clase.nextFloat();
        control.metodoEdad(edad);
        System.out.println("Escriba un numero:");
        double numero=clase.nextDouble();
        System.out.println("Escriba un numero:");
        double numero2=clase.nextDouble();   
        control.metodoMuntiplicacion(numero, numero2);
        System.out.println("Ingrese numero x para generar numeros");
        float numerox=clase.nextFloat();
        control.metodoRetorno(numerox); 
    }
    
}
