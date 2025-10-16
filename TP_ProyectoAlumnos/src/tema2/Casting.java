package tema2;
import PaqueteLectura.Lector;

/**
 *
 * @author MILEABI
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona [][] castings = new Persona[8][5];
        int totalP=0; int nroP, dia;
        dia = 0; nroP=0;
        System.out.println("Ingresar Nombre");
        String nom=Lector.leerString();
        while((totalP!=40) && !(nom.equals("ZZZ"))){
            castings[nroP][dia]=new Persona();
            castings[nroP][dia].setNombre(nom);
            System.out.println("Ingresar Edad");
            castings[nroP][dia].setEdad(Lector.leerInt());
            System.out.println("Ingresar DNI");
            castings[nroP][dia].setDNI(Lector.leerInt());
            totalP++;
            nroP++;
            if(nroP==8){
                nroP=0;
                dia++;
            }
            System.out.println("Ingresar Nombre");
            nom=Lector.leerString();
        }
        nroP=0;
        dia=0;
        while(totalP!=0){
            System.out.println("Dia número "+ dia + " turno "+nroP+": "+castings[nroP][dia].toString());
            totalP--;
            nroP++;
            if(nroP==8){
                nroP=0;
                dia++;
            }
        }
    }
    
}
