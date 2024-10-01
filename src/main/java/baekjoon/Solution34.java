package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 한번의 이동에서 옮길수 있는 중량의 최댓값 구하기
 */
class Edge {
    int to, weight;
    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}
public class Solution34 {

    static ArrayList<Edge>[] graph;
    static int n, start, end;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        int maxWeight = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a].add(new Edge(b, c));
            graph[b].add(new Edge(a, c));
            maxWeight = Math.max(maxWeight, c);
        }

        start = sc.nextInt();
        end = sc.nextInt();

        int left = 1, right = maxWeight;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (bfs(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }

    static boolean bfs(int limit) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == end) return true;

            for (Edge edge : graph[current]) {
                if (!visited[edge.to] && edge.weight >= limit) {
                    visited[edge.to] = true;
                    queue.offer(edge.to);
                }
            }
        }
        return false;
    }
}
