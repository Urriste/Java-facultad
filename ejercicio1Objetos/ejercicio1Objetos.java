/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author Lukeu
 */
public class ejercicio1Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Persona p = new Persona(); 
       
        System.out.println("Ingrese su nombre");
        p.setNombre(Lector.leerString());
       
        System.out.println("Ingrese su DNI");
        p.setDNI(Lector.leerInt());
        
        System.out.println("Ingrese su edad");
        p.setEdad(Lector.leerInt());
    
        System.out.println(p.toString());
    
    }
    
    
}
