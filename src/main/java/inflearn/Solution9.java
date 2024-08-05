package inflearn;

import java.util.Scanner;

// 숫자만 출력
public class Solution9 {

    public static int solution(String str) {
        str = str.replaceAll("[a-zA-Z]", "");
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solution = solution(sc.nextLine());
        System.out.println(solution);
    }
}
