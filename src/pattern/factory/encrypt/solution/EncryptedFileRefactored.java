package pattern.factory.encrypt.solution;

import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptedFileRefactored {
	
	private String path;
	private String text;
	private EncryptAlgorithm encryptor;

	public EncryptedFileRefactored(String path, String text, EncryptAlgorithm e) {
		this.path = path;
		this.text = text;
		this.encryptor = e;
	}
	
	public void createEncryptedFile() {
		String cypherText = encryptor.encrypt(text);
		try (FileOutputStream outputStream = new FileOutputStream(path)) {
            outputStream.write(cypherText.getBytes());
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		// We can easily encrypt the contents of the file using a different encryption algorithm, by simply
		// varying the creator implementation ie. the encryptor
		EncryptedFileRefactored ef = new EncryptedFileRefactored("c://temp//secretfile.txt", "hello to everyone", 
				new SHA256EncryptAlgorithm());
		ef.createEncryptedFile();
	}
}
