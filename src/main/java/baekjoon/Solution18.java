package baekjoon;

import java.util.*;

// 백준 - 30번 13116
public class Solution18 {

    public static int solution(int a, int b) {
        List<Integer> aList = getPath(a);
        List<Integer> bList = getPath(b);

        int i = 0;
        // 두 경로의 최대 공통 index 부분 찾기
        while (i < aList.size() && i < bList.size() && aList.get(i).equals(bList.get(i))) {
            i++;
        }

        return bList.get(i - 1);
    }

    // 입력 n값의 대한 트리 번호 저장 메서드
    private static List<Integer> getPath(int n) {
        List<Integer> path = new ArrayList<>();
        while (n > 0) {
            // 작은값 부터 넣기 위해 index 0 설정
            path.add(0, n);
            n /= 2;
        }
        return path;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(solution(a, b) * 10);
        }
    }
}
