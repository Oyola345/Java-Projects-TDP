/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author alumnos
 */
public class Ej1Triangulo {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Ingresar lado 1, 2 y 3, color de relleno y color de linea");
		Triangulo tr=new Triangulo(Lector.leerDouble(),Lector.leerDouble(),Lector.leerDouble(),Lector.leerString(),Lector.leerString());
		System.out.println(tr.calcularPerimetro());
		System.out.println(tr.calcularArea());
	}
	
}
