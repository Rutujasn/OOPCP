import java.util.Base64;    
import javax.crypto.Cipher;   
import javax.crypto.SecretKey;  
   
public class EncryptionDescryptionAES {

    static Cipher cipher;  

    public static void main(String[] args){
        System.out.println("Most Useless shit of all time");

        
    }

    public static String encrypt(String plainText, SecretKey secretKey)
            throws Exception {
        System.out.println(plainText);
        cipher = Cipher.getInstance("AES");
        byte[] plainTextByte = plainText.getBytes();
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedByte = cipher.doFinal(plainTextByte);
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(encryptedByte);
        return encryptedText;
    }

    public static String decrypt(String encryptedText, SecretKey secretKey)
            throws Exception {
        cipher = Cipher.getInstance("AES");
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedTextByte = decoder.decode(encryptedText);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
        String decryptedText = new String(decryptedByte);
        return decryptedText;
    }

	

    
}
