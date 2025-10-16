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
public class SistemaMeses extends Sistema {
    
    public SistemaMeses(String nombre, double latitud, double longitud, int años, int añoInic){
        super(nombre, latitud, longitud, años, añoInic);   
    }
    
        //- La versión del sistema que reporta por meses deberá calcular el promedio para
        //cada mes (el promedio del mes M se calcula con los datos de todos los años en ese
        //mes).
        //Ej: “La Plata (34,921 S - 57,955 O):
        //- Enero: 28,2 ºC;
        //- Febrero: 26,8 ºC;
        //- Marzo: 24.3 ºC
        //- …..”
        
    public String reporteProm(){
        String texto=super.estToString();
        double promMensual;
        int i,j;
        for(j=1;j<13;j++){
            promMensual=0;
            texto+="- Mes "+j+": ";
            for (i=getAñoInicio();i<(getAñoInicio()+getAños());i++){
                promMensual+= getTemp(j,i);
            }
            promMensual=promMensual/getAños();
            texto += promMensual+" °C \n";
        }
        return texto;
    }

}
