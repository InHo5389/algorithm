package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 특정 거리의 도시 찾기
 * 문제 설명
 * 도시의 개수 N, 도로의 개수 M, 거리 정보 K, 출발 도시의 번호 X가 주어지면
 * 출발 도시에서 시작하여 K만큼 거리가 나타내는 도시를 출력하고 없으면 -1출력
 *
 * 인접 리스트를 활용하여 그래프를 표현했고 거리를 저장할 1차원 배열을 만들었습니다.
 */
public class Solution27 {
    static int n, m, k, x;
    static List<List<Integer>> graph;
    static int[] dis;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력받습니다.
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
        }

        // 거리 배열 초기화
        // 방문하지 않았으면 거리 배열의 0으로 표기해야 하여 -1로 초기화 해뒀습니다.
        // 실제 거리가 0인 경우(출발 도시)와 구분이 어려울 수 있어서
        dis = new int[n + 1];
        Arrays.fill(dis, -1);

        bfs(x);

        // BFS가 완료된 후, 모든 도시를 순회하며 거리가 K인 도시를 출력
        // 거리가 k인 도시가 없다면 -1 출력
        boolean found = false;
        for (int i = 1; i <=n ; i++) {
            if (dis[i] == k){
                System.out.println(i);
                found = true;
            }
        }

        if (!found){
            System.out.println(-1);
        }
    }

    // 현재 도시에서 연결된 모든 도시를 탐색하며, 아직 방문하지 않은 도시(-1)라면
    // 현재 도시의 거리 + 1 거리를 갱싱하고 도시를 큐에 추가합니다.
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        dis[start] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : graph.get(cur)) {
                if (dis[next] == -1) {
                    dis[next] = dis[cur]+1;
                    queue.offer(next);
                }
            }
        }
    }
}
