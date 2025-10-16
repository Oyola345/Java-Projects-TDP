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
public class TurnoN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        AppComidas app1= new AppComidas("Comida City", "https:/comidacity.com");
        AppEnvios app2= new AppEnvios("Envios full", "https:/enviosfull.com",5);
        app1.registrarPedidoComida(2000);
        app1.registrarPedidoComida(1500);
        app1.registrarPedidoComida(2420);
        System.out.println("Cotizacion app comidas: "+ app1.calcularCotizacionComercial());
        System.out.println(app2.registrarPedidoEnvio(new Envio("direc origen","direc destino",26000,1500)));
        System.out.println(app2.registrarPedidoEnvio(new Envio("direc origen 2","direc destino 2",15000,2000)));
        System.out.println("Cotizacion app envios: "+ app2.calcularCotizacionComercial());
        
        System.out.println(app1.toString());
        System.out.println(app2.toString());
    }
    
}
