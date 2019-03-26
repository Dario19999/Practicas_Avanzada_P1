/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Radix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Ingresar la cantidad de numeros a ordenar:");
        int cant = in.nextInt();
        int[] dato = new int[cant]; 
        System.out.println("");
        
        for(int i = 0; i<cant; i++){
            System.out.println("Ingresar el dato #"+(i+1));
            dato[i] = in.nextInt();
        }
        
        Ordenamiento radix = new Ordenamiento();
        radix.ordenar(dato);
       
        
        for(int n: dato){
            System.out.print(n+" ");
        }
                
    }
    
}
