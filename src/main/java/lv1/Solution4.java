package lv1;

// 짝수와 홀수
public class Solution4 {
    public String solution(int num) {
        num = Math.abs(num);
        return num % 2 == 1 ? "Odd":"Even";
    }
}
