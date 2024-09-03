package inflearn.sort;

import java.util.Scanner;

// Least Recently Used
public class Solution4 {

    public static int[] solution(int s , int[] arr){
        int[] cache = new int[s];
        for (int num : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                // 캐시 히트
                if (num == cache[i]) pos = i;
            }

            // 캐시 미스
            if (pos == -1){
                for (int i = s-1; i >=1 ; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = num;
            }else {
                for (int i = pos-1; i >=1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = num;
            }
        }
        return cache;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] solution = solution(s, arr);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
}
