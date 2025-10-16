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
public class Entrenador extends Empleado{
    private int campeonatos;
    
    public Entrenador(String nombre, double sueldo, int antiguedad, int campeonatos){
        super(nombre, sueldo, antiguedad);
        setCampeonatos(campeonatos);
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    
    //del entrenador es el promedio de campeonatos ganados por año de antigüedad
    public double calcularEfectividad(){
        return (double) getCampeonatos()/getAntiguedad();
    }
    // Para los entrenadores: se adiciona un plus por campeonatos ganados (5000$ si ha
    //ganado entre 1 y 4 campeonatos; $30.000 si ha ganado entre 5 y 10 campeonatos;
    //50.000$ si ha ganado más de 10 campeonatos). 
    public double calcularSueldoACobrar(){
        double aux=super.sueldoBase();
        if(1<=getCampeonatos() && getCampeonatos()>=4){
            aux+=5000;
        }else if(5<=getCampeonatos() && getCampeonatos()>=10){
            aux+=30000;
        }else if((getCampeonatos()>10)){
            aux+=50000;
        }
        return aux;
    }
    
}
