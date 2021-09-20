/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandojava;
import PaqueteLectura.Lector;
/**
 *
 * @author Lukeu
 */
public class ProbandoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
   int num;
   int i;
   int factorial;
    
    for(i= 1; i< 10; i++){
        int j;
        
        num = i;
        factorial = num;
        
        for(j = 1; j< num; j++){
            factorial = factorial * j;
        
        }
        
        System.out.println();
        System.out.println(num+"!: " + factorial);
       
       factorial = 0;
      
    }
    
    
    
    
    }
    
}
