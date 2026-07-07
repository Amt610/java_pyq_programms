package Programme;

public class ArraySum {
    public static void main(String[] args) {
        //Sum of all Value in Array
        int[] sum_arr={3,4,5,7,9};
        int sum=0;

        for (int i:sum_arr){
            sum+=i;
        }
        System.out.println("the sum is: "+sum);
    }
}
