package inflearn.repeat.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 매출액의 종류
public class Solution2 {

    public static ArrayList<Integer> solution(int k, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k-1; rt <arr.length; rt++) {
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            list.add(map.size());
            map.put(arr[lt],map.getOrDefault(arr[lt],0)-1);
//            map.put(arr[lt],map.get(arr[lt])-1);
            if (map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> solution = solution(k, arr);
        for (Integer integer : solution) {
            System.out.print(integer+" ");
        }
    }
}
