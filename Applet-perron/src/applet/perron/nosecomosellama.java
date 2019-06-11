/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet.perron;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author dario
 */
public class nosecomosellama extends JApplet implements ActionListener {
    
    private JTextField num_1;
    private JTextField num_2;
    private JTextField result;
    private JButton suma;
    private JButton resta;
    private JButton div;
    private JButton mult;
    
    @Override
    public void init(){
        num_1 = new JTextField();
        num_2 = new JTextField();
        result = new JTextField();
        suma = new JButton("sumar");
        resta = new JButton("restar");
        div = new JButton("div");
        mult = new JButton("mult");
        suma.addActionListener(this);
        resta.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        start();
    }
    
    public void start(){
        GroupLayout orden = new GroupLayout(this.getContentPane());
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
        
        orden.setHorizontalGroup(
            orden.createParallelGroup()
                    .addComponent(num_1,50,200,200)
                    .addComponent(num_2,50,200,200)
                    .addGroup(orden.createSequentialGroup()
                        .addComponent(suma,50,100,100)
                        .addComponent(resta,50,100,100)
                    )
                    .addGroup(orden.createSequentialGroup()
                        .addComponent(div,50,100,100)
                        .addComponent(mult,50,100,100)
                    )
                    .addComponent(result,50,200,200)
            );             
        
        orden.setVerticalGroup(
        
            orden.createSequentialGroup()
                .addComponent(num_1,50,50,50)
                .addComponent(num_2,50,50,50)
                .addGroup(orden.createParallelGroup()
                    .addComponent(suma,50,50,50)
                    .addComponent(resta,50,50,50)
                )
                .addGroup(orden.createParallelGroup()
                    .addComponent(div,50,50,50)
                    .addComponent(mult,50,50,50)
                )
                .addComponent(result,50,50,50)
        );
        
        setLayout(orden);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == suma ){
            suma();
        }else if(ae.getSource() == resta){
            resta();
        }else if(ae.getSource() == mult){
            mult();
        }else if(ae.getSource() == div){
            div();
        }
    }
    
    public void suma(){
        String term1, term2,resultado;
        int num1, num2;
        
        term1 = num_1.getText();
        term2 = num_2.getText();
        
        num1 = Integer.parseInt(term1);
        num2 = Integer.parseInt(term2);
        
        int res = num1 + num2;
        
        resultado = Integer.toString(res);
        
        result.setText(resultado);
    }
    private void resta() {
        String term1, term2,resultado;
        int num1, num2;
        
        term1 = num_1.getText();
        term2 = num_2.getText();
        
        num1 = Integer.parseInt(term1);
        num2 = Integer.parseInt(term2);
        
        int res = num1 - num2;
        
        resultado = Integer.toString(res);
        
        result.setText(resultado);
    }
    
    private void mult() {
        String term1, term2,resultado;
        int num1, num2;
        
        term1 = num_1.getText();
        term2 = num_2.getText();
        
        num1 = Integer.parseInt(term1);
        num2 = Integer.parseInt(term2);
        
        int res = num1 * num2;
        
        resultado = Integer.toString(res);
        
        result.setText(resultado);
    }
    
    private void div() {
        String term1, term2,resultado;
        int num1, num2;
        
        term1 = num_1.getText();
        term2 = num_2.getText();
        
        num1 = Integer.parseInt(term1);
        num2 = Integer.parseInt(term2);
        
        int res = num1 / num2;
        
        resultado = Integer.toString(res);
        
        result.setText(resultado);
    }
}
