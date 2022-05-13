import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.*;   



public class Practice3 {
    public static void main(String[] args) throws Exception {  
        JFrame f=new JFrame("OOP CP");
        final JTextField tf=new JTextField();  
        tf.setBounds(100,50, 200,50);  
        JButton b1=new JButton("Encrypt");  
        b1.setBounds(100,100,200,50);    
        f.add(b1); f.add(tf);
        b1.addActionListener(new ActionListener(){  
    

            @Override
            public void actionPerformed(ActionEvent e) {
                EncryptionDescryptionAES obj= new EncryptionDescryptionAES(tf.getText());
                tf.setText(EncryptionDescryptionAES.getEN());

                
            }  
                });  

        JButton b2=new JButton("Decrypt");  
        b2.setBounds(100,170,200,50);    
        f.add(b2);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true); 
    
}
    
}
