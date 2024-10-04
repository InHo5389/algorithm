package inflearn.repeat.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통원소 구하기
public class Solution2 {

    static int n, m;

    public static ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                list.add(a[p1]);
                p1++;
                p2++;
            }else if (a[p1] < b[p2]){
                p1++;
            }else p2++;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (Integer integer : solution(a, b)) {
            System.out.print(integer+" ");
        }
    }
}
