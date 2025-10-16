/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_tp5;

/**
 *
 * @author MILEABI
 */
public class Ej1_TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // iii) Escriba un programa que instancie un proyecto con tres investigadores. Agregue dos
    //subsidios a cada investigador y otorgue los subsidios de uno de ellos. Luego imprima
    //todos los datos del proyecto en pantalla
    
    Proyecto proyecto=new Proyecto("Expedición marina", 2552 , "Ramón Pérez");
    Investigador invest1=new Investigador("Marta Gonzalez", 2, "Bioquimica");
    Subsidio sub1=new Subsidio(2300, "motivo 1");
    invest1.agregarSubsidio(sub1);
    proyecto.agregarInvestigador(invest1);
    
    Investigador invest2=new Investigador("Luis Fernández", 5, "Física Teórica");
    Subsidio sub2=new Subsidio(4500, "Adquisición de equipo");
    invest2.agregarSubsidio(sub2);
    proyecto.agregarInvestigador(invest2);
    
    Investigador invest3=new Investigador("Ana Torres", 1, "Arqueología");
    Subsidio sub3=new Subsidio(1500, "Viaje de campo");
    Subsidio sub4=new Subsidio(800, "Material bibliográfico");
    invest3.agregarSubsidio(sub3);
    invest3.agregarSubsidio(sub4);
    proyecto.agregarInvestigador(invest3);

    proyecto.otorgarTodos("Ana Torres");
    
    System.out.println(proyecto.toString());
    }
    
}
