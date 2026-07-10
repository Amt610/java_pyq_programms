package Array;

public class EvenArray {
    public static void main(String[] args) {
        //Array
        int[] arr={1,2,3,4,5,6,7,8,9};

        int even=0;

        for (int i:arr){
            if (i%2==0){
                even++;
            }
        }

        System.out.println("Even Element: "+even);
    }
}
