package inflearn.recursive;

import java.util.Scanner;

/**
 * 경로 탐색(인접 행렬)
 * 1번 정점에서 5번 정점으로 가는 가지수
 */
public class Solution10 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void dfs(int v) {
        if (v == n) answer++;

        for (int i = 1; i <= n; i++) {
            if (graph[v][i] == 1 && ch[i] == 0){
                ch[i] = 1;
                dfs(i);
                ch[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution10 t = new Solution10();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        t.dfs(1);
        System.out.println(answer);
    }
}
