/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chamith
 */
public class DataEncryption {

    public static String encryptData(String text) throws NoSuchAlgorithmException{
        String encryptedText = null;

        
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            encryptedText = hash.toString();
            
            return encryptedText;
            
    } 
            
            
}
