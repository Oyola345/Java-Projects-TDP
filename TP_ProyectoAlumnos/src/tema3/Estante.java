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
public class Estante {
    private int dimF;
    private Libro [] libs= new Libro[dimF];
    private int dimL=0;

    public Estante(int nro) {
        dimF=nro;
        libs= new Libro[dimF];
    }
    
    public String lleno(){
        if(dimL==dimF){
            return "El estante está lleno";
        }
        else{
            return "El estante NO está lleno";
        }
    }
    
    public String agregarLib(Libro unLib) {
        if(dimL<dimF){
            libs[dimL]=unLib;
            dimL++;
            return "Se agregó el libro";
        }else{
            return lleno();
        }
    }
    
    public int getCantLibs(){
        return dimL;
    }
    
    //devolver el libro con un título particular que se recibe
    public Libro buscarLibro(String titulo){
        int i=0;
        boolean encontrado=false;
        
        while(i<dimL && !encontrado){
            encontrado=libs[i].getTitulo().equals(titulo);
            i++;
        }
        
        if(encontrado){
            return libs[i-1];
        }
        return null;
    }
}
