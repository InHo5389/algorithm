package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 줄 세우기
 */
public class Solution42 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dy = new int[n];
        int maxLength = 0;

        // LIS 알고리즘 적용
        for (int i = 0; i < n; i++) {
            dy[i] = 1; // 각 원소는 그 자체로 길이 1의 부분 수열
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dy[i] = Math.max(dy[i], dy[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dy[i]);
        }

        // 전체 아이들 수에서 가장 긴 증가하는 부분 수열의 길이를 뺌
        int minMoves = n - maxLength;

        System.out.println(minMoves);
    }
}
