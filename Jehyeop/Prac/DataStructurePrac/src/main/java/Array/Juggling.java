package Jehyeop.Prac.DataStructurePrac.src.main.java.Array;

import java.util.Arrays;
// 저글링 3회만 가능 ( 최대 공약수를 활용한 방법을 이해하지 못해서 내 방식으로 만들어봤다.)
public class Juggling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int index = 3; // 넘길 index 값
        int times = 3; // 돌리는 횟수
        move(arr, times, index);
    }

    public static void move(int[] arr, int times, int index) {
        for (int k=0; k<times; k++) {
            int[] remember = temp(arr, index, k);
            for (int i=0; i<arr.length/index; i++){
                if ((i*index)+k < index) {
                    arr[arr.length - (index-i-k)] = remember[i];
                }else {
                    arr[((i-1)*index)+k] = remember[i];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[] temp(int[] arr, int index, int times) {
        int[] remember = new int[arr.length/index]; // size
        for (int i=0; i<remember.length; i++){
            remember[i] = arr[i*index+times];
        }
        System.out.println(Arrays.toString(remember));
        return remember;
    }
}
