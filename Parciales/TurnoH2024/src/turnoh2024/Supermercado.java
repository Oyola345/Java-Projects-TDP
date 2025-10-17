/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnoh2024;

/**
 *
 * @author MILEABI
 */
public class Supermercado {
    private String nombre;
    private String direccion;
    private Producto [][] productos;
    private int gondolas;
    private int estantes;
    private int dimL;
    private int dimF;

    public Supermercado(String nombre, String direccion, int G, int E) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gondolas = G;
        this.estantes = E;
        productos = new Producto [gondolas][estantes];
        dimL=0;
        dimF=gondolas*estantes;
    }
    
    public void registrarProd(Producto unProd){
        if(dimL<dimF){
            productos[dimL/estantes][dimL%estantes]=unProd;
            dimL++;            
        }
    }
    
    public String listarMenX(String M, int X){
        int i;
        String aux="";
        X--;
        for (i=0;i<estantes;i++){
            if(productos[X][i].getMarca().equals(M)){
                aux+=productos[X][i].toString();
            }
        }
        return aux;
    }
    
    public int mayorGondola(){
        int i, j, cant, max=-1, maxG=-1;
        for(i=0;i<gondolas;i++){
            cant=0;
            for(j=0;j<estantes;j++){
                cant+=productos[i][j].getCantUni();
            }
            if(cant>max){
                max=cant;
                maxG=i+1;
            }
        }
        return maxG;
    }
    
    public String toString(){
        String aux="Supermercado: "+nombre+"; Direccion: "+direccion+"\n";
        int i,j;
        for(i=0;i<gondolas;i++){
            aux+="Góndola "+(i+1)+": \n";
            for(j=0;j<estantes;j++){
                aux+="Estante "+(j+1)+": "+productos[i][j].toString();
            }
        }
        return aux;
    }
    
}
