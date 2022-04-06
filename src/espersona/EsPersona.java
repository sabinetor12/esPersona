/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espersona;

/**
 *
 * @author Lenovo
 */
public class EsPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("ciao","ciao","bcdfgh11zzzzzzzz");
        Persona p2 = new Persona("ciao","ciao","bcdfgh11zzzzzzzz");
        System.out.println(p1.isOmonimo(p2));
    }
    
}
