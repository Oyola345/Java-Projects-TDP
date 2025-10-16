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
public class Proyecto {
    private String nombre;
    private int codigo, dimL;
    private String nomDirector;
    private Investigador [] investigadores;

    public Proyecto(String nombre, int codigo, String nomDirector) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nomDirector = nomDirector;
        dimL=0;
        investigadores=new Investigador [50]; //hay que recorrer el vector y poner todo en null con un constructor nulo?
    }
    
    public void agregarInvestigador(Investigador unInvestigador){ 
        if(dimL<50){
            investigadores[dimL]=unInvestigador;
            dimL++;
        }
    }
    
    public double dineroTotalOtorgado(){
        double montoTotal=0;
        for(int i=0;i<dimL;i++){
            montoTotal+=investigadores[i].dineroTotalOtorgado();
        }
        return montoTotal;
    }
    
    public void otorgarTodos(String nombre){
        //otorgar todos los subsidios no-otorgados del investigador llamado
        //nombre_completo
        for(int i=0;i<dimL;i++){
            if(investigadores[i].getNombre().equals(nombre)){
                investigadores[i].otorgarTodos();
                System.out.println("Se otorgaron los subsidios de "+nombre);
            }
        }
    }
    
    //e. String toString();
    // devolver un string con: nombre del proyecto, código, nombre del director, el
    //total de dinero otorgado del proyecto y la siguiente información de cada
    //investigador: nombre, categoría, especialidad, y el total de dinero de sus
    //subsidios otorgados.
    public String toString(){
        String aux=nombre+", Código: "+codigo+", Director: "+nomDirector+", Monto total: "+dineroTotalOtorgado()+"\n"+"Investigadores: \n";
        for(int i=0;i<dimL;i++){
            aux+=investigadores[i].toString();
        }
        return aux;
    }
}
