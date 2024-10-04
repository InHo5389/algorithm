package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 상자 넣기

/**
 * dy[i]의 값은 i번째 상자를 포함하여 만들 수 있는 가장 긴 증가하는 부분 수열의 길이
 *
 */
public class Solution41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dy = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxBoxes = 0;

        // 각 상자를 순회
        for (int i = 0; i < n; i++) {
            // dy 배열은 각 위치까지의 최대 상자 개수를 저장하며, 초기값은 1
            dy[i] = 1;
            // 현재 상자보다 앞에있는 모든 상자를 검사
            for (int j = 0; j < i; j++) {
                // 현재 상자가 이전 상자보다 크다면 현재 값과 '이전 상자까지의 최대 개수 + 1' 중 큰 값을 선택
                if (arr[j] < arr[i]) {
                    dy[i] = Math.max(dy[i], dy[j] + 1);
                }
            }
            // 최대 상자 개수 구하기
            maxBoxes = Math.max(maxBoxes, dy[i]);
        }

        System.out.println(maxBoxes);
    }
}
