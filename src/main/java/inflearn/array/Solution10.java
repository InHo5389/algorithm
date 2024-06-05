package inflearn.array;

import java.util.Scanner;

// 임시 반장 정하기
public class Solution10 {

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num + 1][6];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int solution = solution(num, arr);
        System.out.println(solution);
    }
}
