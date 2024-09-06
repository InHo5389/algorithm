package inflearn.recursive;

import java.util.Scanner;

// 최대 점수 구하기(DFS)
public class Solution15 {

    static int answer = Integer.MIN_VALUE, n, m;

    public void dfs(int level, int sum, int time, int[] timeArr, int[] score) {
        if (time>m) return;
        if (level == n) {
            answer = Math.max(answer,sum);
        } else {
            dfs(level + 1, sum + score[level], time + timeArr[level], timeArr, score);
            dfs(level + 1, sum, time, timeArr, score);
        }
    }

    public static void main(String[] args) {
        Solution15 t = new Solution15();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] timeArr = new int[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            timeArr[i] = sc.nextInt();
        }

        t.dfs(0, 0, 0, timeArr, score);
        System.out.println(answer);
    }
}
