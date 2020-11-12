
package Clases;
import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Linea;
import Clases.Triangulo;
import java.util.Scanner;


public class Mainformas {
    

    public static void main(String[] args) {

        Circulo llamaci=new Circulo();
        Cuadrado llamacu=new Cuadrado();
        Linea llamali=new Linea();
        Triangulo llamatri=new Triangulo();
        Scanner llamasca=new Scanner(System.in);
        
        System.out.println(" Figura 1 ");
        llamaci.Dibujar();
        System.out.println(" ingrese un valor para calcular el radio ");
        double Radio=llamasca.nextDouble();
        llamaci.CalcularRadio(Radio);
        
        System.out.println("");
        System.out.println(" Figura 2 ");
        llamacu.Dibujar();
        System.out.println(" Ingrese un valor para calcular el area ");
        double Area=llamasca.nextDouble();
        llamacu.CalcularArea(Area);
        
        System.out.println("");
        System.out.println(" Figura 3 ");
        llamali.Dibujar();
        
        System.out.println("");
        System.out.println(" Figura 4 ");
        llamatri.Dibujar();
        System.out.println(" Ingrese la base para calcular el area del triangulo ");
        double Base=llamasca.nextDouble();
        System.out.println(" Ingrese la altura para calcular el area del triangulo ");
        double Altura=llamasca.nextDouble();
        llamatri.CalcularArea(Base, Altura);
        
        
        
        
       
                
               
                
                
                
        
        
    }
    
}
