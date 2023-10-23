package Arrays;

import java.util.Random;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 23 October-2023
 */

public class RandomUsername {

    public static String generateUsername(String email) {
        // rohit@gmail.com
        // [rohit, gmail.com]
        String[] emailParts = email.split("@"); // [rohit, gmail.com]
        String emailFirstPart = emailParts[0]; // rohit
        String replacedEmail = emailFirstPart.replace(".", "");

        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz!@#$%^&*";
        String randomString = "";
        for (int i=0 ; i<6 ; i++) {
            int randomNumber = random.nextInt(characters.length());
            String randomCharacter = characters.charAt(randomNumber) + "";
            randomString = randomString + randomCharacter;
        }
        return replacedEmail + randomString;
    }

    public static void main(String[] args) {
        /**
         *
         * Email -> Email -> Create Username which includes Email Plus some random characters with 5 length
         */
        System.out.println(generateUsername("rohit.parihar@gmail.com"));

        StringBuilder sb = new StringBuilder();
        sb.append("Rohit");
        sb.append("Parihar");
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rhit");
        stringBuilder.insert(1, "o");
        System.out.println(stringBuilder);
    }
}
