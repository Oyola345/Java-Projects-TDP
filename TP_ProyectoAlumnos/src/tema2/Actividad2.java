/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author MILEABI
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona [] people = new Persona[15];
        int i = 0, mayores65=0, menorDni=51000000, menorPerDni=i, edad;
        edad= GeneradorAleatorio.generarInt(100);
        while(i<=14 && edad!=0){
            people[i]=new Persona();
            people[i].setEdad(edad);
            people[i].setNombre(GeneradorAleatorio.generarString(10));
            people[i].setDNI(GeneradorAleatorio.generarInt(50000000)+1);
            if(people[i].getEdad() > 65){
                mayores65++;
            }
            if(people[i].getDNI() < menorDni){
                menorDni=people[i].getDNI();
                menorPerDni=i;
            }
            i++;
            edad= GeneradorAleatorio.generarInt(90);    
        }
        System.out.println("Mayores de 65: "+ mayores65);
        System.out.println(people[menorPerDni].toString());
    }
    
}
