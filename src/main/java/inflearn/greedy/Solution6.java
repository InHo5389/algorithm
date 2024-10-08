package inflearn.greedy;

import java.util.Scanner;

// 친구인가?(Union & Find)
public class Solution6 {
    // 집합 표시
    static int[] unf;

    /**
     * v학생의 대한 집합 번호를 return
     */
    public static int Find(int v){
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    // a와 b를 한 집합으로 만들어라
    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if (fa!=fb) unf[fa] = fb;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            unf[i] = i;
        }

        for (int i = 1; i <= m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a,b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
