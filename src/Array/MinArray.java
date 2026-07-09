package Array;

public class MinArray {
    public static void main(String[] args) {
        //Array
        int[] min_arr={14,35,45,96,48};

        int min=min_arr[0];

        for (int i = 0; i < min_arr.length; i++) {
            if (min_arr[i]<min){
                min=min_arr[i];
            }
        }

        System.out.println("Min Array:-"+min);
    }
}
