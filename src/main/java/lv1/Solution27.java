package lv1;

// 문자열 다루기 기본
public class Solution27 {
    public boolean solution(String s) {
        boolean answer = true;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length != 4 && charArray.length != 6 || !Character.isDigit(charArray[i])){
                return false;
            }
        }
        return answer;
    }
}
