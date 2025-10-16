/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author MILEABI
 */
public class Ej1Persona {
    public static void main(String[] args){
         Persona P1=new Persona();
         System.out.println("Ingrese un nombre: ");
         P1.setNombre(Lector.leerString());
         System.out.println("Ingrese un DNI: ");
         P1.setDNI(Lector.leerInt());
         System.out.println("Ingrese una edad: ");
         P1.setEdad(Lector.leerInt());
         System.out.println(P1.toString());
    }
}
