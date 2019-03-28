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
public class Cilindro implements Figura {
    
    private double radio, h;
    public Cilindro(){}
    
    public Cilindro(double radio, double h){
        this.radio = radio;
        this.h = h;
    }
    
    @Override
    public double area(){
        
        return((2*3.1416)*radio*h);
    }
    
    @Override
    public String nombre(){
        
        return "Cilindro";
    }
    
    public double volumen(){
        
        return ((3.1416*radio*radio)*h);
    }
}
