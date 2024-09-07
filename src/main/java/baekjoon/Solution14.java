package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 백준 알파벳 블록 27497
 * 스택을 활용하여 마지막 버튼이 1,2인지 확인
 */
public class Solution14 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Character> deque = new ArrayDeque<>();
        Stack<Integer> lastAdd = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int button = Integer.parseInt(input[0]);

            switch (button) {
                case 1:
                    deque.addLast(input[1].charAt(0));
                    lastAdd.push(1);
                    break;
                case 2:
                    deque.addFirst(input[1].charAt(0));
                    lastAdd.push(2);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        if (lastAdd.pop()==1) deque.removeLast();
                        else deque.removeFirst();
                    }
                    break;
            }
        }

        if (deque.isEmpty()) bw.write("0");
        else {
            for (Character c : deque) {
                bw.write(c);
            }
        }
        bw.newLine();
        bw.flush();
    }
}
