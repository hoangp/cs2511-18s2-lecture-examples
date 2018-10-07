package pattern.factory.encrypt.solution;

import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Encryptor {
	
	// Factory method
	
	public abstract EncryptAlgorithm getEncryptionAlgorithm();
	
	// Concrete method
	public void writeToDisk(String plaintext, String filename) {
        EncryptAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String cyphertext = encryptionAlgorithm.encrypt(plaintext);
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            outputStream.write(cyphertext.getBytes());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    

}
