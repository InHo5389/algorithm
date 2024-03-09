package lv1;

// 부족한 금액 계산하기
public class Solution26 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 1; i <= count; i++) {
            answer += i * price;
        }
        return answer - money < 0 ? 0 : answer - money;
    }
}
