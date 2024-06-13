package inflearn.repeat.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// k번째 수
public class Solution4 {

    public static int solution(int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int count = 0;
        for (Integer integer : set) {
            count++;
            if (count==k) return integer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = solution(k, arr);
        System.out.println();
        System.out.println(solution);
    }
}
