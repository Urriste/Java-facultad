/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author Lucas
 */
public class ejercicio4Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int dimF = 10;
        
        String[] textos= new String [dimF];
        String palabra;
        
        for (int i = 0; i < dimF; i++) {
            System.out.println("Ingrese su palabra");
            palabra = Lector.leerString();
            textos[i] = palabra;
            
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.print(textos[j].charAt(0));
        }
        
        
    }
    
}
