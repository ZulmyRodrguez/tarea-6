package com.mycompany.ejercicio3;
import com.mycompany.ejercicio3.Ingeniero;


public class MainIngeniero {

    
    public static void main(String[] args) {
        Ingeniero llamado=new Ingeniero ();
        
        llamado.setArea("Produccion industrial");
        llamado.setNombre("Zulmy");
        llamado.setApellido("Rodriguez");
        llamado.setEdad(18);
        llamado.setSexo("Mujer");
        
        System.out.println("Datos expresados");
        System.out.println("Ingenieria"+llamado.getArea());
        System.out.println("Nombre"+llamado.getNombre());
        System.out.println("Apellido"+llamado.getApellido());
        System.out.println("Edad"+llamado.getEdad());
        System.out.println("Sexo"+llamado.getSexo());
        
        // TODO code application logic here
    }
    
}
