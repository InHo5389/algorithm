package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 바이러스
 * 연결되어 있는 컴퓨터는 바이러스 전파
 * 1번 컴퓨터를 통해 바이러스에 걸리게 되는 컴퓨터 수 출력
 */
public class Solution28 {

    static List<List<Integer>> graph;
    static boolean[] visited;
    static int computerCount;
    static int connectionCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        computerCount = Integer.parseInt(br.readLine());
        connectionCount = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i <= computerCount; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[computerCount + 1];

        for (int i = 0; i < connectionCount; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        int result = bfs(1) - 1;
        System.out.println(result);
    }

    static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            Integer cur = queue.poll();
            count++;

            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
        return count;
    }
}
