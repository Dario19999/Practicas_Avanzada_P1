/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form_relativo;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dario
 */
public class Form2 extends JFrame{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public Form2(){
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton4 = new JButton("4");
    
        
        GroupLayout orden = new GroupLayout(this.getContentPane());
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
        
        //perspetiva horizontal
        orden.setHorizontalGroup(
            orden.createParallelGroup()
                .addGroup(orden.createSequentialGroup()
                    .addComponent(boton1,100,100,100)
                    .addComponent(boton2,25,25,25)
                )
                .addGroup(orden.createSequentialGroup()
                    .addComponent(boton3,50,50,50)
                    .addComponent(boton4,75,75,75)
                )
        );
        
        //perspectiva vertical
        orden.setVerticalGroup(
            orden.createSequentialGroup()
                .addGroup(orden.createParallelGroup()
                    .addComponent(boton1)
                    .addComponent(boton2)
                )
                .addGroup(orden.createParallelGroup()
                    .addComponent(boton3)
                    .addComponent(boton4)
                )
            
        );
        
        this.setLayout(orden);
        config();
        pack();
    }
    
    public void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Form Relativo");
    }
    
}
