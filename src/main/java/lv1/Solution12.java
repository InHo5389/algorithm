package lv1;

// 하샤드 수
public class Solution12 {
    public boolean solution(int x) {
        boolean answer = false;
        int tmp = 0;
        String[] splitInt = String.valueOf(x).split("");

        for (String s : splitInt) {
            tmp += Integer.valueOf(s);
        }

        return x % tmp == 0;
    }
}
