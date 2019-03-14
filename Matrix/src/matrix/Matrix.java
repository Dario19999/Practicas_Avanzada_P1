/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Matrix {
    Procedimiento mat_1, mat_2;
    Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix menu = new Matrix();
        
        menu.menu();
        
       
    }
    
    public void menu(){
        mat_1 = entrada();
        mat_2 = entrada();
        
         int opc;
        
        do{
            System.out.println("Seleccione uina operación a realizar");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- Traspuesta");
            System.out.println("5.- Inversa");
            System.out.println("6.- Determinante");
            System.out.println("9.- Salir");

            opc = in.nextInt();

            switch(opc){
                case 1:
                    System.out.println("\n res = " +mat_1.suma(mat_2).toString());
                    break;
                case 2:
                    System.out.println("\n res = " + mat_1.resta(mat_2));
                    break;
                case 3:
                    System.out.println("\n res = " + mat_1.multi(mat_2));
                    break;
                case 4:
                    System.out.println("\n res = " + mat_1.tras());
                    break;
                /*case 5:
                    System.out.println("\n res:\n" + mat_1.inv());
                    break;*/
                /*case 6:
                    System.out.println("\n res:\n" + mat_1.deter(mat_2));
                    break;*/
                    
            }
        }while(opc!=9);
    }
    
    public Procedimiento entrada(){
        
        System.out.println("ingresar tamaño de la  matriz");
        int tamaño = in.nextInt();
        
        Procedimiento mat = new Procedimiento(tamaño);
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.println("Ingrese el dato de la celda [" + i + ", " + j+ "]");
                double dato = in.nextInt();
                mat.agregar(i, j, dato);
            }
        }
        
        System.out.print(mat);
        return mat;
    }
}
    

