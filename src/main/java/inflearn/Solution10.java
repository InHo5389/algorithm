package inflearn;

import java.util.Scanner;

// 가장 짧은 문자 거리
public class Solution10 {

    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i)==t){
                p=0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        int[] solution = solution(s, t);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
}
