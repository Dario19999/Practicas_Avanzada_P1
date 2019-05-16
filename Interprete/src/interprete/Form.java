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
import static java.util.Collections.list;
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
    
    private JButton btn_run;
    private JButton btn_compile;
    private JTextArea input;
    private JTextField output;
    
    private String fun;
    private String iterator, value, operator_f, until, step;
    private String variable, operator_i, variable_2;
    private String[] action = {"hola_izq", "hola_der", "patada_izq", 
    "patada_der", "bailar", "split", "wave", "si", "no", "caminar_izq"};
    
    private boolean endFor = false, endIf = false;
    
    private int intIterator = 0, cont = 0;
    
    public Form(){
        
        btn_run = new JButton("Correr");
        btn_compile = new JButton("Compilar");
        input = new JTextArea();
        output = new JTextField();
        
        config();
    }
    
    public void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,650);
        this.setTitle("Dibujo");
        this.getContentPane().setBackground(Color.white);
        this.setLayout(null);
 
        add(btn_run);
        btn_run.setBounds(575,510 , 100, 30);
        btn_run.setBackground(Color.red);
        btn_run.addActionListener(this);
        
        add(btn_compile);
        btn_compile.setBounds(575,550 , 100, 30);
        btn_compile.setBackground(Color.red);
        btn_compile.addActionListener(this);
        
        add(output);
        output.setBounds(500, 0, 250, 200);
        output.setEditable(false);
        
        add(input);
        input.setBounds(500,210,250,290);
        input.setBackground(Color.LIGHT_GRAY);
        input.setCaretPosition(0);
        
    }

    public void run(){
        
        
        
    }
    
    public void compile(){
        
        int cont = 0;
        
       fun = input.getText();
       String components[] = fun.split(" ");
       
       for(int j = 1; j <= components.length; j++){
           cont++;
        }
       input.setText("");
       
       switch(components[0]){
           case "for":
               iterator = components[1];
               value = components[2];
               operator_f = components[3];
               until = components[4];
               step = components[5];
               
               output.setText(components[0] + "(" + iterator + "=" + value + "; " + operator_f + until +"; " + step +")");
               
            break;
               
            case "if":
               variable = components[1];
               operator_i = components[2];
               variable_2 = components[3];
               
               output.setText(output.getText() + "\n" + components[0] + "(" + variable + operator_i + variable_2 + ")");
               
            break;
               
       }
        

    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btn_compile){
            compile();
        }else if(ae.getSource() == btn_run){
            run();
        }
        
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        g.drawOval(230, 100, 50, 50);
        g.drawLine(255, 150, 255, 250);
        g.drawLine(220, 190, 290, 190);
        g.drawLine(255, 250, 280, 320);
        g.drawLine(255, 250, 230, 320);
       
    }
    
}
