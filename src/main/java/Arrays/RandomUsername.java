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
        StringBuilder stringBuilder = new StringBuilder(replacedEmail);
        for (int i=0 ; i<6 ; i++) {
            int randomNumber = random.nextInt(characters.length());
            String randomCharacter = characters.charAt(randomNumber) + "";
            stringBuilder.append(randomCharacter);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        /**
         *
         * Email -> Email -> Create Username which includes Email Plus some random characters with 5 length
         */
        System.out.println(generateUsername("rohitparih@gmail.com"));
    }
}
