package inflearn.recursive;

// 피보나치 수열(메모이제이션)
public class Solution3 {

    private static int[] fibo;

    public int dfs(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }


    public static void main(String[] args) {
        Solution3 T = new Solution3();
        int n = 45;
        fibo = new int[n + 1];
        T.dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}