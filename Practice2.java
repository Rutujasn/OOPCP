/*import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.*;   
public class Practice2 extends EncryptionDescryptionAES{  
public static void main(String[] args) throws Exception {  
    JFrame f=new JFrame("OOP CP");
    final JTextField tf=new JTextField();  
    tf.setBounds(100,50, 200,50);  
    JButton b1=new JButton("Encrypt");  
    b1.setBounds(100,100,200,50);    
    f.add(b1); f.add(tf);
    b1.addActionListener(l -> {
        try {
            KeyGenerator k = KeyGenerator.getInstance("AES");
            k.init(128);
            SecretKey s = k.generateKey();
            tf.setText(encrypt(tf.getText(), s));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    });
    JButton b2=new JButton("Decrypt");  
    b2.setBounds(100,170,200,50);    
    f.add(b2);
    b1.addActionListener(l -> {
        try {
            KeyGenerator k = KeyGenerator.getInstance("AES");
            k.init(128);
            SecretKey s = k.generateKey();
            tf.setText(decrypt(tf.getText(), s));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    });
    f.setSize(500,500);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}*/