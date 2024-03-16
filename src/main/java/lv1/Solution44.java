package lv1;

import java.util.*;

// 두 개 뽑아서 더하기
public class Solution44 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().mapToInt(integer -> integer.intValue()).toArray();
    }
}
