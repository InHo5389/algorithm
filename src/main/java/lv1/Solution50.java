package lv1;

// 2016년
public class Solution50 {
    public String solution(int a, int b) {
        String answer = "";
        int result = 0;
        int[] day={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] month = { "THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for (int i = 0; i < a-1; i++) {
            result+=day[i];
        }
        result+=b;

        answer=month[result%7];
        return answer;
    }
}
