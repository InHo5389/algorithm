package inflearn.recursive;

// 이진수 출력(재귀)
public class Solution1 {
    public void dfs(int n) {
        if (n==0) return;
        dfs(n/2);
        System.out.print(n % 2+" ");
    }


    public static void main(String[] args) {
        Solution1 T = new Solution1();
        T.dfs(11);
    }
}
