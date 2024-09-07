package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * 백준 균형잡힌 세상 4949
 */
public class Solution17 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;


        while (!(line = br.readLine()).equals(".")) {
            System.out.println(isBalanced(line) ? "yes" : "no");
        }
        br.close();
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
