package inflearn;

import java.util.Scanner;

// 유효한 팰린드롬
public class Solution8 {

    public static String solution(String str) {
        String answer = "NO";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (tmp.equals(str)) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String solution = solution(sc.nextLine());
        System.out.println(solution);
    }
}
