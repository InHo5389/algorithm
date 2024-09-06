package inflearn.recursive;

import java.util.Scanner;

/**
 * 합이 같은 부분 집합(DFS)
 */
public class Solution13 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void dfs(int level, int sum, int[] arr) {
        if (flag) return;
        if (level == n) {
            if (total / 2 == sum) {
                answer = "YES";
                flag = true;
            }
        }else {
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Solution13 t = new Solution13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        t.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
