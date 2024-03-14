package lv1;

import java.util.Arrays;

// 예산
public class Solution33 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int num : d) {
            if (budget>=num){
                budget-=num;
                answer++;
            }
        }
        return answer;
    }
}
