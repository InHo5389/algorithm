package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 -보물
public class Solution22 {

    public static int solution(int[] aArr, int[] bArr, int[] score) {
        int answer = 0;
        Arrays.sort(aArr);
        for (int i = 0; i < bArr.length; i++) {
            answer += aArr[score[i]] * bArr[i];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        int[] score = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (bArr[j] > bArr[i] || (bArr[i] == bArr[j] && j < i)) {
                    cnt++;
                    score[i] = cnt;
                }
            }
        }

        System.out.println(solution(aArr, bArr, score));
    }
}
