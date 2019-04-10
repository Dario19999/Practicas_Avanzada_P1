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
public class Hilo1 extends Thread {
    
    
    public int n;
    @Override
    public void run(){
        for(int i = 1;i <= 1000000;i++){
            System.out.println(i + "-" + n);
        }
    }
}
