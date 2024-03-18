package lv1;

import java.util.HashSet;

// 폰켓몬
public class Solution51 {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() > max){
            answer = max;
        }else {
            answer = set.size();
        }
        return answer;
    }
}
