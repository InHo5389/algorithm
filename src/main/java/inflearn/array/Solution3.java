package inflearn.array;

import java.util.Scanner;

// 가위 바위 보
public class Solution3 {

    public static String solution(int[] arrA, int[] arrB) {
        String answer = "";
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] == arrB[i]) {
                answer += "D";
            } else if (arrA[i] == 1 && arrB[i] == 3) answer += "A";
            else if (arrA[i] == 2 && arrB[i] == 1) answer += "A";
            else if (arrA[i] == 3 && arrB[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arrA = new int[count];
        int[] arrB = new int[count];

        for (int i = 0; i < count; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            arrB[i] = sc.nextInt();
        }

        String solution = solution(arrA, arrB);
        for (char ch : solution.toCharArray()) {
            System.out.println(ch);
        }
    }
}
