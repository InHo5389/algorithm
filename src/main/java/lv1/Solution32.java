package lv1;

// 3진법 뒤집기
public class Solution32 {
    public int solution(int n) {
        int answer = 0;
        String tmp = "";
        while (n != 0) {
            tmp += String.valueOf(n % 3);
            n /= 3;
        }
        answer = Integer.parseInt(tmp,3);
        return answer;
    }
}
