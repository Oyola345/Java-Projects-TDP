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

//Cualquier empleado se caracteriza por su nombre, sueldo básico y antigüedad. 
public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    public Empleado(String nombre, double sueldo, int antiguedad){
        setNombre(nombre);
        setSueldo(sueldo);
        setAños(antiguedad);
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    
    public void setAños(int años){
        antiguedad=años;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    //Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad
    //del entrenador es el promedio de campeonatos ganados por año de antigüedad, mientras
    //que la del jugador es el promedio de goles por partido.
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    
    //C- Cualquier empleado debe responder al mensaje calcularSueldoACobrar. El sueldo a
    //cobrar es el sueldo básico más un 10% del básico por cada año de antigüedad y además:
    // Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un
    //plus de otro sueldo básico.
    // Para los entrenadores: se adiciona un plus por campeonatos ganados (5000$ si ha
    //ganado entre 1 y 4 campeonatos; $30.000 si ha ganado entre 5 y 10 campeonatos;
    //50.000$ si ha ganado más de 10 campeonatos). 
    public double sueldoBase(){
        double aux=getSueldo()+(0.1*getSueldo())*getAntiguedad();
        return aux;
    }
    
    //D- Cualquier empleado debe responder al mensaje toString, que devuelve un String que
    //lo representa, compuesto por nombre, sueldo a cobrar y efectividad. 
    public String toString(){
        String msj=this.getNombre()+", sueldo: "+this.calcularSueldoACobrar()+", efectividad: "+this.calcularEfectividad();
        return msj;
    }
    
    
}
