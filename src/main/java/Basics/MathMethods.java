package Basics;

import java.security.SecureRandom;
import java.util.Base64;

public class MathMethods {
    public static void main(String[] args) {
        byte[] ivBytes = generateRandomIV();
        String ivBase64 = Base64.getEncoder().encodeToString(ivBytes);
        System.out.println("IV (Base64): " + ivBase64);
    }

    public static byte[] generateRandomIV() {
        SecureRandom random = new SecureRandom();
        byte[] iv = new byte[16];
        random.nextBytes(iv);
        return iv;
    }
}