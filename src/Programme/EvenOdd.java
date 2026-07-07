package Programme;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Print Even or Odd Number
        System.out.println("Check Number is Even or Odd");
        System.out.print("Enter number:- ");

        Scanner sc=new Scanner(System.in);
        int a=sc.nextByte();

        if (a%2==0){
            System.out.println("You Entered Even number: "+a);
        }else {
            System.out.printf("You Entered Odd Number: "+a);
        }

    }
}
