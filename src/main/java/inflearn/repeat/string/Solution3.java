package inflearn.repeat.string;

import java.util.Scanner;

// 문장 속 단어
public class Solution3 {

    public static String solution(String str){
        int tmp = Integer.MIN_VALUE;
        String result = "";

        for (String s : str.split(" ")) {
            if (s.length() > tmp) {
                tmp = s.length();
                result = s;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
