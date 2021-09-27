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
public class ejercicio6Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dimF = 3;
        int dimL = 0;
        Partido[] partidos = new Partido[dimF];
        
        String local;
        String visitante;
        int golesLocal;
        int golesVisitante;
        
        System.out.println("Ingrese el nombre del equipo visitante");
        visitante = Lector.leerString();
        
        while((dimL != dimF) || (visitante.equals("ZZZ")) ) {
            System.out.println("Ingrese el nombre del equipo local");
            local = Lector.leerString();
            
            
            
            System.out.println("Ingrese la cantidad de goles que hizo el equipo local");
            golesLocal = Lector.leerInt();
            
            System.out.println("Ingrese la cantidad de goles que hizo el equipo visitante");
            golesVisitante = Lector.leerInt();
            
            partidos[dimL] = new Partido(local, visitante, golesLocal, golesVisitante);
            dimL++;
            
            System.out.println("Ingrese el nombre del equipo visitante");
            visitante = Lector.leerString();
            
        }
       
    
    }
   
}
