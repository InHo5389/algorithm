package lv1;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class Solution25 {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split);

        for (int i = split.length-1; i >= 0 ; i--) {
            answer+=split[i];
        }
        return answer;
    }
}
