package inflearn.recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기(bfs)
public class Solution7 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];

                    if (nx == e) return level + 1;

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution.bfs(s, e));

    }
}
