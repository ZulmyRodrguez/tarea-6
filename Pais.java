
package com.mycompany.ejercicioencapsulamiento;


public class Pais {
private String Pais;
private String Presidente;

    public Pais(String Pais, String Presidente) {
        this.Pais = Pais;
        this.Presidente = Presidente;
    }


    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }


    
}
