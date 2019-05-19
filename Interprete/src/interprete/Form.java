/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interprete;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dario
 */
public class Form extends JFrame implements ActionListener {
    
    private JButton btn_compile;
    private JTextArea input;
    private JTextArea output;
    private Color color = new Color(0,0,0);
    
    private String fun;
    private String iterator, operator;
    private String[] line;
    
    private int intIterator = 0, cont = 0, cont_enter, value, until, variable, variable_2;
    
    int ra = 0, la = 0 ,rlx = 0, rly = 0, llx = 0, lly = 0, hx = 0, hy = 0;
    
    public Form(){
        
        btn_compile = new JButton("Compilar");
        input = new JTextArea();
        output = new JTextArea();
        
        config();
    }
    
    public void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,650);
        this.setTitle("Dibujo");
        this.getContentPane().setBackground(Color.white);
        this.setLayout(null);
        
        add(btn_compile);
        btn_compile.setBounds(575,550 , 100, 30);
        btn_compile.setBackground(Color.red);
        btn_compile.addActionListener(this);
        
        add(output);
        output.setBounds(500, 0, 250, 350);
        output.setBackground(Color.LIGHT_GRAY);
        output.setCaretPosition(0);
        output.setEditable(false);
        
        add(input);
        input.setBounds(500,360,250,90);
        input.setBackground(Color.LIGHT_GRAY);
        input.setCaretPosition(0);     
    }
    
    public void run(String[] line){
        for(int i = 1; i < line.length; i++){
            switch(line[i]){
                case "hola_der":
                    ra = ra-40;
                    repaint();
                break;
                
                case "hola_izq":
                    la = la+40;
                    repaint();
                break;
                
                case "patada_der":
                    rlx = rlx+20;
                    rly = rly-65;
                    repaint();
                break;
                
                case "patada_izq":
                    llx = llx-20;
                    lly = lly-65;
                    repaint();
                break;
                        
                case "baile":
                    ra = ra-40;
                    llx = llx-20;
                    lly = lly-65;
                    repaint();
                    la = la+40;
                    rlx = rlx+20;
                    rly = rly-65;
                    repaint();
                break;
                
                case "wave":
                    ra = ra-40;
                    repaint();
                    la = la+40;
                    repaint();
                break;
                
                case "split":
                    rlx = rlx+20;
                    rly = rly-65;
                    llx = llx-20;
                    lly = lly-65;
                    repaint();
                break;
                
                case "si":
                    hy=hy+10;
                    repaint();
                break;
                
                case "no":
                    hx=hx+10;
                    repaint();
                    hx=hx-20;
                    repaint();
                break;
                
                case "color":
                    color = new Color(252,128,49);
                    repaint();
                break;     
            }
        }
    }
    
    public void compile(){
 
        fun = input.getText();
        String line[] = fun.split("\n");
        
        for(cont_enter = 0; cont_enter < line.length; cont_enter++){
            String components[] = line[cont_enter].split(" ");

            switch(components[0]){
                case "for":
                    iterator = components[1];
                    value = Integer.parseInt(components[2]);
                    operator = components[3];
                    until = Integer.parseInt(components[4]);
                    
                    switch(operator){
                        case "<":
                            for(int i = value; i < until; i++){
                                run(line);
                            }
                        break;
                        
                        case ">":
                            for(int i = value; i > until; i--){
                                run(line);
                            }
                        break;
                        
                        case "<=":
                            for(int i = value; i <= until; i++){
                                run(line);
                            }
                        break;
                        
                        case ">=":
                            for(int i = value; i >= until; i--){
                                run(line);
                            }
                        break;
                    }   
                break;

                case "if":
                    variable = Integer.parseInt(components[1]);
                    operator = components[2];
                    variable_2 = Integer.parseInt(components[3]);
                    
                    switch(components[2]){
                        case "<":
                            if(variable < variable_2){
                                run(line);
                            }
                        break;
                        case ">":
                            if(variable > variable_2){
                                run(line);
                            }
                        break;
                        case "<=":
                            if(variable <= variable_2){
                                run(line);
                            }
                        break;
                        case ">=":
                            if(variable >= variable_2){
                                run(line);
                            }
                        break;
                        case "==":
                            if(variable == variable_2){
                                run(line);
                            }
                        break;
                    }
                break;
                
            }
        }
        output.setText(input.getText());
        input.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btn_compile){
            compile();
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(color);
        g.drawOval(230+hx, 100+hy, 50, 50); //head
        g.drawLine(255, 150, 255, 250); //torso
        g.drawLine(220, 190+la, 290, 190+ra); //arms
        g.drawLine(255, 250, 280+rlx, 320+rly); //right_leg
        g.drawLine(255, 250, 230+llx, 320+lly); //left_leg   
    }
}
