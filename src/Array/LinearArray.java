package Array;

import java.util.Scanner;

public class LinearArray {
    public static void main(String[] args) {
        //Linear Search
        int[] arr={25,36,85,69,45};

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Target:-");
        int target= sc.nextInt();

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                System.out.println("Found Target:-"+target);
                return;
            }
        }

        System.out.println("Not Found");
        sc.close();
    }
}
