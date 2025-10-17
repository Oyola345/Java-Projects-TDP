/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnoh2024;

/**
 *
 * @author MILEABI
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int cantUni;
    private double preUni;

    public Producto(int codigo, String nombre, String marca, int cantUni, double preUni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.cantUni = cantUni;
        this.preUni = preUni;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantUni() {
        return cantUni;
    }
    
    public String toString() {
        return "Producto{" + "codigo:" + codigo + ", nombre: " + nombre +
                ", marca: " + marca + ", cantidad de unidades exhibidas: " +
                cantUni + ", precio unitario: " + preUni + '}'+"\n";
    }
    
    
}
