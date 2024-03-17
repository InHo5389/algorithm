package lv1;

import java.util.PriorityQueue;

// 명예의 전당 (1)
public class Solution47 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k){
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(100);
        pq.add(20);
        pq.add(150);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
