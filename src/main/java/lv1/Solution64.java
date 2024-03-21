package lv1;

import java.util.HashMap;
import java.util.HashSet;

// 체육복
public class Solution64 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n+2];
        int answer = 0;

        for (int i : lost) {
            student[i]--;
        }
        for (int i : reserve) {
            student[i]++;
        }

        for (int i = 1; i <=n ; i++) {
            if (student[i] == 1){
                if (student[i-1] == -1){
                    student[i]--;
                    student[i-1]++;
                }else if (student[i+1] == -1){
                    student[i]--;
                    student[i+1]++;
                }
            }
        }

        for (int i = 1; i <= n ; i++) {
            if (student[i] >= 0) answer++;
        }
        return answer;
    }
}
