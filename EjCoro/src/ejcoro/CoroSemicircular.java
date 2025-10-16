/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcoro;

/**
 *
 * @author alumnos
 */
public class CoroSemicircular extends Coro {
    private Corista [] coristas;
    private int dimF;
    private int dimL;
    
    public CoroSemicircular(String nombre, Director director, int cantidad){
        super(nombre, director);
        dimF=cantidad;
        dimL=0;
        coristas= new Corista[dimF];
    }
    
    //o En el coro semicircular los coristas se deben ir agregando de izquierda
    //a derecha
    public void agrCorista(Corista unCorista){
        if(!estaLleno()){
            coristas[dimL]=unCorista;
            dimL++;
        }else{
            System.out.println("No se pudo agregar al corista");
        }
    }
    
    //determinar si un coro está lleno o no. Devuelve true si el coro tiene a todos sus
    //coristas asignados o false en caso contrario
    public boolean estaLleno(){
        return (dimL==dimF);
    }
    
    //En el caso del coro semicircular, de izquierda a derecha los coristas
    //están ordenados de mayor a menor en cuanto a tono fundamental
    public boolean bienFormado(){
        boolean correcto=true;
        int i=0, maxTono=99;
        while (i<dimF && correcto){
            if(maxTono>coristas[i].getTono()){
                maxTono=coristas[i].getTono();
            }else{
                correcto=false;
            }
            i++;
        }
        return correcto;
    }
    
    //todos los datos de todos los coristas.

    public String toString() {
        String aux=super.toString()+". \n Coristas: \n";
        for(int i=0;i<dimL;i++){
            aux+=coristas[i].toString();
        }
        return aux;
    }
    
}
