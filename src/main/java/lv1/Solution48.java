package lv1;

import java.util.HashMap;
import java.util.Map;

// 추억 점수
public class Solution48 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i],yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            String[] persons = photo[i];
            int score = 0;

            for (String person : persons) {
                score += map.get(person);
            }

            answer[i] = score;
        }
        return answer;
    }
}
