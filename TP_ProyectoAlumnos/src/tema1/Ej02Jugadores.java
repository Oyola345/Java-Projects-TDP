
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
		int DF=15;
		double [] vector;
        //Paso 3: Crear el vector para 15 double 
		vector=new double[DF];
        //Paso 4: Declarar indice y variables auxiliares a usar
                 int i;
		double sumaAlt=0.0;
		double altProm;
		int cant=0;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
		for(i=0;i<DF;i++){
			vector[i]=Lector.leerDouble();
			sumaAlt+=vector[i];
		}
        //Paso 7: Calcular el promedio de alturas, informarlo
        altProm= (double) sumaAlt/DF;
	System.out.println("La altura promedio es: " + altProm);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
		for(i=0;i<DF;i++){
			if(vector[i]>altProm){
				cant++;
			}
		}
        //Paso 9: Informar la cantidad.
	System.out.println("La cantidad es: " + cant);
    }
    
}
