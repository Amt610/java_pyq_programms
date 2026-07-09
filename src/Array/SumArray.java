package Array;

public class SumArray {
    public static void main(String[] args) {
        //Print Sum of Array
        int[] Sum_arr={25,45,36,98,74,63};
        int sum=0;

        for (int i:Sum_arr){
            sum+=i;
        }

        System.out.println("Total Sum of Array:-"+sum);
    }
}
