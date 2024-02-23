package lv1;

// 나머지가 1이되는 수 찾기
public class Solution1 {
    public int solution(int n) {
        int answer = 1;
        while (n % answer != 1) {
            answer++;
        }
        return answer;
    }
}
