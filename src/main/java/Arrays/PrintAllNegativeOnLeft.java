package Arrays;

public class PrintAllNegativeOnLeft {

    private static void transfer(int[] array){
        int j=0;
        for (int i=0 ; i<array.length ; i++){ //1, -5, 2, 5, -1 // -5, -1, 2, 5, 1
            if (array[i]<0){
                if (j!=i){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, -1, 6, -4, -5, 10, 7, -6};
        transfer(array);
        for (int i=0 ; i<array.length ; i++)
            System.out.print(array[i] + " ");
    }
}
