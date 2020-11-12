
package Clases;

public class Cuadrado extends Formas{
    String Area;
    
    public void Dibujar(){
        System.out.println("El nombre de la figura es: Cuadrado ");
    } 
    public void CalcularArea(double lado ){
        double total;
        total=lado*4;
        System.out.println("El area del cuadrado es;"+total);
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    
}
