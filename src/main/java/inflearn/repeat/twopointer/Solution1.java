package inflearn.repeat.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

// 두 배열 합치기
public class Solution1 {

    static int n, m;

    public static ArrayList<Integer> solution(int[] arr, int[] arr1) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr[p1] < arr1[p2]) {
                list.add(arr[p1++]);
            }else {
                list.add(arr1[p2++]);
            }
        }

        while (p1 < n) list.add(arr[p1++]);
        while (p2 < m) list.add(arr1[p2++]);

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (Integer integer : solution(arr, arr1)) {
            System.out.print(integer+" ");
        }
    }
}
