/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author MILEABI
 */
public class Hotel {
    
    private int dimF;
    private Habitacion [] cuartos =new Habitacion[dimF];
    
    public Hotel(int nro){
        dimF=nro;
        cuartos =new Habitacion[dimF];
        for (int i=0;i<dimF;i++){
            cuartos[i]= new Habitacion();
        }
    }
    
    public int getDimF(){
        return dimF;
    }
    
    public Habitacion [] getHotel(){
        return cuartos;
    }
    
    //Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
    //en el rango 1..N) y que la habitación está libre. 
    public void ingresarC(Cliente C, int nroX){
        cuartos[nroX-1]=new Habitacion(C);
    }
    
    //Aumentar el precio de todas las habitaciones en un monto recibido
    public void aumentarPre(double monto){
        for (int i=0; i<dimF; i++){
            cuartos[i].setCosto(monto);
        }
    }
    
    //Obtener la representación String del hotel, siguiendo el formato:
    //{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada} 
    public String hToString() {
        String aux="";
        for(int i=0; i<dimF; i++){
            aux += "Habitación " + (i+1) + ": " + cuartos[i].habToString();
            if(cuartos[i].getOcupada()){
                aux+=cuartos[i].getCliente().cToString();
            }
            aux+="\n";
        }
        return aux;
    }
    
}
