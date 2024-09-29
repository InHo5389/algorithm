package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 문제에서 정의하는 좌표 압축의 규칙은 다음과 같습니다:
 * "Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표 Xj의 개수와 같아야 한다."
 *
 * 이를 풀어서 설명하면:
 * 각 좌표 Xi에 대해,
 * Xi보다 작은 서로 다른 좌표의 개수를 세고,
 * 그 개수가 바로 압축된 좌표 X'i가 됩니다.
 */
public class Solution24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] originArr = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            sorted[i] = originArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        int rank = 0;
        for (int num : sorted) {
            if (!rankingMap.containsKey(num)){
                rankingMap.put(num,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : originArr) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}
