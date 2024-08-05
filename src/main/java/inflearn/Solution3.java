package inflearn;

import java.util.Scanner;

// 문장 속 단어
public class Solution3 {

    public static String solution(String line) {
        String tmp = "";
        int minValue = Integer.MIN_VALUE;
        String[] split = line.split(" ");
        for (String str : split) {
            if (str.length() > minValue) {
                minValue = str.length();
                tmp = str;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            String solution = solution(str);
            System.out.println(solution);
        }
    }
}
