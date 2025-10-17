/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnoc;

/**
 *
 * @author MILEABI
 */
public class Cliente {
    private int DNI;
    private String nombre;
    private int telefono;
    private String localidad;
    private boolean seguroAd;

    public Cliente(int DNI, String nombre, int telefono, String localidad, boolean seguroAd) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
        this.localidad = localidad;
        this.seguroAd = seguroAd;
    }

    public String getLocalidad() {
        return localidad;
    }

    public boolean getSeguroAd() {
        return seguroAd;
    }
    
    public String toString() {
        String aux="DNI " + DNI + ", nombre: " + nombre + 
                ", telefono:" + telefono + ", localidad: " + localidad;
        if(seguroAd){
            aux+=", asegurado";
        }else{
            aux+=", sin seguro";
        }
        return aux;
    }
    
    
}
