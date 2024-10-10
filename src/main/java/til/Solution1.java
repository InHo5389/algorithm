package til;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(idx -> pq.add(idx));

        int min = pq.peek();
        while (min < K) {
            if (pq.size() < 2) return -1;
            
            pq.add(pq.poll() + (pq.poll() * 2));
            min = pq.peek();
            answer++;
        }
        return answer;
    }
}
