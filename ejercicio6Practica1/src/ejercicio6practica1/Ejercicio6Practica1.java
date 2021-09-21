/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6practica1;
import PaqueteLectura.Lector;
/**
 *
 * @author Lucas
 */
public class Ejercicio6Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dimF = 5;
        int [] operaciones = new int [dimF];
        
        //Leer operaciones hasta que se ingrese la numero 5
        System.out.println("Ingrese el numero de la operacion que desea realizar");
        System.out.println("0: Cobro de Cheques - 1: Deposito/Extraccion - 2: Pago de impuestos - 3: Cobro de jubilacion - 4: Cobro de planes");
        int op = Lector.leerInt();
        
        while(op != 5){
            
            operaciones[op]++;
            System.out.println("Ingrese el numero de la operacion que desea realizar");
            System.out.println("0: Cobro de Cheques - 1: Deposito/Extraccion - 2: Pago de impuestos - 3: Cobro de jubilacion - 4: Cobro de planes");
            op = Lector.leerInt();
        }
        
        System.out.println();
        System.out.println("---------------------------------------");
        
        
        //Sacar Maximo
        int max = -1;
        int posMax = 0;
        
        for (int i = 0; i < dimF; i++) {
            if(operaciones[i] > max){
                max = operaciones[i];
                posMax = i;
            }
        }
        System.out.println("El elemento maximo es: " + posMax);
        
        
        System.out.println();
        System.out.println("---------------------------------------");
      
        // Imprimir cantidad de operaciones
      
        for (int i = 0; i < dimF; i++) {
            System.out.println("Operacion " + i + ": " + operaciones[i]);
        }
        //
        
    }
    
}
