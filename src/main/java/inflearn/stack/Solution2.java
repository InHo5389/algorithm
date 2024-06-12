package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

// 올바른 괄호
public class Solution2 {

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch==')'){
                while (stack.pop()!='(');
            }else stack.push(ch);
        }

        for (int i = 0; i < stack.size(); i++) {
            answer+= stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = solution(str);
        System.out.println(solution);
    }
}
