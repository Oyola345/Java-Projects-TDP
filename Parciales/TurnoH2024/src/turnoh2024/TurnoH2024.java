/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnoh2024;

/**
 *
 * @author MILEABI
 */
public class TurnoH2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supermercado superm = new Supermercado("Super", "calle 123", 2, 2);
        superm.registrarProd(new Producto(2, "p0", "m1", 50, 2000));
        superm.registrarProd(new Producto(5, "p1", "m1", 20, 3000));
        superm.registrarProd(new Producto(6, "p2", "m2", 40, 1560));
        superm.registrarProd(new Producto(3, "p3", "m3", 35, 6000));
        
        System.out.println(superm.listarMenX("m1",1));
        System.out.println(superm.mayorGondola());
        System.out.println(superm.toString());
    }
    
}
