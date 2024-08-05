package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기
public class Solution4 {

    public static ArrayList<String> solution(String[] strArray) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            list.add(new StringBuilder(strArray[i]).reverse().toString());
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArray = new String[num];
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            strArray[i] = str;
        }

        for (String s : solution(strArray)) {
            System.out.println(s);
        }
    }
}
