package lv1;

// 이상한 문자 만들기
public class Solution34 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] splitStr = s.split("");

        for (String str : splitStr) {
            cnt = str.equals(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}
