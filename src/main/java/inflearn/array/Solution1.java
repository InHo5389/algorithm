package inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

// 큰수 출력하기
public class Solution1 {

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> solution = solution(arr);
        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }
    }
}
