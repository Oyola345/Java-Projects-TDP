/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author MILEABI
 */
public class EjHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //B- Realice un programa que instancie un hotel, 
        Hotel hotel=new Hotel(20);
        
        //ingrese clientes en distintas habitaciones,
        hotel.ingresarC(new Cliente("Pepe",6897565, 45), 1);
        hotel.ingresarC(new Cliente("Marta",4522565, 52), 20);
        hotel.ingresarC(new Cliente("Lina",2322567, 40), 13);
        hotel.ingresarC(new Cliente("Carla",7537564, 28), 5);
        //muestre el hotel, 
        System.out.println(hotel.hToString());
        //aumente el precio de las habitaciones y vuelva a mostrar el hotel.
        hotel.aumentarPre(250);
        System.out.println();
        System.out.println(hotel.hToString());
    }
}
