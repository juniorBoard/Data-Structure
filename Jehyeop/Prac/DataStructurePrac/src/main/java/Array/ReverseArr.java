package Jehyeop.Prac.DataStructurePrac.src.main.java.Array;

import java.util.Arrays;

public class ReverseArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverse(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
