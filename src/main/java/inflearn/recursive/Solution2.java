package inflearn.recursive;

// 팩토리얼
public class Solution2 {
    public int dfs(int n) {
        if (n==1) return 1;
        return n * dfs(n-1);
    }


    public static void main(String[] args) {
        Solution2 T = new Solution2();
        System.out.println(T.dfs(5));
    }
}
