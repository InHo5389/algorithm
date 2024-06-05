package inflearn.twopointer;

import java.util.Scanner;

// 연속 부분수열
public class Solution4 {

    public static int solution(int[] arr, int m) {
        int answer = 0;
        int sum = 0, lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
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

        int solution = solution(arr, m);
        System.out.println(solution);
    }
}
