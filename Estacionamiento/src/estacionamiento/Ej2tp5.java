/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

/**
 *
 * @author MILEABI
 */
public class Ej2tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //d) Realice un programa que instancie un estacionamiento con 3 pisos y 3 plazas por piso.
        //Registre 6 autos en el estacionamiento en distintos lugares.
        //Muestre la representación String del estacionamiento en consola.
        //Muestre la cantidad de autos ubicados en la plaza 1.
        //Lea una patente por teclado e informe si dicho auto se encuentra en el
        //estacionamiento o no. En caso de encontrarse, la información a imprimir es el piso y
        //plaza que ocupa.
        Estacionamiento est=new Estacionamiento("Cochera","Alberdi n°445", "8:00","23:00",3,3);
        est.agregarAuto(new Auto("Gustavo","AMZ 523"), 2,2);
        est.agregarAuto(new Auto("Andrea","BGT 914"), 2, 1);
        est.agregarAuto(new Auto("Carlos","JQR 305"), 3, 3);
        est.agregarAuto(new Auto("Sofía","KLP 778"), 1, 2);
        est.agregarAuto(new Auto("Martín","DRS 441"), 2, 3);
        est.agregarAuto(new Auto("Elena","HUV 609"), 3, 1);
        System.out.println(est.toString());
        System.out.println(est.cantAutosPlazaY(1));
        System.out.println(est.buscarAuto("JQR 305"));
        System.out.println(est.buscarAuto("ABC 123"));
        
        
    }
    
}
