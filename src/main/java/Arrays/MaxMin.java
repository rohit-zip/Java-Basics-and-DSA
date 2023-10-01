package Arrays;

public class MaxMin {

    private static int max(int[] array){
        int max = array[0];
        for (int i=1 ; i<array.length ; i++){
            int a = Math.max(max, array[i]);
            max = a;
        }
        return max;
    }

    private static int min(int[] array){
        int min = array[0];
        for (int i=1 ; i<array.length ; i++){
            int a = Math.min(min, array[i]);
            min = a;
        }
        return min;
    }



    public static void main(String[] args) {
        System.out.println(min(new int[]{1, 2, 4, 8, 5}));
    }
}
