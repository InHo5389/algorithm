package inflearn.array;

import java.util.Scanner;

// 봉우리
public class Solution11 {

    public static int solution(int m, int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) pi = l;
                        if (arr[k][l] == j) pj = l;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int solution = solution(m, n, arr);
        System.out.println(solution);
    }
}
