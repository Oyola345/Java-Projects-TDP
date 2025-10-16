/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
//import PaqueteLectura.Lector;
/**
 *
 * @author Alumno
 */
public class Restaurante {

    public static void main(String[] args) {
        int [][] opiniones = new int [4][5];
        int x, y; 
        for(y=0;y<5;y++){
            System.out.println("");
            System.out.println("Cliente "+ y+": ");//recorrer columnas de clientes
            for(x=0;x<4;x++){//filas = aspectos de la reseña individual
                //System.out.println("Ingrese un puntaje del 1 al 10 para el aspecto "+x);
                opiniones[x][y]=1+GeneradorAleatorio.generarInt(10);//Lector.leerInt();
                System.out.println("Puntaje aspecto "+x+": "+opiniones[x][y]);
            }
        }
        
        double atCli=0, calidad=0, precio=0, ambiente=0;
        for(y=0;y<5;y++){//sumar aspectos
                atCli+=opiniones[0][y];
                calidad+=opiniones[1][y];
                precio+=opiniones[2][y];
                ambiente+=opiniones[3][y];
        }
        System.out.println("Suma total de atCli: "+ atCli);
        System.out.println("Suma total de calidad: "+ calidad);
        System.out.println("Suma total de precio: "+ precio);
        System.out.println("Suma total de ambiente: "+ ambiente);
        System.out.println("");
        
        //promediar las variables
        atCli=atCli/5;
        calidad=calidad/5;
        precio=precio/5;
        ambiente=ambiente/5;
        
        System.out.println("Promedio de atCli: "+ atCli);
        System.out.println("Promedio de calidad: "+ calidad);
        System.out.println("Promedio de precio: "+ precio);
        System.out.println("Promedio de ambiente: "+ ambiente);
    }
    
}
