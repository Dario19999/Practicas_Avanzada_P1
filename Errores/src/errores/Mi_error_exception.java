/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

/**
 *
 * @author dario
 */
public class Mi_error_exception extends RuntimeException {
    
    public Mi_error_exception(String error_msg){
        super(error_msg);
    }
    
    
}
