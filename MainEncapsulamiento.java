
package com.mycompany.ejercicioencapsulamiento;
import com.mycompany.ejercicioencapsulamiento.Ciudadano;
import com.mycompany.ejercicioencapsulamiento.Honduras;
import com.mycompany.ejercicioencapsulamiento.Nicaragua;
import com.mycompany.ejercicioencapsulamiento.Panama;
import java.util.Scanner;

public class MainEncapsulamiento {

    
    public static void main(String[] args) {
      Scanner llamado=new Scanner(System.in);
      Ciudadano principal=new Ciudadano();
      
        System.out.println("Escriba su edad");
        int edad =llamado.nextInt();
        principal.setEdad(edad);
        
        System.out.println ("Escriba su nombre");
        String Nombre=llamado.next();
        principal.setNombre(Nombre);
        
        System.out.println("Escriba sus AniosDeExperiencia");
        double AniosDeExperiencia=llamado.nextDouble();
        principal.setAniosDeExperencia(AniosDeExperiencia);
        
        
        System.out.println("Su edad es "+ principal.getEdad());
        System.out.println("Su nombre es "+ principal.getNombre());
        System.out.println("Sus Años De Experiencia son "+ principal.getAniosDeExperencia());
        
        System.out.println("===================");
        
        System.out.println("A continuacion la parte #2 del ejercicio donde se muestra el nombre del pais con su presidente actual");
        
        Honduras llama=new Honduras("Honduras"," Juan Orlando");
        System.out.println("El nombre del pais es "+llama.getPais());
        System.out.println("El nombre del presidente es "+llama.getPresidente());
        
        Nicaragua llamani=new Nicaragua("Nicaragua"," Daniel Ortega");
        System.out.println("El nombre del pais es "+llamani.getPais());
        System.out.println("El nombre del presidente es "+llamani.getPresidente());
        
        Panama llamapa=new Panama("Panama"," Laurentino Cortizo");
        System.out.println("El nombre del pais es "+llamapa.getPais());
        System.out.println("El nombre del presidente es "+llamapa.getPresidente());
        
      
    }
    
}
