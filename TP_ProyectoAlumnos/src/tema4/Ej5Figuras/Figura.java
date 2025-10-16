/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej5Figuras;

/**
 *
 * @author MILEABI
 */
public abstract class Figura {
    private String relleno;
    private String linea;
    
    public Figura(String relleno, String linea){
        this.relleno=relleno;
        this.linea=linea;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    public String toString(){
        String aux = " Relleno: "+getRelleno()+" Linea: "+getLinea()+" Area: "+this.calcularArea();
        return aux;
    }
    
    public abstract double calcularArea();
}
