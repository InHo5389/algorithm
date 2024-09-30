package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Bucket Brigade
 * B - 불이 난곳, L - 호수, R - 큰 바위
 * 필요한 최소한의 소 수 출력
 */
public class Solution29 {
    static char[][] farm = new char[10][10];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int startX, startY, endX, endY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            farm[i] = br.readLine().toCharArray();
            for (int j = 0; j < 10; j++) {
                if (farm[i][j] == 'L') {
                    startX = i;
                    startY = j;
                } else if (farm[i][j] == 'B') {
                    endX = i;
                    endY = j;
                }
            }
        }

        System.out.println(bfs() - 1);
    }

    static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[10][10];
        int[][] dis = new int[10][10];

        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        dis[startX][startY] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == endX && y == endY) {
                return dis[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < 10 && ny < 10 && !visited[nx][ny] && farm[nx][ny] != 'R') {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    dis[nx][ny] = dis[x][y] + 1;
                }
            }
        }
        return -1;
    }
}
