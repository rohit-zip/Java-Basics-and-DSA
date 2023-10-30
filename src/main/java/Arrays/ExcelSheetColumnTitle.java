package Arrays;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Arrays
 * @created_on - 30 October-2023
 */
public class ExcelSheetColumnTitle {

    public static String transform(int data) {

        StringBuilder sb = new StringBuilder();
        while(data > 0) {
            data--;
            char ch = (char) ('A' + data % 26);
            sb.insert(0, ch);
            data = data / 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(transform(55));
    }
}
