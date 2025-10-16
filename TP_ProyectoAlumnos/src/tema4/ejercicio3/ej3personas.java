/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejercicio3;

/**
 *
 * @author MILEABI
 */
public class ej3personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // B- Realice un programa que instancie una persona y un trabajador 
        Persona p1=new Persona("Lola", 45698753,20);
        Trabajador t1= new Trabajador("Mario", 26333555, 53, "jardinero");
        //y muestre la representación de cada uno en consola. 
        System.out.println(p1.toString());
        System.out.println(t1.toString());
    }
    
}
