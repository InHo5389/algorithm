package inflearn.sort;

import java.util.Arrays;

// 선택 정렬
public class Solution1 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 4};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
