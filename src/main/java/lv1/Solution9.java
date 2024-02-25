package lv1;

// 문자열 내 p와 y의 개수
public class Solution9 {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int count = 0;

        for (String temp : str.split("")) {
            if (temp.equals("p")) {
                count++;
            } else if (temp.equals("y")) {
                count--;
            }
        }
        return count == 0;
    }
}
