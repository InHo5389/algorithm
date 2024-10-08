package inflearn;

import java.util.Scanner;

// 중복 문자 제거
public class Solution6 {

    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String solution = solution(sc.nextLine());
        System.out.println(solution);
    }
}
