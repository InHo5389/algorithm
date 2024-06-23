package inflearn.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 장난 꾸러기
public class Solution6 {

    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=tmp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> solution = solution(arr);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
}
