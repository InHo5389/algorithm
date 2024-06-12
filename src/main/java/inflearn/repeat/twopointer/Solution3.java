package inflearn.repeat.twopointer;

import java.util.Scanner;

// 최대 매출
public class Solution3 {

    public static int solution(int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int rt = k; rt < arr.length; rt++) {
            sum += arr[rt] - arr[rt - k];
            answer = Math.max(answer, sum);
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
        int solution = solution(k, arr);
        System.out.println(solution);
    }
}
