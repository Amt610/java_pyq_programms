package Programme;

public class ArrayAvg {
    public static void main(String[] args) {
        //Array
        int[] arr_avg={25,36,48,69,45};

        int sum=0;
        int arr_len=0;
        for (int i = 1; i <arr_avg.length; i++) {
            sum+=i;

        }

        int result=sum/arr_len;
        System.out.println("Array List Average is:-"+result);
    }
}
