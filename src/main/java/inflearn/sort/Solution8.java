package inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

// 이분 검색
public class Solution8 {

    public static int solution(int m, int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) return mid + 1;
            if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(m,arr));
    }
}
