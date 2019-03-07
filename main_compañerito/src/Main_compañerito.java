/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author dario
 */
public class Main_compañerito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float C, B, A;
                
               
                System.out.println("Ingrese el valor de 'a'");
                A = in.nextFloat();
                System.out.println("Ingrese el valor de 'b'");
                B = in.nextFloat();
                System.out.println("Ingrese el valor de 'c'");
                C = in.nextFloat();
                
                Formula data = new Formula(A, B, C);
                
                data.X1();
                System.out.println("X1 = "+data.resultado);
     
                data.X2();
                System.out.println("X2 = "+data.resultado);
    }
    
}
