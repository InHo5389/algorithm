package lv1;

// 음양 더하기
public class Solution14 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }
        return answer;
    }
}
