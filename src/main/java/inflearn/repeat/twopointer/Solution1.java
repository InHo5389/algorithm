package inflearn.repeat.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

// 두 배열 합치기
public class Solution1 {

    public static ArrayList<Integer> solution(int[] nArr, int[] mArr) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < nArr.length && p2 < mArr.length) {
            if (nArr[p1] < mArr[p2]){
                list.add(nArr[p1++]);
            }else{
                list.add(mArr[p2++]);
            }
        }

        while (p1<nArr.length){
            list.add(nArr[p1++]);
        }
        while (p2<mArr.length){
            list.add(mArr[p2++]);
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
            System.out.print(integer+" ");
        }
    }
}
