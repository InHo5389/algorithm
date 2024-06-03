package inflearn;

import java.util.Scanner;

// 암호
public class Solution12 {

    public static String solution(String str, int count) {
        String answer = "";
        for (int i = 0; i < count; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String s = sc.next();
        String solution = solution(s, count);
        System.out.println(solution);
    }
}
