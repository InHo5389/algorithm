package inflearn.repeat.array;

import java.util.Scanner;

// 격자판 최대합
public class Solution9 {

    static int n;

    public static int solution(int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr));
    }
}
