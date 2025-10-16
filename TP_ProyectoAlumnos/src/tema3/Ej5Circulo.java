/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author MILEABI
 */
public class Ej5Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que instancie un círculo, le cargue información leída de teclado
        System.out.println("Ingresar un radio, un color de relleno y un color de linea");
        Circulo circulo= new Circulo(Lector.leerDouble(), Lector.leerString(), Lector.leerString());
        
        //e informe en consola el perímetro y el área. 
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Area: " + circulo.calcularArea());
    }
    
}
