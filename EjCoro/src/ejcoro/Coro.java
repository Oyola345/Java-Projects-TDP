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
public abstract class Coro {
    private String nombre;
    private Director director;
    
    //Implemente las clases necesarias teniendo en cuenta que los coros deberían crearse
    //con un director y sin ningún corista, pero sí sabiendo las dimensiones del coro.
    
    public Coro(String nombre, Director director){
        this.nombre=nombre;
        this.director = director;
    }
    
    //agregar un corista al coro.
    //o En el coro semicircular los coristas se deben ir agregando de izquierda
    //a derecha
    //o En el coro por hileras los coristas se deben ir agregando de izquierda a
    //derecha, completando la hilera antes de pasar a la siguiente
    public abstract void agrCorista(Corista unCorista);
    public abstract boolean estaLleno();
    //determinar si un coro (se supone que está lleno) está bien formado.
    public abstract boolean bienFormado();
    //devolver la representación de un coro formada por el nombre del coro, todos
    //los datos del director y todos los datos de todos los coristas.

    public String toString() {
        return "Nombre del coro: "+ nombre + ", director: " + director.toString();
    }
    
    
    
}
