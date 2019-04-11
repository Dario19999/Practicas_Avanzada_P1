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
    
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private JButton btn_0;
    private JButton btn_igual;
    private JButton btn_mas;
    private JButton btn_menos;
    private JButton btn_por;
    private JButton btn_entre;
    private JButton btn_i;
    private JButton btn_ce;
    
    private JTextField screen;
    
    public String term1, term2, termi1, termi2;
    public char op, op1, op2, op3, minus;
    int cont = 0;
    
    public Form(){
        
        btn_1 = new JButton("1");
        btn_2 = new JButton("2");
        btn_3 = new JButton("3");
        btn_4 = new JButton("4");
        btn_5 = new JButton("5");
        btn_6 = new JButton("6");
        btn_7 = new JButton("7");
        btn_8 = new JButton("8");
        btn_9 = new JButton("9");
        btn_0 = new JButton("0");
        btn_igual = new JButton("=");
        btn_mas = new JButton("+");
        btn_menos = new JButton("-");
        btn_por = new JButton("*");
        btn_entre = new JButton("/");
        btn_i = new JButton("i");
        btn_ce = new JButton("CE");
        
        screen = new JTextField();
        config();
    }
    
    public void config(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(460,500);
        this.setTitle("Calculadora");
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        
        add(screen);
        screen.setEditable(false);
        screen.setBounds(50, 50, 350, 50);
        
        add(btn_1);
        btn_1.setBounds(50, 300, 50, 50);
        btn_1.setBackground(Color.orange);
        btn_1.addActionListener(this);
        
        add(btn_2);
        btn_2.setBounds(125, 300, 50, 50);
        btn_2.setBackground(Color.orange);
        btn_2.addActionListener(this);
        
        add(btn_3);
        btn_3.setBounds(200, 300, 50, 50);
        btn_3.setBackground(Color.orange);
        btn_3.addActionListener(this);
        
        add(btn_4);
        btn_4.setBounds(50, 225, 50, 50);
        btn_4.setBackground(Color.orange);
        btn_4.addActionListener(this);
        
        add(btn_5);
        btn_5.setBounds(125, 225, 50, 50);
        btn_5.setBackground(Color.orange);
        btn_5.addActionListener(this);
        
        add(btn_6);
        btn_6.setBounds(200, 225, 50, 50);
        btn_6.setBackground(Color.orange);
        btn_6.addActionListener(this);
        
        add(btn_7);
        btn_7.setBounds(50, 150, 50, 50);
        btn_7.setBackground(Color.orange);
        btn_7.addActionListener(this);
        
        add(btn_8);
        btn_8.setBounds(125, 150, 50, 50);
        btn_8.setBackground(Color.orange);
        btn_8.addActionListener(this);
        
        add(btn_9);
        btn_9.setBounds(200, 150, 50, 50);
        btn_9.setBackground(Color.orange);
        btn_9.addActionListener(this);
        
        add(btn_0);
        btn_0.setBounds(125, 375, 50, 50);
        btn_0.setBackground(Color.orange);
        btn_0.addActionListener(this);
        
        add(btn_igual);
        btn_igual.setBounds(200, 375, 50, 50);
        btn_igual.setBackground(Color.red);
        btn_igual.addActionListener(this);
        
        add(btn_mas);
        btn_mas.setBounds(275, 375, 50, 50);
        btn_mas.setBackground(Color.orange);
        btn_mas.addActionListener(this);
        
        add(btn_menos);
        btn_menos.setBounds(275, 300, 50, 50);
        btn_menos.setBackground(Color.orange);
        btn_menos.addActionListener(this);
        
        add(btn_por);
        btn_por.setBounds(275, 225, 50, 50);
        btn_por.setBackground(Color.orange);
        btn_por.addActionListener(this);
       
        add(btn_entre);
        btn_entre.setBounds(275, 150, 50, 50);
        btn_entre.setBackground(Color.orange);
        btn_entre.addActionListener(this);
        
        add(btn_ce);
        btn_ce.setBounds(350, 150, 50, 125);
        btn_ce.setBackground(Color.orange);
        btn_ce.addActionListener(this);
        
        add(btn_i);
        btn_i.setBounds(50, 375, 50, 50);
        btn_i.setBackground(Color.orange);
        btn_i.addActionListener(this);
    }
    
    //numeros
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
   
    public void nueve() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
      screen.setText(screen.getText()+"9");
    }

    public void cuatro() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
       screen.setText(screen.getText()+"4");
    }

    public void cinco() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"5");
    }

    public void seis() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"6");
    }

    public void uno() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
       screen.setText(screen.getText()+"1");
    }

    public void dos() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
      screen.setText(screen.getText()+"2");
    }

    public void tres() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"3");
    }

    public void cero() {
        if(screen.getText().equals("Error")){
            screen.setText("");
        }
        screen.setText(screen.getText()+"0");
    }
    
    public void i(){
        if(screen.getText().isEmpty() || screen.getText().equals("Error")){
            screen.setText("Error");
        }else{
            screen.setText(screen.getText()+"i");
        }
    }
    //operaciones
    public void mas() {
        if(screen.getText().isEmpty() || screen.getText().equals("Error")){
            screen.setText("Error");
        }else{
            op = '+';
            contComparation(op);
            screen.setText("");
            
        }
    }

    public void menos(){
        if(screen.getText().isEmpty()){
            screen.setText("-");
        }else{
            op = '-';
            contComparation(op);
            screen.setText("");
        }
    }
    
    public void por(){
        if(screen.getText().isEmpty() || screen.getText().equals("Error")){
            screen.setText("Error");
        }else{
            op = '*';
            contComparation(op); 
            screen.setText("");
        }
    }
    
    public void entre(){
        if(screen.getText().isEmpty() || screen.getText().equals("Error")){
            screen.setText("Error");
        }else{
            op = '/';
            contComparation(op);
            screen.setText("");
        }
    }
    
    public void igual(){
        if(screen.getText().isEmpty() || screen.getText().equals("Error")){
            screen.setText("Error");
        }else{
            termi2 = screen.getText();
            Calculo calc = new Calculo(term1, term2, termi1, termi2, op1, op2, op3);
            
            calc.calcular();
            screen.setText(calc.res);
        }
    }
    
    public void ce(){
        screen.setText("");
        term1 = null;
        term2 = null;
        termi1 = null;
        termi2 = null;
        op = '\u0000';
        op1 = '\u0000';
        op2 = '\u0000';
        cont = 0;
    }
    
    public void contComparation(char op){
        
        if(cont == 3){
            cont = 0;
        }
                
        cont+=1;
        
        switch(cont){              
            case 1:
                term1 = screen.getText();
                op1 = op;
                break;
            case 2:
                if(screen.getText().endsWith("i")){
                    termi1 = screen.getText();
                    op2 = op;
                }else{
                    screen.setText("Error");
                }
                break;
            case 3:
                
                term2 = screen.getText();
                op3 = op;
                break;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn_7){
            siete();
        }else if(ae.getSource()==btn_8){
            ocho();
        }else if(ae.getSource()==btn_9){
            nueve();
        }else if(ae.getSource()==btn_4){
            cuatro();
        }else if(ae.getSource()==btn_5){
            cinco();
        }else if(ae.getSource()==btn_6){
            seis();
        }else if(ae.getSource()==btn_1){
            uno();
        }else if(ae.getSource()==btn_2){
            dos();
        }else if(ae.getSource()==btn_3){
            tres();
        }else if(ae.getSource()==btn_0){
            cero();
        }else if(ae.getSource()==btn_mas){
            mas();
        }else if(ae.getSource()==btn_menos){
            menos();
        }else if(ae.getSource()==btn_por){
            por();
        }else if(ae.getSource()==btn_entre){
            entre();
        }else if(ae.getSource()==btn_igual){
            igual();
        }else if(ae.getSource()==btn_i){
            i();
        }else if(ae.getSource()==btn_ce){
            ce();
        }
    }
}