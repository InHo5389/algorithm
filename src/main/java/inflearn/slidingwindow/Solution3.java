package inflearn.slidingwindow;

import java.util.Scanner;

// 최대 매출
public class Solution3 {

    public static int solution(int[] arr, int k) {
        int answer = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+= arr[i];
        }
        answer = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i-k];
            answer = Math.max(answer,sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(arr, k);
        System.out.println(solution);
    }
}
