package lv1;

// 문자열 나누기
public class Solution62 {
    public int solution(String s) {
        int answer =0,same=0,diff=0;
        String[] splitStr = s.split("");
        String start = splitStr[0];

        for (int i = 0; i < splitStr.length; i++) {
            if (start.equals(splitStr[i])) same++;
            else diff++;

            if (i == splitStr.length - 1){
                if (start != "") answer++;
            }else if (same <= diff){
                start = splitStr[i+1];
                answer++;
                same = diff = 0;
            }
        }
        return answer;
    }
}
