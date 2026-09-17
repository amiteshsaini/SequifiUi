package Sequifi.qa.utilities;

import Sequifi.qa.exceptions.MTPException;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;

public class Decrypt {

    private static final String KEY = "FFNura782EsasDnKUEhJ4FhV";
    private static byte[] keyArray = Base64.getDecoder().decode("FFNura782EsasDnKUEhJ4FhV");

    private Decrypt() {
        throw new IllegalStateException("Utility class");
    }

    public static String decryptText(String cipherText) throws MTPException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            byte[] iv = new byte[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1, 7, 7, 7, 7};
            IvParameterSpec ivspec = new IvParameterSpec(iv);
            keyArray = Arrays.copyOf(keyArray, 16);
            Key secretKey = new SecretKeySpec(keyArray, "AES");
            cipher.init(2, secretKey, ivspec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(cipherText)));
        } catch (Exception var5) {
            throw new MTPException("Invalid Password to Decrypt " + var5.getMessage());
        }
    }

}
