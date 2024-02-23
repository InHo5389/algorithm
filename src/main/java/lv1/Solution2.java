package lv1;

// 평균 구하기
public class Solution2 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int num : arr) {
            answer+=num;
        }
        return answer / arr.length;
    }
}
