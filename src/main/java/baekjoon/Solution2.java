package baekjoon;

import java.util.Scanner;

// 돌려막기(17207)
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5x5 행렬 A와 B를 저장할 2차원 배열 선언
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];

        // 행렬 A 입력 받기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 행렬 B 입력 받기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 각 사람의 최종 일량을 저장할 배열
        int[] totalWork = new int[5];

        // 각 사람의 최종 일량 계산
        for (int x = 0; x < 5; x++) {  // x번 사람
            for (int y = 0; y < 5; y++) {  // y번째 일
                int workload = 0;
                for (int i = 0; i < 5; i++) {
                    workload += A[x][i] * B[i][y];  // x번 사람의 y번째 일의 예상 일량 계산
                }
                totalWork[x] = workload;  // x번 사람의 최종 일량에 더함
            }
        }

        // 가장 일량이 적은 사람 찾기
        int minWork = Integer.MAX_VALUE;
        int minPerson = -1;
        String[] names = {"Inseo", "Junsuk", "Jungwoo", "Jinwoo", "Youngki"};

        for (int i = 4; i >= 0; i--) {  // 우선순위를 고려하여 역순으로 검사
            if (totalWork[i] < minWork) {  // 일량이 더 작은 경우만 갱신
                minWork = totalWork[i];
                minPerson = i;
            }
        }

        // 결과 출력
        System.out.println(names[minPerson]);

        sc.close();
    }
}