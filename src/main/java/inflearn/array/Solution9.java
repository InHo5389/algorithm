package inflearn.array;

import java.util.Scanner;

// 봉우리
public class Solution9 {

    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx>=0 && nx < n && ny >= 0 &&ny<n && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int solution = solution(num, arr);
        System.out.println(solution);
    }
}
