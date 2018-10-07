package pattern.factory.encrypt.solution;

import org.apache.commons.codec.digest.DigestUtils;

public class SHA512EncryptAlgorithm implements EncryptAlgorithm {

	@Override
	public String encrypt(String text) {
		return DigestUtils.sha512Hex(text);
	}

}
