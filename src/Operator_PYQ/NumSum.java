package Operator_PYQ;

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        //Sum of Two Number in Java PYQ
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num a:-");
        Long a=sc.nextLong();

        System.out.println();

        System.out.print("Enter num b:-");
        Long b=sc.nextLong();

        Long Result=a+b;

        System.out.println("Sum of num a and b is:-"+Result);
    }
}
