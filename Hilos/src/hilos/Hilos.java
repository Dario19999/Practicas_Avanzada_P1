/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author dario
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Thread uno = new Thread (new Hilo2 (0));
       Thread dos = new Thread (new Hilo2(1));
       uno.start();
       dos.start();
    }
    
}
