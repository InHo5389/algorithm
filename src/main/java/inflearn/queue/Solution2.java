package inflearn.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 수업계획 짜기
public class Solution2 {

    public static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char ch : need.toCharArray()) {
            queue.offer(ch);
        }

        for (char ch : plan.toCharArray()) {
            if (queue.contains(ch)) {
                if (ch != queue.poll()){
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();
        String solution = solution(need, plan);
        System.out.println(solution);
    }
}
