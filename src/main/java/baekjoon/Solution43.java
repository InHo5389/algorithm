package baekjoon;

import java.util.Scanner;

/**
 * 거스름 돈
 * 주어진 금액 n을 만들기 위해 필요한 최소 동전 개수를 찾는 것이 목표
 *
 * dfs(동전의 개수, 합)
 * dfs로 2원 5원 뻗어나가는 형식
 * 시간초과
 */
public class Solution43 {

    static int n, answer = Integer.MAX_VALUE;

    public static void dfs(int level, int sum, int[] arr) {
        // 금액을 초과하더라도 dfs가 돌수도 있으니 초과하면 바로 return
        if (sum > n) return;

        if (sum == n) {
            answer = Math.min(answer, level);
        } else {
            // 동전의 개수를 하나씩 들려가며 2원 5원으로 뻗어나가서
            // 최소 동전개수를 구합니다
            for (int i = 0; i < arr.length; i++) {
                dfs(level + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // 어떤 동전이 있는지에 대한 배열
        int[] arr = new int[]{2, 5};

        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
