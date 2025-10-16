/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
    import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author MILEABI
 */
public class Habitacion {
    //De cada habitación conoce costo por noche, si está
    //ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
    
    //(...)cada una desocupada y con costo aleatorio e/ 2000 y 8000.
    private double costo=GeneradorAleatorio.generarDouble(6000)+2001;
    private boolean ocupada=false;
    private Cliente cliente=null;
    
    public Habitacion(Cliente C){
        cliente=C;
        ocupada=true;
    }
    
    public Habitacion(){
        
    }
    
    //Provea métodos getters/setters adecuados.

    public double getCosto() {
        return costo;
    }

    public boolean getOcupada() {
        return ocupada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCosto(double monto) {
        costo += monto;
    }

    public void setCliente(Cliente unCliente) {
        cliente = unCliente;
    }

    //{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada} 
    
    public String habToString() {
        String estado;
        if(ocupada){
            estado="ocupada";
        }else{
            estado="libre";
        }
        return "Costo: " + costo + ", estado: " + estado +". ";
    }
    
    
    
}
