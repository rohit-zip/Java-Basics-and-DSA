package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 16-2023
 */
public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        /**
         x = 121 -> 1 + 20 + 100
         number = 0;
         number = 121%10 = 1 + (number*10) = 1
         x = 121/10 = 12

         12%10 = 2 + (number*10) = 2 + 10 = 12
         12/10 = 1

         1%10 = 1 + (number * 10) = 1 + 120 = 121
         1/10 = 0 -> x>0
         */

        /**
         x = 142
         number = 142%10 = 2 + (number * 10) = 2 + 0 = 2
         x = 142/10 = 14

         number = 14%10 = 4 + (number * 10) = 4 + 20 = 24
         x = 14/10 = 1

         number = 1%10 = 1 + (number * 10) = 1 + 240 = 241
         x = 1/10 = 0 -> x>0

         1764, 142, 1551, 161
         */

        int originalNumber = x;
        int number = 0;
        while(x>0){
            number = x%10 + number*10;
            x = x/10;
        }
        System.out.println(number);
        if(number == originalNumber){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(142);
    }
}
