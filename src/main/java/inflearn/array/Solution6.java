package inflearn.array;

import java.util.Scanner;

// 점수 계산
public class Solution6 {

    public static int solution(int[] arr) {
        int answer = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                answer += count;
            } else count = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = solution(arr);
        System.out.println(solution);
    }
}
