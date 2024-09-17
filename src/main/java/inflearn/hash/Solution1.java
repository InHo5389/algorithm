package inflearn.hash;

import java.util.HashMap;
import java.util.Scanner;

// 학급 회장
public class Solution1 {

    public static char solution(String tmp) {
        int maxValue = Integer.MIN_VALUE;
        char maxChar = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tmp.length(); i++) {
            map.put(tmp.charAt(i), map.getOrDefault(tmp.charAt(i), 0) + 1);
        }

        for (Character character : map.keySet()) {
            if (map.get(character)>maxValue){
                maxValue = map.get(character);
                maxChar = character;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tmp = sc.next();

        char solution = solution(tmp);
        System.out.println(solution);

    }
}
