package baekjoon;

import java.util.Scanner;

/**
 * 소설을 여러장 나누어 쓰는데 각 장은 각각 다른 파일에 저장한다.
 * 최종적으로 소설의 완성본이 들어있는 한 개의 파일을 만든다.
 * 이 과정에서 두개 씩 합쳐서 파일을 합쳐나가 하나의 파일로 합침
 * 두개의 파일을 합칠 때 필요한 비용이 두 파일 크기의 합
 * 최종적인 한 개의 파일을 완성하는데 필요한 비용의 총 합 계산
 */
public class Solution32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스의 수

        for (int t = 0; t < T; t++) {
            int K = sc.nextInt();  // 장의 수
            int[] files = new int[K + 1];
            int[] sum = new int[K + 1];

            for (int i = 1; i <= K; i++) {
                files[i] = sc.nextInt();
                sum[i] = sum[i - 1] + files[i];  // 누적 합 계산
            }

            int[][] dp = new int[K + 1][K + 1];

            for (int len = 2; len <= K; len++) {
                for (int i = 1; i <= K - len + 1; i++) {
                    int j = i + len - 1;
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum[j] - sum[i - 1]);
                    }
                }
            }

            System.out.println(dp[1][K]); // 최종 결과 출력
        }
    }
}
