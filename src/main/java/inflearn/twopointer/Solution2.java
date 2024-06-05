package inflearn.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 공통원소 구하기
public class Solution2 {

    public static ArrayList<Integer> solution(int[] arrN, int[] arrM) {
        Arrays.sort(arrN);
        Arrays.sort(arrM);
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < arrN.length && p2 < arrM.length) {
            if (arrN[p1] < arrM[p2]) {
                p1++;
            } else if (arrN[p1] > arrM[p2]) {
                p2++;
            }else if (arrN[p1] == arrM[p2]){
                list.add(arrN[p1]);
                p1++;
                p2++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }

        ArrayList<Integer> solution = solution(arrN, arrM);

        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
