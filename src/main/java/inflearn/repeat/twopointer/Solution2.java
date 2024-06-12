package inflearn.repeat.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통 원소 구하기
public class Solution2 {

    public static ArrayList<Integer> solution(int[] nArr, int[] mArr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nArr);
        Arrays.sort(mArr);
        int p1 = 0, p2 = 0;
        while (p1 < nArr.length && p2 < mArr.length) {
            if (nArr[p1] < mArr[p2]) {
                p1++;
            } else if (nArr[p1] > mArr[p2]) {
                p2++;
            } else {
                list.add(nArr[p1]);
                p1++;
                p2++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }
        ArrayList<Integer> solution = solution(nArr, mArr);
        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
