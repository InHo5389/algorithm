package inflearn.recursive;

import java.util.Scanner;

// 순열 구하기
public class Solution18 {

    static int n, m;
    static int[] check, store;

    public void dfs(int level, int[] arr) {
        if (m == level) {
            System.out.println(store[0] + " " + store[1]);
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    store[level] = arr[i];
                    dfs(level + 1, arr);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution18 t = new Solution18();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        check = new int[n];
        store = new int[m];

        t.dfs(0, arr);
    }
}
