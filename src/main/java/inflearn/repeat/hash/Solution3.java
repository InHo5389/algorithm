package inflearn.repeat.hash;

import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기
public class Solution3 {

    public static int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int lt = 0;
        for (int i = 0; i < t.length() - 1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            map.put(s.charAt(rt),map.getOrDefault(s.charAt(rt),0)+1);
            if (map.equals(tMap)) answer++;
            map.put(s.charAt(lt),map.getOrDefault(s.charAt(lt),0)-1);
            if (map.get(s.charAt(lt))==0){
                map.remove(s.charAt(lt));
            }
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
