package Programme;

import java.util.Arrays;

public class SortNumOrStr {
    public static void main(String[] args) {
        //Numeric Array Sort
        int[] num_sort={100,50,300,80,900};

        Arrays.sort(num_sort);
        System.out.println(Arrays.toString(num_sort));

        //String Array Sort
        String[] str_sort={
                "Data",
                "Ram",
                "Memory",
                "Programming",
                "Java",
                "Binary"
        };

        Arrays.sort(str_sort);
        System.out.println(Arrays.toString(str_sort));
    }
}
