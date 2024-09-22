package inflearn.repeat.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution4 {

    static int n;

    public static ArrayList<String> solution(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            char[] charArray = s.toCharArray();
            int lt = 0, rt = charArray.length - 1;

            while (lt < rt) {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
            String str = String.valueOf(charArray);
            list.add(str);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String s : solution(arr)) {
            System.out.println(s);
        }
    }
}
