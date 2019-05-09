package form_relativo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Form2 extends JFrame{

    JTextField Usr;
    JTextField Pass;
    JButton SignIn;
    JButton SignUp;
    GroupLayout groupLayout;
    JLabel UsrLabel;
    JLabel PassLabel;

    public Form2(){
        this.setTitle("CocoChat-Registro");
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(500,700));
        this.setPreferredSize(new Dimension(500, 700));
        this.revalidate();
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        groupLayout = new GroupLayout(this.getContentPane());
        componentConfig();
        groupConfig();
        this.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println(e.getComponent().getBounds().getSize());
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }
        });
    }

    public void componentConfig(){
        Usr = new JTextField();
        Pass = new JTextField();
        SignIn = new JButton("Sign In");
        SignUp = new JButton("Sign Up");
        UsrLabel = new JLabel("User:");
        PassLabel = new JLabel("Password:");
        
        SignIn.setBackground(Color.MAGENTA);
        SignUp.setBackground(Color.MAGENTA);
        
        SignIn.addActionListener(e -> {
            String user = Usr.getText();
            String pwd = Pass.getText();
        });
    }

    public void groupConfig(){
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup()
                .addComponent(UsrLabel)
                .addComponent(Usr, 450,450,450)
                .addComponent(PassLabel)
                .addComponent(Pass, 450,450,450)
                .addGroup(groupLayout.createSequentialGroup()
                    .addComponent(SignIn, 100,100,100)
                    .addComponent(SignUp,100,100,100)
                )
                        
        );

        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
                .addComponent(UsrLabel)
                .addComponent(Usr, 50,50,50)
                .addComponent(PassLabel)
                .addComponent(Pass, 50,50,50)
                .addGroup(groupLayout.createParallelGroup()
                    .addComponent(SignIn,50,50,50)    
                    .addComponent(SignUp,50,50,50)
                )
        );
        groupLayout.setAutoCreateContainerGaps(true);
        groupLayout.setAutoCreateGaps(true);
        this.setLayout(groupLayout);
        this.pack();
    }
}