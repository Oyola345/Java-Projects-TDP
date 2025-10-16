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
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaAper;
    private String horaCierre;
    private int pisos;
    private int plazas;
    private Auto [][]autos;
    
    //b) Implemente constructores. En particular, para el estacionamiento:
    //- Un constructor debe recibir nombre y dirección, e iniciar el estacionamiento
    //con hora de apertura “8:00”, hora de cierre “21:00”, y para 5 pisos y 10 plazas
    //por piso. El estacionamiento inicialmente no tiene autos.
    public Estacionamiento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        horaAper="8:00";
        horaCierre="21:00";
        pisos=5;
        plazas=10;
        autos=new Auto[pisos][plazas];
    }
    
    //- Otro constructor debe recibir nombre, dirección, hora de apertura, hora de
    //cierre, el número de pisos (N) y el número de plazas por piso (M) e iniciar el
    //estacionamiento con los datos recibidos y sin autos. 
    public Estacionamiento(String nombre, String direccion, String horaAper, String horaCierre, int pisos, int plazas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaAper = horaAper;
        this.horaCierre = horaCierre;
        this.pisos = pisos;
        this.plazas = plazas;
        autos=new Auto[this.pisos][this.plazas];        
    }
        
    //que getters y setters son necesarios? como identificarlos?

    public Auto getAuto(int x, int y) {
        return autos[x][y];
    }
    
    
    //c) Implemente métodos para:
    //- Dado un auto A, un número de piso X y un número de plaza Y, registrar al auto
    //en el estacionamiento en el lugar X,Y. Suponga que X, Y son válidos (es decir,
    //están en rango 1..N y 1..M respectivamente) y que el lugar está desocupado.
    public void agregarAuto(Auto unAuto, int x, int y){
        autos[x-1][y-1]=unAuto;
        System.out.println("Se agregó el auto");
    }

    
    //- Dada una patente, obtener un String que contenga el número de piso y plaza
    //donde está dicho auto en el estacionamiento. En caso de no encontrarse,
    //retornar el mensaje “Auto Inexistente”.
    public String buscarAuto(String patente){
        String aux="";
        boolean encontrado=false;
        int x=0,y=0,k=0;
        while ((k<pisos*plazas)&&(!encontrado)){//en lugar de hacer un while puedo hacer dos for y salir con un return?
            if((getAuto(x,y) != null) && getAuto(x,y).getPatente().equals(patente)){
                encontrado=true;
                aux="El auto con patente: "+patente+" está en el piso "+(x+1)+" plaza "+(y+1);
            }else{
                if(y==plazas-1){
                    x++;
                    y=0;
                }else{
                    y++;
                }
                k++;                
            }
        }
        if(!encontrado){
            aux="Auto Inexistente";
        }
        return aux;
    }
    //- Obtener un String con la representación del estacionamiento. Ejemplo: “Piso 1
    //Plaza 1: libre Piso 1 Plaza 2: representación del auto …
    // Piso 2 Plaza 1: libre … etc”
    public String toString(){
        String aux=nombre+"\n";
        for(int x=0;x<pisos;x++){
            for(int y=0;y<plazas;y++){
                aux+="Piso "+(x+1)+" Plaza "+(y+1)+": ";
                if((getAuto(x,y)) != null){
                    aux += autos[x][y].toString();
                }else{
                    aux+="libre";
                }
                aux+="\n";
            }
        }
        return aux;
    }

    //- Dado un número de plaza Y, obtener la cantidad de autos ubicados en dicha
    //plaza (teniendo en cuenta todos los pisos).
    public int cantAutosPlazaY(int y){
        int cant=0;
        y--;
        for(int x=0;x<pisos;x++){
            if(autos[x][y] != null){
                cant++;
            }
        }
        return cant;
    }
    

    
}
