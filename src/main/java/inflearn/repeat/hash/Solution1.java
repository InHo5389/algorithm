package inflearn.repeat.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Solution1 {

    public static char solution(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char c = ' ';
        int count = 0;
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character character : map.keySet()) {
            if (map.get(character) > count){
                count = map.get(character);
                c = character;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char solution = solution(str);
        System.out.println(solution);
    }
}
