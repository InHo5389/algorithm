package lv1;

import java.util.Stack;

// 같은 숫자는 싫어
public class Solution31 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
