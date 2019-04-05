/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajon;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author dario
 */
public class Mensajon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TOO code application logic here
        
        byte[] x = new byte[20];
        byte[] y = "Hola".getBytes(StandardCharsets.UTF_8);
        
        try{
        
        Socket c1 = new Socket ("192.168.84.177", 5000);
        
        c1.getOutputStream().write(y);
        

        }catch(IOException e){
            System.out.println("No se pudo :(");
        }
        
    }
    
}