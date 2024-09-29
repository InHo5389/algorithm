package inflearn.repeat.array;

import java.util.ArrayList;
import java.util.Scanner;

// 큰 수 출력하기
public class Solution1 {

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer integer : solution(arr)) {
            System.out.print(integer+" ");
        }
    }
}
