/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dario
 */
public class Ordenamiento {

    public void ordenar(int [] dato){
         boolean flag = false;
         int tmp = 0, div = 1, aux;
          
       List<Integer>[] container = new ArrayList[10];
          for (int i = 0; i < container.length; i++) {
              container[i] = new ArrayList<Integer>();
          }
         
          while (!flag) {
              flag = true;
              
            for (int i : dato) {
              tmp = i/div;
              container[tmp % 10].add(i);
                
              if (flag && tmp > 0) {
                  flag = false;
              }
            }
            aux = 0;
            for (int b = 0; b < container.length; b++) {
              for (Integer i : container[b]) {
                dato[aux++] = i;
         
              }

              container[b].clear();
            }
            div*=10;
          }
        
    }
}
    

