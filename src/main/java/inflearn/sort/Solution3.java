package inflearn.sort;

import java.util.Scanner;

// 삽입 정렬
public class Solution3 {

    public static int[] solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                }else break;
            }

            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] solution = solution(arr);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
