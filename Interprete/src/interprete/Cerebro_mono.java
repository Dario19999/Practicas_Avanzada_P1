/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interprete;

import java.util.ArrayList;

/**
 *
 * @author dario
 */
public class Cerebro_mono {
        
    public String iterator, value, operator_f, until, step;
    public String variable, operator_i, variable_2;
    public ArrayList<String> orders = new ArrayList<String>();

    public Cerebro_mono(String iterator, String value, String operator_f, String until, String step) {
        this.iterator = iterator;
        this.value = value;
        this.operator_f = operator_f;
        this.until = until;
        this.step = step;
    }

    public Cerebro_mono(String variable, String operator_i, String variable_2) {
        this.variable = variable;
        this.operator_i = operator_i;
        this.variable_2 = variable_2;
    }

    Cerebro_mono(ArrayList<String> orders) {
        
    }

   
    
    
    
    
    
}
