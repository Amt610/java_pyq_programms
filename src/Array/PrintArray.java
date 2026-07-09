package Array;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        //Print Array Programme
        int[] print_arr={12,55,36,48,23,69,45};

        //method 1 Print
        System.out.println("Method 1");
        System.out.println(Arrays.toString(print_arr));

        System.out.println("Method 2");

        //method 2 Print;
        for (int i:print_arr){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Method 3");

        //method 3 Print
        for (int i = 0; i < print_arr.length; i++) {
            System.out.print(print_arr[i]+" ");
        }
    }
}
