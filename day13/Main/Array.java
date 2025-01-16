package Day13.Main;

import java.util.Arrays;

public class Array {
    public String sortArray(int[] arr) {
        if (arr == null) {
            return "Input array is null.";
        }
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Array s = new Array();

        System.out.println(s.sortArray(new int[]{5, 3, 8, 1, 2}));
        System.out.println(s.sortArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(s.sortArray(new int[]{5, 5, 3, 3, 1}));
        System.out.println(s.sortArray(new int[]{}));
        System.out.println(s.sortArray(null));
    }
}

