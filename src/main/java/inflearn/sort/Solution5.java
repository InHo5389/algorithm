package inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

// 중복 확인
public class Solution5 {

    public static String solution(int[] arr){
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]){
                return "D";
            }
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
        String solution = solution(arr);
        System.out.println(solution);
    }
}
