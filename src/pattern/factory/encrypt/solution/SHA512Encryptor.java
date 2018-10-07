package pattern.factory.encrypt.solution;

public class SHA512Encryptor extends Encryptor {

	@Override
	public EncryptAlgorithm getEncryptionAlgorithm() {
		return new SHA512EncryptAlgorithm();
	}

}
