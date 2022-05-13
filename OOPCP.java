import java.awt.event.*;  
import javax.swing.*;    
import java.util.Base64;    
import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;   
import javax.crypto.SecretKey;  
import java.util.Scanner;
import java.awt.*;  
import java.awt.event.*;  
public class OOPCP {  
public static void main(String[] args) {  
    JFrame f=new JFrame("OOP CP");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
        }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    
    
}  
}  
