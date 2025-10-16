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
public class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura, String relleno, String linea){
        super(relleno, linea);
        this.base=base;
        this.altura=altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        return (double) getBase()*getAltura();
    }
    
    public String toString(){
        return "Rectangulo, base: "+getBase()+" cm, "+"Altura: "+getAltura()+". "+super.toString();
    }
}
