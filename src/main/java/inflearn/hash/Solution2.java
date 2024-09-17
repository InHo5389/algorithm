package inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

// 아나그램
public class Solution2 {

    public static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        if (str1.length() != str2.length()) return "NO";

        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str2.charAt(i)) || map.get(str2.charAt(i)) == 0) return "NO";
            map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) - 1);
        }

        for (Character character : map.keySet()) {
            if (map.get(character) != 0) {
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String solution = solution(str1, str2);
        System.out.println(solution);

    }
}
