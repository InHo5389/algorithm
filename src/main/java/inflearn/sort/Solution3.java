package inflearn.sort;

import java.util.Arrays;

// 삽입 정렬
public class Solution3 {
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
