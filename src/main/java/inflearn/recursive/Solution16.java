package inflearn.recursive;

import java.util.Scanner;

// 중복순열 구하기
public class Solution16 {

    static int n;
    static int m;
    static int[] arr;

    public void dfs(int level) {
        if (level == m) {
            System.out.println(arr[0] + " " + arr[1]);
        } else {
            for (int i = 1; i <= n; i++) {
                arr[level] = i;
                dfs(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution16 t = new Solution16();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        t.dfs(0);

    }
}
