package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

// 크레인 인형뽑기(카카오)
public class Solution3 {

    public static int solution(int[][] arr, int[] mArr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : mArr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][pos - 1] != 0) {
                    int tmp = arr[i][pos-1];
                    arr[i][pos-1] = 0;

                    if (!stack.isEmpty()&& stack.peek() == tmp){
                        answer+=2;
                        stack.pop();
                    }else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        int solution = solution(arr, mArr);
        System.out.println(solution);
    }
}
