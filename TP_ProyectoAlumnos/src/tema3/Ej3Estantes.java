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
public class Ej3Estantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que instancie un estante. Cargue varios libros. 
        Estante est1=new Estante(20);
        est1.agregarLib(new Libro( "Cien años de soledad", "Sudamericana", 1967, new Autor("Gabriel García Márquez", "Premio Nobel", "Colombia") , "978-84-376-0494-7", 15.50 ));
        est1.agregarLib(new Libro( "1984", "Secker & Warburg", 1949, new Autor("George Orwell", "Distopía política", "Inglaterra"), "978-84-9989-094-1", 12.99 ));
        est1.agregarLib(new Libro("El Principito", "Reynal & Hitchcock", 1943, new Autor("Antoine de Saint-Exupéry", "Aviador escritor", "Francia"), "978-607-07-2804-9", 8.75));
        est1.agregarLib(new Libro("Don Quijote de la Mancha", "Francisco de Robles", 1605, new Autor("Miguel de Cervantes", "Máximo exponente", "España"), "978-84-233-4018-3", 20.00));
        est1.agregarLib(new Libro("Crónica de una muerte anunciada", "La Oveja Negra", 1981, new Autor("Gabriel García Márquez", "Realismo mágico", "Colombia"), "978-84-9759-420-1", 10.25));
        est1.agregarLib(new Libro("Mujercitas", "Roberts Brothers", 1868, new Autor("Louisa May Alcott", "Novela clásica", "Estados Unidos"), "978-0141321042", 11.50));
   
        //A partir del estante,busque e informe el autor del libro “Mujercitas”.
        System.out.println(est1.buscarLibro("Mujercitas").getPrimerAutor().getNombre());
    }
    
}
