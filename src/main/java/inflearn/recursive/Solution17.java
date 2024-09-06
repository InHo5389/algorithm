package inflearn.recursive;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전 교환(DFS)
 * 거슬러 줄 동전의 최소 개수를 출력한다.
 */
public class Solution17 {

    static int n, money, answer = Integer.MAX_VALUE;

    public void dfs(int level, int sum, Integer[] coin) {
        if (sum > money) return;
        if (level>=answer) return;
        if (sum == money) answer = Math.min(answer, level);
        else {
            for (int i = 0; i < n; i++) {
                dfs(level + 1, sum + coin[i], coin);
            }
        }
    }

    public static void main(String[] args) {
        Solution17 t = new Solution17();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] coin = new Integer[n];

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        money = sc.nextInt();
        t.dfs(0, 0, coin);
        System.out.println(answer);
    }
}
