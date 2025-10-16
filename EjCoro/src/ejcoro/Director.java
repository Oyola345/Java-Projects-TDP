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
public class Director extends Persona {
    private int antiguedad;

    public Director(int antiguedad, String nombre, int DNI, int edad) {
        super(nombre, DNI, edad);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String toString() {
        return (super.toString() + ", antiguedad: " + antiguedad);
    }

    
    
    
    
    
    
}
