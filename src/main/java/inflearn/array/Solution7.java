package inflearn.array;

import java.util.Scanner;

// 등수 구하기
public class Solution7 {

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
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
        int[] solution = solution(arr);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
