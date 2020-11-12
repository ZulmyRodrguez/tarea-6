
package Clases;

public class Circulo extends Formas {
    String Radio;

    public void CalcularRadio (double AreaDelCirculo){ 
        double total;
        total=(AreaDelCirculo/(2*3.14));
        System.out.println("El radio del circulo es " + total);
        
}
    public void Dibujar(){
        System.out.println(" El nombre de la figura es: Circulo");
        
}

    public String getRadio() {
        return Radio;
    }

    public void setRadio(String Radio) {
        this.Radio = Radio;
    }
    
   
    
}

