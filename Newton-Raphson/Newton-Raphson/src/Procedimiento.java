/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dario
 */
public class Procedimiento {
    public double[][] termino, der;
    public double  pot;

    public Procedimiento(double[][] termino,  double pot) {
        this.termino = termino;
        this.der = new double[100][2];
        this.der = der;
        this.pot = pot;
         for(int i=0; i<=pot; i++){
            der[i][0] = termino[i][0]*termino[i][1];
            der[i][1] = termino[i][1]-1;
        }
    }
    
    public double calculo(double xi){
       double x = xi;
       double res = 0;
       double res_der = 0;
       
       for(int i = 0; i<=pot; i++){
           res = res + termino[i][0]*(Math.pow(x, termino[i][1]));
           res_der = res_der + der[i][0]*(Math.pow(x, der[i][1]));
       }
       
        System.out.println(" R = "+res+"    R_derivada = "+res_der+"    x = "+x);
        
        x = x - (res/res_der);
        
        if(Math.abs(res)<=.000001){
            return xi;
        }
        else{
            return calculo(x);
        }
    }
    
}
