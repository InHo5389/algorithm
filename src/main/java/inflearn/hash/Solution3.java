package inflearn.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기
public class Solution3 {

    public static int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (char ch : b.toCharArray()) {
            bMap.put(ch, bMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < b.length() - 1; i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
        }
        int lt = 0;

        for (int rt = b.length()-1 ; rt < a.length(); rt++) {
            aMap.put(a.charAt(rt),aMap.getOrDefault(a.charAt(rt),0)+1);
            if (aMap.equals(bMap)) answer++;
            aMap.put(a.charAt(lt),aMap.get(a.charAt(lt))-1);

            if (aMap.get(a.charAt(lt))==0) aMap.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int solution = solution(s, t);
        System.out.println(solution);
    }
}
