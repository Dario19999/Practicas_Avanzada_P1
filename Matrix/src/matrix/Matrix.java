/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.Scanner;
import java.util.Arrays;

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
                    
                    
            }
        }while(opc!=0);
    }
    
    public Procedimiento entrada(String tx){
        tx = (tx == null)? "" : tx;
        
        System.out.println("ingrese el tamaño de la " + tx + " matriz");
        String tamaño = in.next();
        
        int [] tamañoInt = Arrays.stream(tamaño.split("x|\\*")).mapToInt(Integer::parseInt).toArray();
        Procedimiento mat = new Procedimiento(tamañoInt[0], tamañoInt[1]);
        
        for (int i = 0; i < tamañoInt[0]; i++) {
            for (int j = 0; j < tamañoInt[1]; j++) {
                System.out.println("Ingrese el valor de la posicion [" + i + ", " + j+ "]");
                double val = in.nextInt();
                mat.addElement(i, j, val);
            }
        }
        
        System.out.print(mat);
        return mat;
    }
}
    

