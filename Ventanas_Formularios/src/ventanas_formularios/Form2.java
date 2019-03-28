/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas_formularios;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dario
 */
public class Form2 extends JFrame implements ActionListener {
    
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JTextField texto1;
    
    public Form2(){
        boton1 = new JButton("Autodestruccion");
        boton2 = new JButton("Eyectar");
        boton3 = new JButton("Abortar");
        texto1 = new JTextField();
        config();
        
    }
    
    private void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setTitle("Hola_Mundo");
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        
        add(boton1);
        boton1.setBounds(0, 0, 130, 50);
        boton1.setBackground(Color.red);
        boton1.addActionListener(this);
        
        add(boton2);
        boton2.setBounds(0, 60, 130, 50);
        boton2.setBackground(Color.green);
        boton2.addActionListener(this);
        
        add(boton3);
        boton3.setBounds(0, 120, 130, 50);
        boton3.setBackground(Color.blue);
        boton3.addActionListener(this);
        
        add(texto1);
        texto1.setBounds(0,200,500,200);
    }
    
    public void metodo_boton1(){
        JOptionPane.showMessageDialog(null,texto1.getText());
    }
    
    public void metodo_boton2(){
        texto1.setText("ola k ase");
    }
    
    public void metodo_boton3(){
        System.exit(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent a){
       if(a.getSource() == boton1){
           metodo_boton1();
       }else if(a.getSource() == boton2){
           metodo_boton2();
       }else if(a.getSource() == boton3){
           metodo_boton3();
       }
    }
    
  
}
