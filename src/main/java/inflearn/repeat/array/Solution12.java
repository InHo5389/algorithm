package inflearn.repeat.array;

import java.util.Scanner;

/**
 * 멘토링
 * A학생이 멘토이고 B학새이 멘티면 A학생은 M번의 테스트에서 B학생보다 등수가 앞서야함
 * M번의 수학성적이 주어지면 짝을 만들수 있는 총 경우의 수를 구해라
 */
public class Solution12 {

    static int n, m;

    public static int solution(int[][] arr) {
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
                    if (pi<pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}
