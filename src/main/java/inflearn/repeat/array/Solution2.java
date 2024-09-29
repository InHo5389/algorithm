package inflearn.repeat.array;

import java.util.Scanner;

// 보이는 학생
public class Solution2 {

    public static int solution(int[] arr){
        int result = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                result++;
                max = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}
