package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 나이트의 이동
 * 둘째 줄 : 나이트가 현재 있는 칸
 * 셋째 줄 : 나이트가 이동하려고 하는 칸
 * <p>
 * 나이트가 최소 몇번만에 이동할 수 있는지 출력
 */
public class Solution26 {

    static int n;
    static int x1, x2, y1, y2;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            arr = new int[n][n];
            visited = new boolean[n][n];

            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            bfs();

            sb.append(arr[x2][y2]).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x1, y1});
        visited[x1][y1] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int nx = cur[0];
            int ny = cur[1];

            for (int i = 0; i < 8; i++) {
                int ox = nx + dx[i];
                int oy = ny + dy[i];

                if (ox >= 0 && oy >= 0 && ox < n && oy < n && !visited[ox][oy]) {
                    queue.add(new int[]{ox, oy});
                    arr[ox][oy] = arr[nx][ny] + 1;
                    visited[ox][oy] = true;
                }
            }
        }
    }
}
