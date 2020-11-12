
package Clases;

public class Triangulo extends Formas{
    String Angulo;
    public void Dibujar(){
        System.out.println("El nombre de la figura es: Triangulo ");
    }
    public void CalcularArea(double base,double altura){
        double total;
        total= base*altura;
        System.out.println("El area del triangulo es:"+ total );
        
    }

    public String getAngulo() {
        return Angulo;
    }

    public void setAngulo(String Angulo) {
        this.Angulo = Angulo;
    }
    
}
