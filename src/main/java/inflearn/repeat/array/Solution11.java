package inflearn.repeat.array;

import java.util.Scanner;

/**
 * 임시 반장 정하기
 * - 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장 선정
 * - 임시 반장으로 정해진 학생의 번호를 출력
 */
public class Solution11 {

    static int n;

    public static int solution(int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
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

        return answer + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));

    }
}
