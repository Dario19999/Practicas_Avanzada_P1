/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author dario
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figura x;
        
        x = new Cuadrado(10);
        System.out.println(x.area());
        System.out.println(x.nombre());
        System.out.println("");
        
        x = new Circulo(10);
        System.out.println(x.area());
        System.out.println(x.nombre());
        System.out.println("");
        
        x = new Cilindro(10,20);
        System.out.println(x.area());
        System.out.println(x.nombre());
        System.out.println("");
        
        
        System.out.println(((Cilindro)x).volumen());
        System.out.println("");
        
        x = new Figura() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public String nombre() {
               return "nadie";
            }
        };
        
        System.out.println(x.area());
        System.out.println(x.nombre());
    }
    
}
