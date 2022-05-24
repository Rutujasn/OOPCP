import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.*;

public class Practice3 {
    static EncryptionDescryptionAES obj;
    public static KeyGenerator keyGenerator;
    public static SecretKey secretKey;
    public static void main(String[] args) throws Exception {
        
        try {
            keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128); // block size is 128bits
            secretKey = keyGenerator.generateKey();

        } catch (Exception e1) {
            System.out.println("Init Ishu");
        }

        JFrame f = new JFrame("OOP CP");
        final JTextField tf = new JTextField();
        tf.setBounds(100, 50, 200, 50);
        JButton b1 = new JButton("Encrypt");
        b1.setBounds(100, 100, 200, 50);
        f.add(b1);
        f.add(tf);
        
        final JTextField kf = new JTextField();
        kf.setBounds(100, 250, 200, 50);
        f.add(kf);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tf.setText(EncryptionDescryptionAES.encrypt(tf.getText(), secretKey));
                    kf.setText(secretKey.toString());
                } catch (Exception e1) {
                    System.out.println("Function Ishu");
                }
            }
        });

        JButton b2 = new JButton("Decrypt");
        b2.setBounds(100, 170, 200, 50);
        f.add(b2);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        System.out.println(secretKey.toString());
                        tf.setText(EncryptionDescryptionAES.decrypt(tf.getText(), secretKey));
                    } catch (Exception e1) {
                        System.out.println("Function Ishu");
                        e1.printStackTrace();
                    }
                } catch (Exception e1) {
                    System.out.println("Init Ishu");
                }
            }
        });
    }

}
