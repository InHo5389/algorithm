package inflearn.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// k번째 큰 수
public class Solution5 {

    public static int solution(int[] arr, int n,int k){
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    treeSet.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt = 0 ;
        for (Integer integer : treeSet) {
            cnt++;
            if (cnt==k){
                return integer;
            }
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

        int solution = solution(arr, n, k);
        System.out.println(solution);
    }
}
