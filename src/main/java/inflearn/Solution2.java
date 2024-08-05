package inflearn;

import java.util.Scanner;

// 대소문자 변환
public class Solution2 {

    public static String solution(String line) {
        String tmp = "";
        char[] charArray = line.toCharArray();
        for (char ch : charArray) {
            if (Character.isLowerCase(ch)) {
                tmp += Character.toUpperCase(ch);
            }
            if (Character.isUpperCase(ch)) {
                tmp += Character.toLowerCase(ch);
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        solution(line);
        System.out.println(solution(line));
    }
}
