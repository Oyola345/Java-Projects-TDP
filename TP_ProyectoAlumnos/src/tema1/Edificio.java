/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
    import PaqueteLectura.Lector;
/**
 *
 * @author Alumno
 */
public class Edificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        int [][] oficinas= new int[8][4];
        for(x=0;x<8;x++){
            for(y=0; y<4; y++){
                oficinas[x][y]=0;
            }
        }
        int piso, oficina;
        
        System.out.println("Ingrese el piso (1..8)");
        piso=Lector.leerInt();
        System.out.println("Ingrese la oficina (1..4)");
        oficina=Lector.leerInt();
        
        while(piso<9){
            oficinas[piso-1][oficina-1]+=1;
            System.out.println("Ingrese el piso (1..8)");
            piso=Lector.leerInt();
            if(piso<9){ 
                System.out.println("Ingrese la oficina (1..4)");
                oficina=Lector.leerInt();
            }
        }  
        for(x=0;x<8;x++){
            for(y=0; y<4; y++){
                System.out.println("Cantidad de personas en el piso "+x+" oficina "+y+": "+oficinas[x][y]);
            }
        }
    }
    
}
