/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author dario
 */
public class Form extends JFrame implements ActionListener {
    
    private JButton botones[][] = new JButton[4][4];
    private JTextField screen;
    
    public String term1, term2, termi1, termi2;
    public String op;
    
    public Form(){
        screen = new JTextField();
        config();
    }
    
    public void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setTitle("Calculadora");
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        
        String button_content [][] = {
            {"7","8","9","+"},
            {"4","5","6","-"},
            {"1","2","3","*"},
            {"i","0","=","/"}
            
        };
        
        int x_btn = 50, y_btn = 150;
        
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                botones[i][j] = new JButton(button_content[j][i]);
                botones[i][j].setBounds(x_btn+i*75, y_btn+j*75, 50, 50);
                add(botones[i][j]);
                botones[i][j].addActionListener(this);
                botones[i][j].setBackground(Color.orange);
            }
        }
        
        botones[2][3].setBackground(Color.red);
        add(screen);
        screen.setEditable(false);
        screen.setBounds(50, 50, 275, 50);
    }
    
    public void siete(){
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"7");
    }
    
    public void ocho(){
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"8");
    }
   
    private void nueve() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
      screen.setText(screen.getText()+"9");
    }

    private void cuatro() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
       screen.setText(screen.getText()+"4");
    }

    private void cinco() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"5");
    }

    private void seis() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"6");
    }

    private void uno() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
       screen.setText(screen.getText()+"1");
    }

    private void dos() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
      screen.setText(screen.getText()+"2");
    }

    private void tres() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"3");
    }

    private void cero() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"0");
    }
    
    private void mas() {
        if(screen.getText().isEmpty() || screen.getText().equals("Error")){
            screen.setText("Error");
        }else{
            screen.setText("");
            op = "+";
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==botones[0][0]){
            siete();
        }else if(ae.getSource()==botones[1][0]){
            ocho();
        }else if(ae.getSource()==botones[2][0]){
            nueve();
        }else if(ae.getSource()==botones[0][1]){
            cuatro();
        }else if(ae.getSource()==botones[1][1]){
            cinco();
        }else if(ae.getSource()==botones[2][1]){
            seis();
        }else if(ae.getSource()==botones[0][2]){
            uno();
        }else if(ae.getSource()==botones[1][2]){
            dos();
        }else if(ae.getSource()==botones[2][2]){
            tres();
        }else if(ae.getSource()==botones[1][3]){
            cero();
        }else if(ae.getSource()==botones[3][0]){
            mas();
        }
    }

    
    
}
