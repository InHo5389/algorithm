package inflearn.recursive;

import java.util.Scanner;

// 조합 구하기
public class Solution22 {

    static int[] combi;
    static int n, m;

    public void dfs(int level, int s) {
        if (level == m) {
            System.out.println(combi[0] + " " + combi[1]);
        } else {
            for (int i = s; i <= n; i++) {
                combi[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution22 t = new Solution22();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        t.dfs(0, 1);
    }
}
