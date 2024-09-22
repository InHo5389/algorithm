package inflearn.repeat.string;

import java.util.Scanner;

// 회문 문자열
public class Solution7 {

    public static String solution(String str) {
        String answer = "YES";
        int lt = 0, rt = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (lt < rt){
            if (charArray[lt]==charArray[rt]){
                lt++;
                rt--;
            }else return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(solution(str));
    }
}
