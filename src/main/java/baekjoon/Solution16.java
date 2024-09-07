package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *  백준 좋은 단어 3986
 *  if 스택이 비어있거나 peek해서 넣는 값이랑 같으면 pop
 *  else 스택 push
 *  stack이 비어있다면 answer++
 */
public class Solution16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            for (char ch : str.toCharArray()) {
                if (!stack.isEmpty() && stack.peek()==ch){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
