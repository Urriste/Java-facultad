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
        
        String local = "";
        String visitante = "";
        int golesLocal = 0;
        int golesVisitante = 0;
        
        System.out.println("Ingrese el nombre del equipo visitante");
        visitante = Lector.leerString();
        
        while((!visitante.equals("ZZZ")) && (dimL < dimF)  ) {
            
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
        
        
        //Ver cuantos partidos ganó River || Goles de Boca hechos de local || Porcentaje de empates
         
        int cantRiver = 0;
        int golesBocaLocal = 0;
        int cantEmpates = 0;
        
        for (int i = 0; i < dimL; i++) {
      
          if (partidos[i].getGanador().equals("River")){        
              cantRiver++;
          }    
          
          if(partidos[i].getLocal().equals("Boca")){
              golesBocaLocal += partidos[i].getGolesLocal();
          }
          
          if(partidos[i].hayEmpate()){
              cantEmpates++;
          }
          
        }
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_");
        
        System.out.println("La cantidad de partidos que ganó river es: " + cantRiver);
        
        System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_");
        
        System.out.println("La cantidad de goles que convirtió Boca de local es: " + golesBocaLocal);
        
         System.out.println();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_");
        
        
        double porcentajeEmpate = cantEmpates / dimL;
         System.out.println("El porcentaje de empates es: %" + porcentajeEmpate);
        
    }
   
}
