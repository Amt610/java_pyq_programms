package Array;

public class AvgArray {
    public static void main(String[] args) {
        //Array Average
        int[] avg_arr={25,14,36,78,56};

        int sum=0;

        for (int i:avg_arr){
            sum+=i;
        }

        int result=sum/ avg_arr.length;

        System.out.println("Array Average:-"+result);
    }
}
