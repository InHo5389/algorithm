package inflearn.recursive;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로 탐색(인접 리스트)
 * 인접행렬은 5*5 2차원 배열을 만들고 1로 채우고 시작하는데
 * 정점이 1000개 , 10000개를 인접행렬로 풀면 메모리가 비효율임
 * 그리고 1번정점에서 갈수 있는곳을 살피려면 예를들어 10000개를 살펴야 함
 * 1번 정점에서 5번 정점으로 가는 가지수
 */
public class Solution11 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void dfs(int v) {
        if (v==n) answer++;

        for (Integer nv : graph.get(v)) {
            if (ch[nv] == 0){
                ch[nv] = 1;
                dfs(nv);
                ch[nv] = 0;
            }
        }
    }


    public static void main(String[] args) {
        Solution11 t = new Solution11();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        t.dfs(1);
        System.out.println(answer);
    }
}
