/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnoc;

/**
 *
 * @author MILEABI
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private double costoMes;
    private int sectores;
    private int bauleras;
    private int dimL;
    private int dimF;
    Cliente [][] espacio;

    public Empresa(String direccion, double costoMes, int S, int B) {
        this.direccion = direccion;
        this.costoMes = costoMes;
        sectores = S;
        bauleras = B;
        espacio = new Cliente[S][B];
        dimL=0;
        dimF=sectores*bauleras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void ingresarCliente(Cliente unCliente){
        if(dimL<dimF){
            espacio[dimL/bauleras][dimL%bauleras]=unCliente;
            dimL++;
        }else{
            System.out.println("No se pudo agregar");
        }
    }
    
    public String listaLhSectorX(int X){
        String aux="";
        int i=0;
        Cliente cliente;
        X--;
        while ((i<bauleras) && (espacio[X][i] != null)){
            cliente=espacio[X][i];
            if(cliente.getLocalidad().equals("Los Hornos")){
                aux+=cliente.toString()+"\n";
            }
            i++;
        }
        return aux;
    }
    
    public int sectorMasSeguros(){
        int sector=0, secAct, cant, max=-1, maxSect=-1, i=0;
        while(i<dimL){
            cant=0;
            secAct=sector;
            while((i<dimL) && (secAct==sector)){
                if(espacio[sector][i%bauleras].getSeguroAd()){
                    cant++;
                }
                i++;
                sector=i/bauleras;
            } 
            if(cant>max){
                max=cant;
                maxSect=secAct;
            }
        }
        return maxSect++;//porque empiezan desde 0 los sectores en la matriz
    }

    public String toString() {
        String aux="Empresa: " + nombre + " - " + direccion +
                "; " + costoMes+"\n";
        int sector=0, secAct, i=0, baulera;
        while(i<dimL){
            secAct=sector;
            aux+="Sector "+(secAct+1)+": \n";
            while((i<dimL) && (secAct==sector)){
                baulera=i%bauleras;
                aux+="Baulera "+(baulera+1)+": "+
                        espacio[secAct][baulera].toString()+"\n";
                i++;
                sector=i/bauleras;
            }
        }
        return aux;
    }
    
    
    
    
}
