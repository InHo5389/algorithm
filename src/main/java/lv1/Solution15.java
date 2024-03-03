package lv1;

// 서울에서 김서방 찾기
public class Solution15 {
    public String solution(String[] seoul) {
        String answer = "";
        int tmp = 0;

        for (String s : seoul) {
            if (s.equals("Kim")){
                return String.format("김서방은 %d에 있다",tmp);
            }
            tmp++;
        }
        return String.format("김서방은 %d에 있다",tmp);
    }
}
