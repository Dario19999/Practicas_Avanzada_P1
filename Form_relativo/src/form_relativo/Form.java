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
public class Form extends JFrame{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton boton10;
    
    public Form(){
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton4 = new JButton("4");
        boton5 = new JButton("5");
        boton6 = new JButton("6");
        boton7 = new JButton("7");
        boton8 = new JButton("8");
        boton9 = new JButton("9");
        boton10 = new JButton("10");
        
        GroupLayout orden = new GroupLayout(this.getContentPane());
        orden.setAutoCreateContainerGaps(true);
        orden.setAutoCreateGaps(true);
        
        //perspetiva horizontal
        orden.setHorizontalGroup(
            orden.createSequentialGroup()
                .addGroup(orden.createParallelGroup()
                    .addGroup(orden.createSequentialGroup()
                        .addGroup(orden.createParallelGroup()
                            .addGroup(orden.createSequentialGroup()
                                .addComponent(boton1)
                                .addComponent(boton2)
                            )
                            .addComponent(boton3)
                        )
                        .addComponent(boton5)
                    )
                    .addComponent(boton4)
                    .addGroup(orden.createParallelGroup()
                        .addGroup(orden.createSequentialGroup()
                            .addComponent(boton6)
                            .addComponent(boton7)
                        )
                        .addGroup(orden.createSequentialGroup()
                            .addComponent(boton8)
                            .addComponent(boton9)
                        )
                    )
                )
            .addComponent(boton10)
        );
        
        //perspectiva vertical
        orden.setVerticalGroup(
            orden.createParallelGroup()
                .addGroup(orden.createSequentialGroup()
                    .addGroup(orden.createParallelGroup()
                        .addGroup(orden.createSequentialGroup()
                            .addGroup(orden.createParallelGroup()
                                .addGroup(orden.createSequentialGroup()
                                    .addComponent(boton1)
                                    .addComponent(boton2)
                                )
                                .addComponent(boton3)
                            )
                            .addComponent(boton5)
                        )
                        .addComponent(boton4)
                        .addGroup(orden.createSequentialGroup()
                            .addComponent(boton6)
                            .addComponent(boton7)
                        )
                        .addGroup(orden.createSequentialGroup()
                            .addComponent(boton8)
                            .addComponent(boton9)
                        )
                    )
                    .addComponent(boton10)
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
