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
public class Trabajador extends Persona{
    //trabajadores, personas que se caracterizan además por la tarea realizada en el predio. 
    private String tarea;
    
    public Trabajador(String unNombre, int unDNI, int unaEdad, String unaTarea){
        super(unNombre, unDNI, unaEdad);
        setTarea(unaTarea);
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String unaTarea) {
        tarea = unaTarea;
    }
    
    //Trabajadores “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años. Soy jardinero.” 
    public String toString(){
        String aux=super.toString()+" Soy "+tarea;
        return aux;
    }
    
}
