package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 백준 - 100 - 완전 이진 트리 16140
 * 중위 순회 문제
 */
public class Solution19 {

    static int k;
    static int[] arr;
    static ArrayList<ArrayList<Integer>> ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        arr = new int[(int) Math.pow(2, k) - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 결과를 저장할 2차원 ArrayList
        ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(new ArrayList<>());
        }

        // 재귀 함수 호출하여 트리 재구성
        dfs(0, arr.length - 1, 0);

        for (ArrayList<Integer> level : ans) {
            for (int num : level) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int start, int end, int floor) {
        if (floor == k) return;
        int mid = (start + end) / 2;
        ans.get(floor).add(arr[mid]);
        dfs(start,mid-1,floor+1);
        dfs(mid+1,end,floor+1);
    }
}
