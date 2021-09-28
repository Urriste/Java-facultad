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
public class ejercicio2Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dimF = 3;
        
        
       Persona p = new Persona();
       Persona [] personas = new Persona [dimF];
       String nombre;
       int dni;
       int edad;
       
        for (int i = 0; i < dimF; i++) {
            System.out.println("Ingrese su nombre");
            nombre = Lector.leerString();
            
            System.out.println("Ingrese su DNI");
            dni =  Lector.leerInt();
            
            System.out.println("Ingrese su edad");
            edad =  Lector.leerInt();
            
            personas[i] = new Persona(nombre, dni, edad);
            
        }
        
        
        System.out.println();
        System.out.println("--------------------------------------");
       
        //Informar cantidad de personas mayores a 65 anios  y tomar los datos del que tiene menor edad
        int cantMayores = 0;

        
        int edadAComparar = 65;
        int edadActual;
        
        for (int i = 0; i < dimF; i++) {
            edadActual = personas[i].getEdad();
            if(edadActual > edadAComparar){
                cantMayores = cantMayores + 1;
            }
           
        }
        
        System.out.println("La cantidad de personas con edad mayor a 65 es: " + cantMayores);
        
        
        System.out.println();
        System.out.println("--------------------------------------");
        
        int min = 99999;
        int posMenorPersona = 0;
        
        for (int j = 0; j < dimF; j++) {
             if(personas[j].getEdad() < min){
                min = personas[j].getEdad();
                posMenorPersona = j;
            }
        }
        
        
        System.out.println("La persona de menor edad es " + personas[posMenorPersona].getNombre() + " cuya edad es " + personas[posMenorPersona].getEdad() + " con DNI " + personas[posMenorPersona].getDNI() );
      
    }
    
}
