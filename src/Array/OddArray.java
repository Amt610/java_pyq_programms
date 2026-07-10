package Array;

public class OddArray {
    public static void main(String[] args) {
        //Odd Array
        int[] arr={1,2,3,4,5,6,7,8,9};

        int count=0;

        for (int i:arr){
            if (i%2==1){
                count++;
            }
        }

        System.out.println("Total Odd num: "+count);
    }
}
