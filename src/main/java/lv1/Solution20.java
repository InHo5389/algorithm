package lv1;

import java.util.Arrays;

// 제일 작은수 제거하기
public class Solution20 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i->i != min).toArray();
    }
}
