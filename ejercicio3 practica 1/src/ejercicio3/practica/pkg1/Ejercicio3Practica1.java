/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.practica.pkg1;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Lukeu
 */
public class Ejercicio3Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dimF = 5;
        int [] alturas = new int[dimF];
        int i;
        double prom = 0;
        int cont = 0;
        int j;
        int altura;
        
        for(i = 0; i < dimF; i++){
           
            altura = GeneradorAleatorio.generarInt(200);
            System.out.println("Jugador " + i + ": "  + altura + "cm");
            alturas[i] = altura ;
            prom= prom + alturas[i];
            
        }
        
               
        prom = prom / dimF;
        
        
        
        
        for(j = 0; j < alturas.length; j++){
            if(alturas[j] > prom){
                cont++;
            }
        }
        
        System.out.println("Promedio: " + prom);
        System.out.println("La cantidad de jugadores con altura mayor a la promedio es: " + cont);
        
    }
    
}
