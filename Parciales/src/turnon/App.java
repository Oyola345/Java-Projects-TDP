/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnon;

/**
 *
 * @author MILEABI
 */
public abstract class App {
    private String nombre;
    private String web;
    private int cantUsers;

    public App(String nombre, String web) {
        this.nombre = nombre;
        this.web = web;
        this.cantUsers = 0;
    }

    public int getCantUsers() {
        return cantUsers;
    }
    
    public abstract double calcularCotizacionComercial();
    
    public String toString() {
        return "Nombre de la App: " + nombre + "; Dirección web: " + web 
                + "; cantidad de usuarios: " + getCantUsers() + "; Cotización comercial: "+ calcularCotizacionComercial()+"\n";
    }
}
