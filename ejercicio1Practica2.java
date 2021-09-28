/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author Lucas
 */
public class ejercicio1Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        
        
        System.out.println("Ingrese la medida del lado 1");
        double lado1 = Lector.leerDouble();
        
        System.out.println("Ingrese la medida del lado 2");
        double lado2 = Lector.leerDouble();
        
        System.out.println("Ingrese la medida del lado 3");
        double lado3 = Lector.leerDouble();
        
        System.out.println("Ingrese el color de relleno");
        String relleno = Lector.leerString();
        
         System.out.println("Ingrese el color del borde");
        String borde = Lector.leerString();
        
        
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3,relleno,borde);
        
        System.out.println("Perimetro " + triangulo.calcularPerimetro());
        
        System.out.println("----------");
        
        System.out.println("Area " + triangulo.calcularArea());
    }
    
}
