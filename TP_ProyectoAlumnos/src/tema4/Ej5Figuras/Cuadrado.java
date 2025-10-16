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
public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(double lado, String colorR, String colorL){
        super(colorR, colorL);
        this.lado=lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public String toString(){
        return "Cuadrado, lado: "+getLado()+" cm. "+super.toString();
    }
    
    public double calcularArea(){
        return (double) getLado()*getLado();
    }
    
}
