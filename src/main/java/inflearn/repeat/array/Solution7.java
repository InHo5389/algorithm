package inflearn.repeat.array;

import java.util.Scanner;

// 점수 계산
public class Solution7 {

    public static int solution(int[] arr){
        int answer = 0;
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                answer += ++score;
            }else {
                score = 0;
            }
        }
        return answer;
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
