/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author MILEABI
 */
public class Circulo extends Figura{
    
    private double radio;
    
    //crearla a partir de los datos necesarios(constructor)
    public Circulo (double radio, String relleno, String linea){
        super(relleno,linea);
        setRadio(radio);
    }
    
    public void setRadio(double r){
        radio=r;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
        return Math.PI*(getRadio()*getRadio());
    }
    
    public double calcularPerimetro(){
        return Math.PI*getRadio()*2;
    }
    
    public String toString(){
        String aux=super.toString()+" Radio: "+getRadio();
        return aux;
    }
}
