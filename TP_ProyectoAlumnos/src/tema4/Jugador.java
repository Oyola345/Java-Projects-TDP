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
public class Jugador extends Empleado{
    //Los jugadores son empleados que se caracterizan por el número de partidos
    //jugados y el número de goles anotados. 
    private int partidos;
    private int goles;
    
    public Jugador (String nombre, double sueldo, int antiguedad, int partidos, int goles){
        super(nombre, sueldo, antiguedad);
        setGoles(goles);
        setPartidos(partidos);
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    //la del jugador es el promedio de goles por partido.
    public double calcularEfectividad(){
        return (double) getGoles()/getPartidos();
    }
    
    // Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un
    //plus de otro sueldo básico.
    public double calcularSueldoACobrar(){
        double aux=super.sueldoBase();
        if(calcularEfectividad()>0.5){
            aux+=getSueldo();
        }
        return aux;
    }
    
    
}
