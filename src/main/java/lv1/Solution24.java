package lv1;

// 약수의 개수와 덧셈
public class Solution24 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (measure(i)%2==0){
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }

    int measure(int num){
        int count = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0){
                count++;
            }
        }
        count++;
        return count;
    }
}
