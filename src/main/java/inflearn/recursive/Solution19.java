package inflearn.recursive;

import java.util.Scanner;

// 순열 구하기
public class Solution19 {

    static int n, m;
    static int[] arr, store, check;

    public void dfs(int level) {
        if (level == m) {
            System.out.println(store[0] + " " + store[1]);
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    store[level] = arr[i];
                    dfs(level + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution19 t = new Solution19();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        check = new int[n];
        store = new int[m];
        t.dfs(0);
    }
}
