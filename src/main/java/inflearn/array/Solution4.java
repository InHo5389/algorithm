package inflearn.array;

import java.util.Scanner;

// 소수(에라토스테네스 체)
public class Solution4 {

    public static int solution(int num) {
        int answer = 0;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num ; i++) {
            if (arr[i] == 0){
                answer++;
                for (int j = i; j <=num ; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int solution = solution(num);
        System.out.println(solution);
    }
}
