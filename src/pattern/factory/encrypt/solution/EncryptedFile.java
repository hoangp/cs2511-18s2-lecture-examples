package pattern.factory.encrypt.solution;

public class EncryptedFile {
	
	private String path;
	private String text;
	private Encryptor encryptor;

	public EncryptedFile(String path, String text, Encryptor e) {
		this.path = path;
		this.text = text;
		this.encryptor = e;
	}
	
	public void createEncryptedFile() {
		encryptor.writeToDisk(text, path);
	}

	public static void main(String[] args) {
		// We can easily encrypt the contents of the file using a different encryption algorithm, by simply
		// varying the creator implementation ie. the encryptor
		EncryptedFile ef = new EncryptedFile("c://temp//secretfile.txt", "hello to everyone", new SHA256Encryptor());
		ef.createEncryptedFile();
	}
}
