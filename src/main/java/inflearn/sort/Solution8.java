package inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

// 이분 검색
public class Solution8 {

    public static int solution(int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        int solution = solution(m, arr);
        System.out.println(solution);
    }
}
