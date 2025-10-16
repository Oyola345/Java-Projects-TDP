/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ej4estacionM;

/**
 *
 * @author MILEABI
 */
public class ej4temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //f) Realice un programa principal que cree un Sistema con reporte anual para 3 años
        //consecutivos a partir del 2021, para la estación La Plata (latitud -34.921 y longitud -
        //57.955).
        SistemaAños laPlata= new SistemaAños("La Plata", -34.921, 57.955, 3, 2021);
        //Cargue todas las temperaturas (para todos los meses y años). 
        laPlata.setTemps();
        //Informe los promedios anuales, 
        System.out.println(laPlata.reporteProm());
        //y el mes y año en que se registró la mayor temperatura.
        System.out.println(laPlata.mayorTemp()+"\n");        
        //Luego cree un Sistema con informe mensual para 4 años a partir de 2020, para la
        //estación Mar del Plata (latitud -38.002 y longitud -57.556). 
        SistemaMeses mdq= new SistemaMeses("Mar del Plata", -38.002, 57.556, 4, 2020);
        //Cargue todas las temperaturas (para todos los meses y años). 
        mdq.setTemps();
        //Informe los promedios mensuales, 
        System.out.println(mdq.reporteProm());
        //y el mes y año en que se registró la mayor temperatura.
        System.out.println(mdq.mayorTemp());        
    }
    
}
