package inflearn.repeat.string;

import java.util.Scanner;

// 대소문자 변환
public class Solution2 {

    public static String solution(String str) {
        String tmp = "";
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)){
                tmp += Character.toUpperCase(ch);
            }else {
                tmp += Character.toLowerCase(ch);
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
