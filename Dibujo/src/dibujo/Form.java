/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author dario
 */
public class Form extends JFrame implements ActionListener {
    
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    
    private int x = 0, y = 0;
    
    public Form(){
        boton1 = new JButton("<");
        boton2 = new JButton(">");
        boton3 = new JButton("^");
        boton4 = new JButton("v");
        boton5 = new JButton("baile");
        
        config();
    }
    
    public void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Dibujo");
        this.getContentPane().setBackground(Color.white);
        this.setLayout(null);
        
        add(boton1);
        boton1.setBounds(0, 420, 100, 30);
        boton1.setBackground(Color.orange);
        boton1.addActionListener(this);
        
        add(boton2);
        boton2.setBounds(129, 420, 100, 30);
        boton2.setBackground(Color.orange);
        boton2.addActionListener(this);
        
        add(boton3);
        boton3.setBounds(259, 420, 100, 30);
        boton3.setBackground(Color.orange);
        boton3.addActionListener(this);
        
        add(boton4);
        boton4.setBounds(384, 420, 100, 30);
        boton4.setBackground(Color.orange);
        boton4.addActionListener(this);
        
        add(boton5);
        boton5.setBounds(194, 380, 100, 30);
        boton5.setBackground(Color.orange);
        boton5.addActionListener(this);
    }

    public void metodo_boton1(){
       x-=5;
       repaint();
    }
    
    public void metodo_boton2(){
        x+=5;
        repaint();
    }
    
    public void metodo_boton3(){
       y-=5;
       repaint();
    }
    
    public void metodo_boton4(){
       y+=5;
       repaint();
    }
    
    public void metodo_boton5(){
       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == boton1){
           metodo_boton1();
       }else if(ae.getSource() == boton2){
           metodo_boton2();
       }else if(ae.getSource() == boton3){
           metodo_boton3();
       }else if(ae.getSource() == boton4){
           metodo_boton4();
       }else if(ae.getSource() == boton5){
           metodo_boton5();
       }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        g.drawOval(230+x, 100+y, 50, 50);
        g.drawLine(255+x, 150+y, 255+x, 250+y);
        g.drawLine(220+x, 190+y, 290+x, 190+y);
        g.drawLine(255+x, 250+y, 280+x, 320+y);
        g.drawLine(255+x, 250+y, 230+x, 320+y);
       
    }
    
}
