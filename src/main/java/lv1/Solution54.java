package lv1;

import java.util.Arrays;

// 기사단원의 무기
public class Solution54 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            int gcd = gcd(i + 1);
            if (limit >= gcd) {
                arr[i] = gcd;
            }else {
                arr[i] = power;
            }
        }

        answer = Arrays.stream(arr).sum();
        return answer;
    }

    public int gcd(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) count++;
        }
        return count + 1;
    }
}
