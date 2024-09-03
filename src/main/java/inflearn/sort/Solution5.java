package inflearn.sort;

import java.util.HashMap;
import java.util.Scanner;

// 중복 확인
public class Solution5 {

    public static String solution(int n, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        String answer = "U";
        for (int num : arr) {
            if (map.containsKey(num)) return "D";
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,arr));
    }
}
