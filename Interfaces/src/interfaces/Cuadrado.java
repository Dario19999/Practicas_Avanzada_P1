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
public class Cuadrado implements Figura {
    private double lado;
    
    public Cuadrado(){}
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double area(){
        
        return (lado*lado);
    }
    
    @Override
    public String nombre(){
        
        return "Cuadrado";
    }
}
