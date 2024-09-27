package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 무서운 양들..
 * 백준 - 양치기 꿍

 * 주요 포인트:
 * - visited 배열을 사용하여 각 칸의 방문 여부를 체크, 중복 방문을 방지
 * - 울타리('#')는 탐색하지 않으며, 이는 자연스럽게 구역을 구분하는 역할
 * - 전체 필드를 한 번 순회하면서 미방문 양 또는 늑대를 발견할 때마다 새로운 DFS를 시작
 */
public class Solution21 {
    static int r, c;
    static char[][] field;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int totalSheep = 0, totalWolf = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        field = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            field[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && (field[i][j] == 'v' || field[i][j] == 'k')) {
                    dfs(i, j);
                }
            }
        }

        System.out.println(totalSheep + " " + totalWolf);
    }

    static void dfs(int x, int y) {
        int sheep = 0, wolf = 0;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int cx = current[0], cy = current[1];

            if (visited[cx][cy]) continue;
            visited[cx][cy] = true;

            if (field[cx][cy] == 'k') sheep++;
            else if (field[cx][cy] == 'v') wolf++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < r && ny >= 0 && ny < c && !visited[nx][ny] && field[nx][ny] != '#') {
                    stack.push(new int[]{nx, ny});
                }
            }
        }

        if (sheep > wolf) totalSheep += sheep;
        else totalWolf += wolf;
    }
}
