package tema2;
import PaqueteLectura.Lector;

/**
 *
 * @author MILEABI
 */
public class Ej4Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona [][] castings = new Persona[8][5];
        int [] audsDia=new int[5];
        for(int i=0;i<5;i++){
            audsDia[i]=0;
        }
        
        int totalP=0; int nroP, dia;
        System.out.println("Ingresar Nombre");
        String nom=Lector.leerString();
        
        for(int i=0;i<5;i++){
            audsDia[i]=0;
        }
        
        while((totalP!=40) && !(nom.equals("ZZZ"))){
            System.out.println("ingrese un dia del 1 al 5: ");
            dia=Lector.leerInt()-1;
            if(audsDia[dia]<8){
                castings[audsDia[dia]][dia]=new Persona();
                castings[audsDia[dia]][dia].setNombre(nom);
                System.out.println("Ingresar Edad");
                castings[audsDia[dia]][dia].setEdad(Lector.leerInt());
                System.out.println("Ingresar DNI");
                castings[audsDia[dia]][dia].setDNI(Lector.leerInt());
                audsDia[dia]+=1;
                totalP++;
            }else{
                System.out.println("No quedan cupos para el día "+dia);
            }
            System.out.println("Ingresar Nombre");
            nom=Lector.leerString();
        }
        
        for(int i=0; i<5;i++){
            System.out.println("Personas incriptas:  "+ audsDia[i]+", para el dia "+i);
            nroP=audsDia[i];
            while(nroP>0){
                nroP--;
                nom=castings[nroP][i].getNombre();
                System.out.println("Dia "+i+" Turno "+nroP+": "+nom);
            }
        }
    } 
}
