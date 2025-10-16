/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author MILEABI
 */
public class Torneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partido [] torneo = new Partido[20];
        int dimL=0, aux;
        System.out.println("Ingresar nombre del visitante");
        String vis=Lector.leerString();
        while ((dimL<20) && !(vis.equals("ZZZ"))){
            System.out.println("Ingresar nombre del local, goles del local y goles del visitante");
            torneo[dimL]= new Partido(Lector.leerString(),vis,Lector.leerInt(),Lector.leerInt());
            dimL++;
            System.out.println("Ingresar nombre del visitante");
            vis=Lector.leerString();
        }
        
        int cantRiver=0, golesBocaLocal=0;
        aux=dimL-1;
        while(aux>=0){
            if(torneo[aux].getGanador().equals("River")){
                cantRiver++;
            }
            if(torneo[aux].getLocal().equals("Boca")){
                golesBocaLocal+=torneo[aux].getGolesLocal();
            }
            //{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
            System.out.println(torneo[aux].getLocal() +" "+ torneo[aux].getGolesLocal() + " VS " + torneo[aux].getVisitante() +" "+ torneo[aux].getGolesVisitante());
            aux--;
        }
        
        System.out.println("Partidos ganados por river: "+ cantRiver);
        System.out.println("Goles de local de Boca: "+ golesBocaLocal);
        
    }
    
}
