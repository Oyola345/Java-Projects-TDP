/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ej4estacionM;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author MILEABI
 * 
    El Servicio Meteorológico Nacional necesita un sistema que permita registrar, para una
    determinada estación meteorológica, la temperatura promedio mensual de N años
    consecutivos a partir de un año A dado.
    De la estación, interesa conocer: nombre, y latitud y longitud donde se encuentra.
    Implemente las clases, constructores y métodos que considere necesarios para:
    a) Crear el sistema de registro/reporte, que funcionará en una determinada estación,
    para N años consecutivos a partir de un año A. Inicie cada temperatura en un valor
    muy alto. 
 */
public abstract class Sistema {
    private String nombre;
    private double latitud;
    private double longitud;
    private int años;
    private int añoInicio;
    
    private double [][] temps;
    
    public Sistema(String nombre, double latitud, double longitud, int años, int añoInic){
        setNombre(nombre);
        setLatitud(latitud);
        setLongitud(longitud);
        setAños(años);
        setAñoInicio(añoInic);
        temps = new double [años][12];
        int i, j;
        for(i=0;i<años;i++){
            for(j=0;j<12;j++){
                temps[i][j]=80;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    //b) Registrar la temperatura de un mes y año recibidos por parámetro. Nota: El mes
    //está en rango 1..12 y el año está en rango A..A+N-1.

    public void setTemp(int mes, int año, double temp) {
        temps[año-getAñoInicio()][mes-1]=temp;
    }
    
    //registar todas las temps
    
    public void setTemps(){
        int i,j;
        for (i=getAñoInicio();i<(getAñoInicio()+getAños());i++){
            for(j=1;j<13;j++){
                setTemp(j,i,GeneradorAleatorio.generarDouble(50));
            }
        }
    }
    
    //c) Obtener la temperatura de un mes y año recibidos por parámetro. Nota: El mes está
    //en rango 1..12 y el año está en rango A..A+N-1. En caso de no haberse registrado
    //temperatura para ese mes/año se retorna el valor muy alto. 
    
    public double getTemp(int mes, int año){
        return temps[año-getAñoInicio()][mes-1];
    }
    
    //d) Devolver un String que concatena el mes y año en que se registró la mayor
    //temperatura. Nota: Suponga que ya están registradas las temperaturas de todos
    //los meses y años.
    public String mayorTemp(){
        int i, j, mes=-1, año=-1;
        double maxT=0.00;
        for (i=getAñoInicio();i<(getAños()+getAñoInicio());i++){
            for(j=1;j<13;j++){
                if(getTemp(j,i)>maxT){
                    maxT=getTemp(j,i);
                    mes=j;
                    año=i;
                }
            }
        }
        String msj="Mes: "+ mes +", Año: "+ año +", Temperatura maxima: "+ maxT;
        return msj;
    }
    
    public String estToString(){
        //Ej: “La Plata (34,921 S - 57,955 O):
        return getNombre()+" ("+getLatitud()+" S - "+getLongitud()+" O): \n";
    }

    public abstract String reporteProm();
    
}
