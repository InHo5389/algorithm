package lv1;

// 자연수 뒤집어 배열로 만들기
public class Solution8 {
    public int[] solution(long n) {
        String numString = String.valueOf(n);
        int[] answer = new int[numString.length()];
        int cnt = 0;

        while (n > 0) {
            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }
        return answer;
    }
}
