/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5practica1;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Lucas
 */
public class Ejercicio5practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pisos = 8;
        int oficinas = 4;
        
        int [][] edificio = new int[pisos][oficinas];
        
        System.out.println("Ingrese el piso al cual quiere ir");
        int piso = Lector.leerInt();
        while (piso != 9 ) {
            System.out.println("Ingrese la oficina a la cual quiere ir");
            int oficina = Lector.leerInt();
            edificio[piso][oficina]++;
            System.out.println("Ingrese el piso al cual quiere ir");
            piso = Lector.leerInt();
        }
            
        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < oficinas; j++) {
                System.out.println("Piso " + i + " oficina " + j + ": " + edificio[i][j]);
            }
        }
              
        
    }
    
}
