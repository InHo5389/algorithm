package baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 숨바꼭질
 * 수빈 n, 동생 k
 * 1초후에 x-1,x+1 이동 순간이동 하는 경우에는 1초 후에 2*x의 위치로 이동
 */
public class Solution31 {

    static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(bfs(n));
    }

    public static int bfs(int start) {
        int maxPos = 100000;
        int[] time = new int[maxPos + 1];
        Arrays.fill(time, -1);
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        time[start] = 0;

        while (!queue.isEmpty()) {
            Integer cur = queue.poll();

            if (cur == k) return time[cur];

            for (int nextPos : new int[]{cur - 1, cur + 1, cur * 2}) {
                if (nextPos >= 0 && nextPos <= maxPos && time[nextPos]==-1) {
                    time[nextPos] = time[cur] + 1;
                    queue.offer(nextPos);
                }
            }
        }
        return -1;
    }
}
