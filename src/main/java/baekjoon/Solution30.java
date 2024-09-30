package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 토마토
 * 토마토들의 정보들이 주어지고 며칠이 지나면 토마토들이 모두 익는지 최소 일수 출력
 * m = 가로, n = 세로, h = 상자의 수
 * 정수 1은 익은 토마토, 정수 0 은 익지 않은 토마토, 정수 -1은 토마토가 있지 않은 칸
 *
 * 입력을 받을때 익은 토마토를 큐에 넣어놓습니다.
 * bfs로 가서
 * 6방향(상, 하, 좌, 우, 앞, 뒤)으로 탐색을 진행합니다.
 * 익지 않은 토마토(값이 0인 경우)를 발견하면, 현재 위치의 값에 1을 더해 저장하고
 * 이는 날짜를 표현합니다.
 * 새롭게 익은 토마토의 위치를 큐에 추가합니다.

 * 결과 계산
 * 익지 않은 토마토(값이 0인 경우)가 있으면 -1을 반환
 * 모든 토마토가 익었다면, 가장 오래 걸린 시간(최대값)을 찾아 반환
 * 결과에서 1을 빼는 이유는 처음 익은 토마토의 값이 1이라 첫날 익은 토마토 주변의 토마토는 2가 되어서
 */
public class Solution30 {

    static int[][][] box;
    static int m, n, h;
    static Queue<int[]> queue = new LinkedList<>();

    // 상,하,좌,우,앞,뒤 배열 표현
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());   // 가로
        n = Integer.parseInt(st.nextToken());   // 세로
        h = Integer.parseInt(st.nextToken());   // 높이

        // 높이,세로,가로
        box = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] == 1) {
                        queue.offer(new int[]{i, j, k});
                    }
                }
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[2], y = cur[1], z = cur[0];

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i]; // 높이
                int ny = y + dy[i]; // 세로
                int nx = x + dx[i]; // 가로

                if (nz >= 0 && nz < h && nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (box[nz][ny][nx] == 0) {
                        box[nz][ny][nx] = box[z][y][x] + 1;
                        queue.offer(new int[]{nz, ny, nx});
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (box[i][j][k] == 0) return -1;
                    result = Math.max(result, box[i][j][k]);
                }
            }
        }

        return result - 1;
    }
}
