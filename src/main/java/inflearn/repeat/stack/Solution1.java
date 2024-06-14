package inflearn.repeat.stack;

import java.util.Scanner;
import java.util.Stack;

// 올바른 괄호
public class Solution1 {

    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0) return "NO";

        for (char ch : str.toCharArray()) {
            if (ch == '('){
                stack.push(ch);
            }else {
                if (stack.isEmpty()) return "NO";

                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = solution(str);
        System.out.println(solution);
    }
}
