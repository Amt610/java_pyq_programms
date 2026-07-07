package Programme;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblems {
    public static void main(String[] args) {
        //Array
        int[] arr={10,20,30,40,50}; //fixed size and same data type
        System.out.println(Arrays.toString(arr));; //print array first method


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }//print array second method

        //ArrayList
        ArrayList<Integer> integers=new ArrayList<>();

        integers.add(50);
        integers.add(40);
        integers.add(30);
        integers.add(20);
        integers.add(10);

        System.out.println();
        System.out.println("ArrayList Collection framework");
        System.out.println(integers);
    }
}
