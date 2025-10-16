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
public class Ej1Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que instancie un triángulo y un círculo. Muestre en consola la
        //representación String de cada uno. Pruebe el funcionamiento del método despintar.
        Triangulo triangulo = new Triangulo(2, 3, 4, "amarillo", "rosa");
        Circulo circulo = new Circulo(5, "violeta", "verde");
        System.out.println(triangulo.toString());
        System.out.println(circulo.toString());
        triangulo.despintar();
        System.out.println(triangulo.toString());
        circulo.despintar();
        System.out.println(circulo.toString());        
    }
    
}
