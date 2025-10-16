/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author alumnos
 */
public class Triangulo {
	//Un triángulo se caracteriza por el tamaño de sus 3 lados (double), 
	//el color de relleno (String) y el color de línea (String).
	private double lado1;
	private double lado2;
	private double lado3;
	private String relleno;
	private String linea;
	
	//Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
	public Triangulo(double l1, double l2, double l3, String colorR, String colorL){
		lado1=l1;
		lado2=l2;
		lado3=l3;
		relleno=colorR;
		linea=colorL;
	}
	
	/*Provea métodos para:
	- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)*/
	
	public double getLado1(){
		return lado1;
	}
	
	public double getLado2(){
		return lado2;
	}
	
	public double getLado3(){
		return lado3;
	}
	
	public String getRelleno(){
		return relleno;
	}
	
	public String getLinea(){
		return linea;
	}
	
	public void setLado1(double l1){
		lado1=l1;
	}
	
	public void setLado2(double l2){
		lado2=l2;
	}
	
	public void setLado3(double l3){
		lado3=l3;
	}
	
	public void setRelleno(String colorR){
		relleno=colorR;
	}
	
	public void setLinea(String colorL){
		linea=colorL;
	}
	
	//- Calcular el perímetro y devolverlo (método calcularPerimetro)
	public double calcularPerimetro(){
		double perimetro = lado1+lado2+lado3;
		return perimetro;
	}
	
	//- Calcular el área y devolverla (método calcularArea)
	public double calcularArea(){
		double s=(lado1+lado2+lado3)/2;
		double area=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		return area;
	}
	
}
