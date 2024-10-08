package inflearn;

import java.util.Scanner;

// 회문 문자열
public class Solution7 {

    public static String solution(String str) {
        String answer = "YES";
        String lowerCase = str.toLowerCase();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (lowerCase.charAt(lt) == lowerCase.charAt(rt)) {
                lt++;
                rt--;
            }else return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String solution = solution(sc.nextLine());
        System.out.println(solution);
    }
}
