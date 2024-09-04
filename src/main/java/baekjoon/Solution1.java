package baekjoon;

import java.util.Scanner;

// 참외밭(2744)
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1m^2당 참외의 개수 입력
        int K = sc.nextInt();

        // 육각형의 6개 변의 길이를 저장할 배열
        int[] lengths = new int[6];

        // 가장 긴 가로와 세로 길이, 그리고 그들의 인덱스를 저장할 변수
        int maxWidth = 0, maxHeight = 0;
        int maxWidthIndex = 0, maxHeightIndex = 0;

        // 육각형의 6개 변에 대한 정보 입력 및 처리
        for (int i = 0; i < 6; i++) {
            int direction = sc.nextInt(); // 방향 입력 (1: 동, 2: 서, 3: 남, 4: 북)
            lengths[i] = sc.nextInt();    // 길이 입력

            // 동서 방향(가로)일 경우
            if (direction == 1 || direction == 2) {
                if (lengths[i] > maxWidth) {
                    maxWidth = lengths[i];
                    maxWidthIndex = i;
                }
            }
            // 남북 방향(세로)일 경우
            else { // direction == 3 || direction == 4
                if (lengths[i] > maxHeight) {
                    maxHeight = lengths[i];
                    maxHeightIndex = i;
                }
            }
        }

        // 작은 사각형의 가로 길이 계산
        // 가장 긴 세로 변의 양 옆에 있는 가로 변들의 차이
        int smallWidth = Math.abs(lengths[(maxHeightIndex + 5) % 6] - lengths[(maxHeightIndex + 1) % 6]);

        // 작은 사각형의 세로 길이 계산
        // 가장 긴 가로 변의 양 옆에 있는 세로 변들의 차이
        int smallHeight = Math.abs(lengths[(maxWidthIndex + 5) % 6] - lengths[(maxWidthIndex + 1) % 6]);

        // 전체 면적 계산: (전체 사각형 넓이) - (작은 사각형 넓이)
        int area = (maxWidth * maxHeight) - (smallWidth * smallHeight);

        // 결과 출력: 면적 * 1m^2당 참외의 개수
        System.out.println(area * K);

        sc.close(); // Scanner 객체 닫기
    }
}
