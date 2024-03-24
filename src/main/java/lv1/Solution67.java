package lv1;

// 둘만의 암호
public class Solution67 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z'? 'a' : (char)(temp+1);
                if (!skip.contains(String.valueOf(temp))){
                    idx++;
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}
