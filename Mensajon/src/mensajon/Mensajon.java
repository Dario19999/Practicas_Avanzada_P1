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
        
        try{
            Socket gutiServer = new Socket("192.168.84.75", 5000);
            String msgEnviado = "Mamamela amor";
            byte[] msgRecibido = new byte[500];
            
           /* Thread.sleep(1000);
            gutiServer.getOutputStream().write(msgEnviado.getBytes(StandardCharsets.UTF_8));
            System.out.println("mensje enviado");*/
            
            while(new String (msgRecibido) != "exit"){
                gutiServer.getInputStream().read(msgRecibido);
                System.out.println(new String(msgRecibido, StandardCharsets.UTF_8));
            }
            
            Thread.sleep(1000);
            gutiServer.close();
            
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }    
    }
}