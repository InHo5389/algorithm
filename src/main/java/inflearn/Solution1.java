package inflearn;

import java.util.Scanner;

// 문자 찾기
public class Solution1 {

    public static int solution(String line, char c) {
        String lowerCase = line.toLowerCase();
        int count = 0;
        for (char ch : lowerCase.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char c = sc.next().toLowerCase().charAt(0);
        solution(line, c);
        System.out.println(solution(line, c));
    }
}
