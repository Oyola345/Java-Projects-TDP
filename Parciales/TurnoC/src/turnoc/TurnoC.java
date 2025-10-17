/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnoc;

/**
 *
 * @author MILEABI
 */
public class TurnoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa emp=new Empresa("calle 1",50000,5,3);
        emp.setNombre("Storage");
        //int DNI, String nombre, int telefono, String localidad, 
        //boolean seguroAd
        emp.ingresarCliente(new Cliente(23323232,"Rogelio",2525251,"Los Hornos", true));
        emp.ingresarCliente(new Cliente(56433845,"Marta",5464715,"La Plata", false));
        emp.ingresarCliente(new Cliente(46457159,"Maria",45978215,"Ensenada", true));
        emp.ingresarCliente(new Cliente(13457468,"Martin",46579875,"Los Hornos", true));
        emp.ingresarCliente(new Cliente(46984548,"Manuel",46478548,"Los Hornos", true));
        emp.ingresarCliente(new Cliente(75648595,"Manuela",79849495,"Los Hornos", true));
        emp.ingresarCliente(new Cliente(46451875,"Mauro",64758787,"Punta Lara", false));
        System.out.println(emp.listaLhSectorX(1));
        System.out.println(emp.listaLhSectorX(2));
        System.out.println(emp.listaLhSectorX(3));
        
        System.out.println("Sector con mas seguros:" + emp.sectorMasSeguros());
        
        System.out.println(emp.toString());
    }
    
}
