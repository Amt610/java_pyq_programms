package Array;

public class MaxArray {
    public static void main(String[] args) {
        //Array
        int[] max_arr={12,54,36,17,25};

        int max=max_arr[0];

        for (int i = 0; i < max_arr.length; i++) {
            if (max_arr[i]>max){
                max=max_arr[i];
            }
        }

        System.out.println("Array Max Element:-"+max);
    }
}
