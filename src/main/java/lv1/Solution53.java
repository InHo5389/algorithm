package lv1;

import java.util.Arrays;

// 과일 장수
public class Solution53 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length - m; i >= 0; i-=m) {
            answer += score[i] * m;
        }
        return answer;
    }
}
