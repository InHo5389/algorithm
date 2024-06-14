package inflearn.repeat.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 교육 과정 설계
public class Solution2 {

    public static String solution(String need,String str){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char ch : need.toCharArray()) {
            queue.offer(ch);
        }

        for (char ch : str.toCharArray()) {
            if (queue.contains(ch)){
                if (ch!=queue.poll()){
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
        String str = sc.next();
        String solution = solution(need, str);
        System.out.println(solution);
    }
}
