/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author dario
 */
public class Calculo {
    String term1, term2, termi1, termi2, res, resi;
    char op1, op2, op3;
    double rr, ri;

    public Calculo(String term1, String term2, String termi1, String termi2, char op1, char op2, char op3) {
        this.term1 = term1;
        this.term2 = term2;
        this.termi1 = termi1;
        this.termi2 = termi2;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
    }
    
    public String calcular(){
        
        double t1, t2, ti1, ti2;
        termi1 = termi1.substring(0, termi1.length()-1);
        termi2 = termi2.substring(0, termi2.length()-1);
        
        t1 = Integer.parseInt(term1);
        t2 = Integer.parseInt(term2);
        ti1 = Integer.parseInt(termi1);
        ti2 = Integer.parseInt(termi2);
        
        switch(op2){
            case '+':
                if(op2 == '-'){
                    t2 = t2*-1;
                    ti2 = ti2*-1;
                }
                
                rr = t1 + t2;
                ri = ti1 + ti2;
            
                res = Integer.toString(rr);
        }
    }
}
