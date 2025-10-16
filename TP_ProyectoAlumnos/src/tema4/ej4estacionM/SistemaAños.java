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
public class SistemaAños extends Sistema {
    //- La versión del sistema que reporta por años deberá calcular el promedio para
    //cada año (el promedio del año X se calcula con los datos mensuales de ese año).
    //Ej: “La Plata (34,921 S - 57,955 O):
    //- Año 2020: 23,8 ºC;
    //- Año 2021: 26,1 ºC;
    //- Año 2022: 25,3 ºC. ”
    
    public SistemaAños(String nombre, double latitud, double longitud, int años, int añoInic){
        super(nombre, latitud, longitud, años, añoInic);   
    }
    
    public String reporteProm(){
        String texto=super.estToString();
        double promAnual;
        int i,j;
        for (i=getAñoInicio();i<(getAñoInicio()+getAños());i++){
            promAnual=0;
            texto+="- Año "+i+": ";
            for(j=1;j<13;j++){
                promAnual+=getTemp(j,i);
            }
            promAnual=promAnual/12;
            texto += promAnual+" °C \n";
        }
        return texto;
    }
}
