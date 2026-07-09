package Operator_PYQ;

import java.util.Scanner;

public class DivisibleByNum {
    public static void main(String[] args) {
        //Check number is divisible by input num or not take both to user
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num:-");
        int num=sc.nextInt();

        System.out.println();

        System.out.print("Enter divisible num:-");
        int divisible=sc.nextInt();

        if (num%divisible==0){
            System.out.println(num+" is divisible by "+divisible);
        }else{
            System.out.println("No thank try next num...");
        }
    }
}
