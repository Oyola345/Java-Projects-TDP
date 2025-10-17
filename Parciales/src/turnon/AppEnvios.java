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
public class AppEnvios extends App{
    private Envio[] envios;
    private int dimF;
    private int dimL;

    public AppEnvios(String nombre, String web, int N) {
        super(nombre, web);
        dimF=N;
        this.envios = new Envio[dimF];
        dimL=0;
    }
    
    public boolean registrarPedidoEnvio(Envio unEnvio){
        boolean agregado;
        if(dimL<dimF){
            envios[dimL]=unEnvio;
            agregado=true;
            dimL++;
        }else{
            agregado=false;
        }
        return agregado;
    }
    
    public double calcularCotizacionComercial() {
        double recaudado=0;
        for(int i=0;i<dimL;i++){
            recaudado+= envios[i].getMonto()- envios[i].getCostoOp();
        }
        return ( 400*dimL + recaudado );
    }
}
