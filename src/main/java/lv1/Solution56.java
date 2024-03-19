package lv1;

// 소수 찾기
public class Solution56 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) answer++;
        }
        return answer;
    }

    boolean isPrime(int number) {
        for (int i = 2; i <=(int)Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
