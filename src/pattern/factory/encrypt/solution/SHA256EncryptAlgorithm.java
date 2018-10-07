package pattern.factory.encrypt.solution;

import org.apache.commons.codec.digest.DigestUtils;

public class SHA256EncryptAlgorithm implements EncryptAlgorithm {

	@Override
	public String encrypt(String text) {
		return DigestUtils.sha256Hex(text);
	}

}
