package inflearn.array;

import java.util.Scanner;

// 보이는 학생
public class Solution2 {

    public static int solution(int[] arr) {
        int tmp = 1;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (first < arr[i]) {
                tmp++;
                first = arr[i];
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(arr);
        System.out.println(solution);
    }
}
