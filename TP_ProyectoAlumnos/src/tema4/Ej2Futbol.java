/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author MILEABI
 */
public class Ej2Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1=new Jugador("Maidana", GeneradorAleatorio.generarDouble(10000), 25, 120, 40);
        Entrenador ent1=new Entrenador("Gallardo", GeneradorAleatorio.generarDouble(10000), 25, 8);
                
        //D- Cualquier empleado debe responder al mensaje toString, que devuelve un String que
        //lo representa, compuesto por nombre, sueldo a cobrar y efectividad. 
        
        System.out.println(jugador1.toString());
        System.out.println(ent1.toString());
        //E- Realizar un programa que instancie un jugador y un entrenador. Informe
        //representación String de cada uno.
    }
    
}
