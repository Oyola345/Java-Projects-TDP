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
public class Persona {
    //personas, que se caracterizan por nombre, DNI y edad
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
    }
    
    public Persona(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    //Personas “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años”
    //Trabajadores “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años. Soy jardinero.” 
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + getNombre() + ", mi DNI es " + getDNI() + " y tengo " + getEdad() + " años.";
        return aux;
    }
    
    
}
