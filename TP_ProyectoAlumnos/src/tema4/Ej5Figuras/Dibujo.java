/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ej5Figuras;

/**
 *
 * @author MILEABI
 */
public class Dibujo {
     private String titulo;
     private Figura [] vector;
     private int guardadas;
     private int capacidadMaxima=10;
 
    //inicia el dibujo, sin figuras
     public Dibujo (String titulo){
     //completar
        this.titulo=titulo;
        guardadas = 0;
        vector = new Figura[capacidadMaxima];
     }

     //agrega la figura al dibujo
     public void agregar(Figura f){
     //completar
        if (guardadas < capacidadMaxima){
            vector[guardadas]= f;
            guardadas++;
            System.out.println("La figura "  +  f.toString() + " se ha guardado");
        } else {
            System.out.println("La figura "  +  f.toString() + " no se ha guardado porque el dibujo esta lleno");
        }
     }

    //calcula el área del dibujo:
    //suma de las áreas de sus figuras
    public double calcularArea(){
    //completar
        int i;
        double suma=0;
        for(i=0;i<guardadas;i++){
            suma+=vector[i].calcularArea();
        }
        return suma;
     }
    
    //imprime el título, representación
    //de cada figura, y área del dibujo
    public void mostrar(){
    //completar
        String aux=titulo;
        for(int i=0; i<guardadas; i++){
            aux+="\n "+vector[i].toString();
        }
        aux+="\n Area total: "+calcularArea();
        System.out.println(aux);
    }
    
    //retorna está lleno el dibujo
    public boolean estaLleno() {
        return (guardadas == capacidadMaxima);
    }
}
