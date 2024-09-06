package inflearn.recursive;

import java.util.Scanner;

/**
 * 바둑이 승차(DFS)
 */
public class Solution14 {

    static int answer = Integer.MIN_VALUE, c, n;

    public void dfs(int level, int sum, int[] arr) {
        if (sum > c) return;
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Solution14 t = new Solution14();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        t.dfs(0,0,arr);
        System.out.println(answer);
    }
}
