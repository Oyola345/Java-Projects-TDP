/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej03Matrices {

    public static void main(String[] args) {
	    //Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
		int [][] matriz=new int[5][5];
		int x, y;
		for (x=0;x<5;x++){
			for(y=0;y<5;y++){
				matriz[x][y]=GeneradorAleatorio.generarInt(30);
			}
		}
        //Paso 4. mostrar el contenido de la matriz en consola
		for (x=0;x<5;x++){
			for(y=0;y<5;y++){
				System.out.println("Posicion: "+x+"x"+y+": "+matriz[x][y]);
			}
		}
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
		int suma=0;
		for(y=0;y<5;y++){
			suma+=matriz[1][y];
		}
		System.out.println("Suma fila 1: "+suma);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
		int DF=5;
		int [] vector=new int[DF];
		int sumaCol;
		for(y=0;y<5;y++){
			sumaCol=0;
			for(x=0;x<5;x++){
				sumaCol+=matriz[x][y];
			}
                        vector[y]=sumaCol;
		}
		
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. 
        
                int valor=Lector.leerInt();
                boolean esta=false;
                for(x=0;x<5;x++){
                    for(y=0;y<5;y++){
                        if(matriz[x][y]==valor){
                            System.out.println("Se encontró el elemento en la fila "+x+" y columna "+y);
                            esta=true;
                        }
                    }
                }
                if(!esta){
                    System.out.println("No se encontró el elemento");
                }
        // En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".

    }
}
