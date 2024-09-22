package inflearn.repeat.string;

import java.util.Scanner;

// 특정 문자 뒤집기
public class Solution5 {

    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) lt++;
            else if (!Character.isAlphabetic(charArray[rt])) rt--;
            else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
