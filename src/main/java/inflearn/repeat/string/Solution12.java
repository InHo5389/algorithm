package inflearn.repeat.string;

import java.util.Scanner;

public class Solution12 {

    public static String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer+=(char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String str = sc.next();
        String str1 = "hello worldzzffdd";
        System.out.println(str1.substring(7)); //"oqrldzzffdd"
        System.out.println(str1.substring(0,7)); // "hello  w"
    }
}
