/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author matias
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jugador pablo = new jugador("messi",140,"ARGENTINO",29);
        System.out.println(pablo.getNombre());
        
         
        System.out.println("nombre "+pablo.getNombre()+"\n"+"nacionalidad "+pablo.getNacionalidad()+"\n"+"edad "+pablo.getEdad()+"\n"+"puntaje "+pablo.getPuntaje());
        
        
    }
   
}
