package inflearn.repeat.string;

import java.util.Scanner;

public class Solution10 {

    public static int[] solution(String s, char t){
        int[] arr = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==t){
                p = 0;
            }else {
                p++;
            }
            arr[i] = p;
        }
        p = 1000;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)==t){
                p = 0;
            }else {
                p++;
                arr[i] = Math.min(p,arr[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        int[] solution = solution(s, t);
        for (int n : solution) {
            System.out.print(n+" ");
        }
    }
}
