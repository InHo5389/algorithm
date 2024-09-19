package inflearn.dp;

import java.util.Arrays;
import java.util.Scanner;

// 동전 교환(DP)
public class Solution5 {
    static int n, m;
    static int[] dy;

    public int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]]+1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Solution5 t = new Solution5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(t.solution(coin));
    }
}
