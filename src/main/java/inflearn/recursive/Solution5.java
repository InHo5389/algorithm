package inflearn.recursive;

import java.util.Scanner;

// 부분 집합 구하기(dfs)
public class Solution5 {

    static int n;
    static int[] ch;

    public static void dfs(int l) {
        if (l == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        }

        ch[l] = 1;
        dfs(l + 1);
        ch[l] = 0;
        dfs(l + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ch = new int[n + 1];
        dfs(1);
    }
}
