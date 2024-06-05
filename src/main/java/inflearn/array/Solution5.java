package inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

// 뒤집은 소수
public class Solution5 {

    public static boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int res = 0;

            while (num > 0) {
                int t = num % 10;
                res = res * 10 + t;
                num = num / 10;
            }

            if (isPrime(res)){
                list.add(res);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> solution = solution(arr);
        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
