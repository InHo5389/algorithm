package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소용돌이 패턴 출력 프로그램
 */
public class Solution40 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        int rows = r2 - r1 + 1; // 2 - (-3) + 1 = 6 rows
        int cols = c2 - c1 + 1; // 0 - (-3) + 1 = 4 columns
        int[][] result = new int[rows][cols];

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                // (0,0)으로 만들기 위해 i - r1, j-c1을 해줬음
                result[i - r1][j - c1] = getValueAt(i,j);
            }
        }

        // 최대 자릿수 계산
        int maxLength = 0;
        for (int[] row : result) {
            for (int num : row) {
                maxLength = Math.max(maxLength, String.valueOf(num).length());
            }
        }

        // 결과 출력
        for (int[] row : result) {
            for (int num : row) {
                System.out.printf("%" + maxLength + "d ", num);
            }
            System.out.println();
        }
    }

    /**
     * 1. 해당 좌표가 속한 '껍질'의 크기를 결정하기 위해 r과 c의 절대값 중 큰 값을 max로 설정
     * 2. 해당 껍질의 최대값을 계산
     * 3. 단 변에 있다면(r == max) 최대값에서 (max - c)를 뺀다.
     * 그렇지 않다면 value에서 2max를 빼고, 좌측 변 검사로 넘어간ㄷ.
     * 좌측 변에 있다면(c == -max) 현재 value에서 (max - r)을 뺀다.
     * 아니라면 다시 2max를 빼고 하단 변 검사로 갑니다.
     * 하단 변에 있다면(r == -max) value에서 (max + c)를 뺀다.
     * 마지막으로, 이 모든 경우가 아니라면(우측 변이거나 내부) 2max를 한 번 더 빼고 (max + r)을 뺀 값을 반환
     */
    private static int getValueAt(int r, int c) {
        int max = Math.max(Math.abs(r), Math.abs(c));
        int value = (2 * max + 1) * (2 * max + 1);

        // 상단 변
        if (r == max) return value - (max - c);
        value -= 2 * max;
        // 좌측 변
        if (c == -max) return value - (max - r);
        value -= 2 * max;
        // 하단 변
        if (r == -max) return value - (max + c);
        value -= 2 * max;
        return value - (max + r);
    }
}
