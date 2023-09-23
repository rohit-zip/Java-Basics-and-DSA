package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 09 23-2023
 */

public class LargestWordInString {
    public static void main(String[] args) {
        String str = "my name is rohit parihar from pune";
        String[] strings = str.split(" ");
        //{"my", "name", "is", "rohit", "parihar"}

        int max = strings[0].length();
        int index = 0;
        for (int i=1 ; i<strings.length ; i++){
            if (strings[i].length() > max){
                max = strings[i].length();
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(strings[index]);
    }
}
