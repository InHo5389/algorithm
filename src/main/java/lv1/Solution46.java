package lv1;

// 콜라 문제
public class Solution46 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (true) {
            if (a > n) break;

            answer += n / a * b;
            int remain = n % a;
            n = n / a * b + remain;
        }
        return answer;
    }
}
