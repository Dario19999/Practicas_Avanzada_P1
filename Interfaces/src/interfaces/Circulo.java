/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author dario
 */
public class Circulo implements Figura {
    private double radio;
    
    public Circulo(){}
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double area(){
        
        return (3.1416*(radio*radio));
    }
    
    @Override
    public String nombre(){
        
        return "Circulo";
    }
}
