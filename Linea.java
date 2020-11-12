
package Clases;

public class Linea extends Formas{
    String Largo;
    public void Dibujar(){
        System.out.println("El nombre de la figura es: Linea");
    }

    public String getLargo() {
        return Largo;
    }

    public void setLargo(String Largo) {
        this.Largo = Largo;
    }
    
}
