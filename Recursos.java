
package com.mycompany.ejercicio2;

/**
 *
 * @author Latitude 3330
 */
public class Recursos {
  
    public void metodoAprendiendo(){
        System.out.println("Estoy aprendiendo,pero sere mejor programador");
     
    }
    public void metodoEdad(float edad){
        if(edad>=18){
            System.out.println("Mayor de edad");
        }
        else {
            System.out.println("Menor de edad");
        }
    }
    public void metodoMuntiplicacion(double num1,double num2 ){
        double total;
        total=num1+num2;
        System.out.println("El total de la multiplicacion es"+total);
    }
    public void metodoRetorno(float numeroX){
        for(int i=1;i<=numeroX;i++)
        {
            System.out.println("Numeros"+i);
        }
        
    }
}
