/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcoro;

    import PaqueteLectura.Lector;
    import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author alumnos
 */
public class EjCoro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que instancie un coro de cada tipo. Lea o bien la cantidad de
        //coristas (en el caso del coro semicircular) o la cantidad de hileras e integrantes por
        //hilera (en el caso del coro por hileras). 
        int cant=Lector.leerInt();
        CoroSemicircular coroSemi=new CoroSemicircular("Coro 1",new Director(25, "Marcelo",26263322, 56),cant);
        int filas=Lector.leerInt();
        int columnas=Lector.leerInt();
        CoroHileras coroH=new CoroHileras("Coro 2",new Director(30, "Carla",15263322, 60),filas,columnas);
        //Luego cree la cantidad de coristas necesarios,
        //leyendo sus datos, y almacenándolos en el coro. 
        for(int i=0; i<cant;i++){
            coroSemi.agrCorista(new Corista(GeneradorAleatorio.generarInt(9), 
                    GeneradorAleatorio.generarString(10)+1, GeneradorAleatorio.generarInt(50000000)+1, 
                    GeneradorAleatorio.generarInt(60)+10));
        }
        
        for(int i=0; i<(filas*columnas);i++){
            coroH.agrCorista(new Corista(GeneradorAleatorio.generarInt(9), 
                    GeneradorAleatorio.generarString(10)+1, GeneradorAleatorio.generarInt(50000000)+1, 
                    GeneradorAleatorio.generarInt(60)+10));
        }
        //Finalmente imprima toda la
        //información de los coros indicando si están bien formados o no.
        System.out.println(coroSemi.toString());
        if(coroSemi.bienFormado()){
            System.out.println("El coro está bien formado"+"\n");
        } else {
            System.out.println("El coro NO está bien formado"+"\n");
        }
        System.out.println(coroH.toString());
        if(coroH.bienFormado()){
            System.out.println("El coro está bien formado"+"\n");
        } else {
            System.out.println("El coro NO está bien formado"+"\n");
        }
    }
    
}
