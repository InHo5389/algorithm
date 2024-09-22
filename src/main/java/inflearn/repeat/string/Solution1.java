package inflearn.repeat.string;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char ch = Character.toLowerCase(sc.next().charAt(0));
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (ch == c) cnt++;
        }

        System.out.println(cnt);
    }
}
