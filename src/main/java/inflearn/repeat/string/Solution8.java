package inflearn.repeat.string;

import java.util.Scanner;

// 유효한 팰린드롬
public class Solution8 {

    public static String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^a-z]", "");
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (str.charAt(lt)==str.charAt(rt)){
                lt++;
                rt--;
            }else return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(solution(str));
    }
}
