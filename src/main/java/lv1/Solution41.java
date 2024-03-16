package lv1;

// 푸드 파이트 대회
public class Solution41 {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int result = food[i] / 2;
            sb.append(String.valueOf(i).repeat(result));
        }

        answer += sb + "0";
        return answer + sb.reverse();
    }
}
