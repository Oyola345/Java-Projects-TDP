/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcoro;

/**
 *
 * @author alumnos
 */
public class Corista extends Persona{
    private int tono;

    public Corista(int tono, String nombre, int DNI, int edad) {
        super(nombre, DNI, edad);
        this.tono = tono;
    }

    public int getTono() {
        return tono;
    }

    public void setTono(int tono) {
        this.tono = tono;
    }

    public String toString() {
        return (super.toString() +", Tono: "+ tono)+"\n";
    }
    
}
