/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_tp5;

/**
 *
 * @author MILEABI
 */
public class Investigador {
    private String nombre;
    private int categoria, dimL;
    private Subsidio [] subsidios;
    private String especialidad;

    public Investigador(String nombre, int categoria, String especialidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.especialidad = especialidad;
        dimL=0;
        subsidios=new Subsidio [5];//dentro del constructor o cuando creo las v.i?
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarSubsidio(Subsidio unSubsidio){
        if(dimL<5){
            subsidios[dimL]=unSubsidio;
            dimL++;
        }
    }
    
    public double dineroTotalOtorgado(){
        double montoTotal=0;
        for(int i=0;i<dimL;i++){
            if(subsidios[i].getOtorgado()){
                montoTotal+=subsidios[i].getMonto();                
            }
        }
        return montoTotal;
    }
    
    public void otorgarTodos(){
    //otorgar todos los subsidios no-otorgados del investigador llamado
    //nombre_completo
        for(int i=0; i<dimL;i++){
            subsidios[i].setOtorgado(true);
        }
    }
    
    //investigador: nombre, categoría, especialidad, y el total de dinero de sus
    //subsidios otorgados.
    
    public String toString(){
        String aux="Nombre: "+nombre+", Categoría: "+categoria+", Especialidad: "+
                especialidad+", total dinero por subsidios: "+dineroTotalOtorgado()+"\n";
        return aux;
    }
    
    
}
