/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RECEPTION;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author BOZZA MAN
 */
public class Login {
    
public static void main(String[]args) {
    
    JFrame myframe =new JFrame ("System Login");//giving the frame a title
    myframe.setSize(400, 200);//setting size of frame
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel mypanel = new JPanel();
    myframe.add(mypanel);
    placecomponent(mypanel);
    myframe.setVisible(true);  //displays the panel 
    
}

    private static void placecomponent(JPanel mypanel) {
 mypanel.setLayout(null);
 
            JLabel userLabel = new JLabel("Username : ");
            userLabel.setBounds(10, 10, 80, 25);
            mypanel.add(userLabel);
            
            JTextField userText = new JTextField (20);
            userText.setBounds(100, 10, 160, 25);
            mypanel.add(userText);
            
            JLabel passwordLabel = new JLabel("Password: ");
            passwordLabel.setBounds(10, 40, 80, 25);
            mypanel.add(passwordLabel);
            
            JPasswordField passwordText = new JPasswordField(20);
            passwordText.setBounds(100, 40, 160, 25);
            mypanel.add(passwordText);
            
            JButton login = new JButton("Login");
            login.setBounds(10, 80, 80, 25);
            mypanel.add(login);
            
    }
}
    
    
  
