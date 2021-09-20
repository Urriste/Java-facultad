/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4practica1;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Lucas
 */
public class Ejercicio4practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila = 10;
        int col = 10;
        int [][] matriz = new int [fila][col];
        int i,j,k;
        int [] vColumnas = new int[10];
        
        //inicializo la matriz
        for(i = 0; i < fila; i++){
            for(j = 0; j < col; j++){
                matriz[i][j] = GeneradorAleatorio.generarInt(10);                                 
            }
        }
        
        //muestro todo su contenido
        for (k = 0; k < fila; k++) {
            for (int l = 0; l < col; l++) {
                System.out.print(matriz[k][l] + " ");
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");
        
        // sumar elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
        int total = 0;
        
        for (int l = 2; l < 10; l++) {
            for (int m = 0; m < 4; m++) {
                total = total + matriz[l][m];
            }
        }
     
        System.out.println("Total f-2-9 col-0-3: " + total);
        
        
        System.out.println();
        System.out.println("------------------------------------------------------------");
       // vector de la suma de las columnas i
       
       int totalCols = 0;
        for (int s = 0; s < 10; s++) {
            for (int x = 0; x < 10; x++) {
                totalCols = totalCols  + matriz[x][s];
            }
            vColumnas[s] = totalCols;
            totalCols = 0;
            System.out.println("Columna " + s + ": " + vColumnas[s]);
        }
        
         System.out.println();
        System.out.println("------------------------------------------------------------");
        
        //buscar valor dentro de la matriz
        System.out.println("Ingrese un valor para buscar en la matriz");
        int valorBuscado = Lector.leerInt();
        for (int ñ = 0; ñ < 10; ñ++) {
            for (int p = 0; p < 10; p++) {
                if(matriz[ñ][p] == valorBuscado){
                    System.out.println("Valor encontrado en la posicion " + "f" + ñ + " c" + p);
                }
                
            }
        }
        
        
    }
    
}
