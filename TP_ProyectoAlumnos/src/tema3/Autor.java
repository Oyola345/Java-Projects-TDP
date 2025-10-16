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
public class Autor {
    
    private String nombre;
    private String biografia;
    private String origen;
    
    public Autor(String nom, String bio, String unOrigen){
        nombre=nom;
        biografia=bio;
        origen=unOrigen;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getBio(){
        return biografia;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public void setBio(String bio){
        biografia=bio;
    }
    
    public void setOrigen(String unOrigen){
        origen=unOrigen;
    }
    
    public String toString(){
        String msj;
        msj="El autor se llama "+nombre+". Biografía: "+biografia+". Origen: "+origen;
        return msj;
    }
    
    
}
