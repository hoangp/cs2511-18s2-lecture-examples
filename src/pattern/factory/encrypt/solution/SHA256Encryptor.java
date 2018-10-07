package pattern.factory.encrypt.solution;

public class SHA256Encryptor extends Encryptor {

	

	@Override
	public EncryptAlgorithm getEncryptionAlgorithm() {
		return new SHA256EncryptAlgorithm();
	}
	
}
