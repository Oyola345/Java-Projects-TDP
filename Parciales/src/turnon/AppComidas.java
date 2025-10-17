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
public class AppComidas extends App {
    private int cantPedidos;
    private double montoRec;
    private int cantRest;

    public AppComidas(String nombre, String web) {
        super(nombre, web);
        this.cantPedidos = 0;
        this.montoRec = 0;
        this.cantRest = 0;
    }
    
    public void registrarPedidoComida(double m){
        montoRec+=m;
        cantPedidos++;
    }

    public double calcularCotizacionComercial() {
        return (500*cantRest + 50*getCantUsers() + montoRec );
    }

    
    
    
    
    
    
}
