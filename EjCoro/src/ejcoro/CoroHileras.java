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
public class CoroHileras extends Coro {
    private Corista [][] hileras;
    private int filas;
    private int columnas;
    private int dimL;
    private int dimF;
    
    public CoroHileras(String nombre, Director director, int filas, int columnas){
        super(nombre, director);
        this.filas = filas;
        this.columnas = columnas;
        hileras= new Corista[filas][columnas];
        dimL=0;
        dimF=filas*columnas;
    }
    

    //o En el coro por hileras los coristas se deben ir agregando de izquierda a
    //derecha, completando la hilera antes de pasar a la siguiente
    public void agrCorista(Corista unCorista){
        if(!estaLleno()){
            hileras[dimL/columnas][dimL%columnas]=unCorista;
            dimL++;
        }else{
            System.out.println("Coro lleno");
        }
    }
    
    //determinar si un coro está lleno o no. Devuelve true si el coro tiene a todos sus
    //coristas asignados o false en caso contrario
    public boolean estaLleno(){
        return (dimL==dimF);
    }
         
    //determinar si un coro (se supone que está lleno) está bien formado. Un coro
    //está bien formado si:
    //o En el caso del coro por hileras, todos los miembros de una misma hilera
    //tienen el mismo tono fundamental y además todos los primeros
    //miembros de cada hilera están ordenados de mayor a menor en cuanto
    //a tono fundamental.
    public boolean bienFormado(){
        boolean correcto=true;
        int i=0, j, max=99, tonoAct;
        while(i<filas && correcto){
            j=0;
            tonoAct=hileras[i][j].getTono();
            if(tonoAct<max){
                max=tonoAct;
            }else{
                correcto=false;
            }
            while( j<columnas && correcto){
                correcto = (hileras[i][j].getTono() == tonoAct);
                j++;
            }
            i++;
        }
        return correcto;
    }
    
    public String toString(){
        String aux=super.toString()+". \n Coristas: \n";
        int i=0;
        while(i<dimL){
            aux+=hileras[i/columnas][i%columnas].toString();
            i++;
        }
        return aux;
    }
    
}
