package inflearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 가장 짧은 문자 거리
public class Solution11 {

    public static String solution(String s) {
        String answer = "";
        s = s + " ";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = solution(s);
        System.out.println(answer);
    }
}
