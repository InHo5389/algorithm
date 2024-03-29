package lv1;

// 시저 암호
public class Solution38 {
    public String solution(String s, int n) {
        String answer = "";
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer += ch;
            } else if (Character.isLowerCase(ch)) {
                answer += (char) ('a' + (ch + n - 'a') % 26);
            } else {
                answer += (char) ('A' + (ch + n - 'A') % 26);
            }
        }
        return answer;
    }
}
