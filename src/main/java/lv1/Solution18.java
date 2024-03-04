package lv1;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Solution18 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(num -> num % divisor == 0).toArray();
        if (answer.length == 0){
            answer = new int[]{-1};
        }
        Arrays.sort(answer);
        return answer;
    }
}
