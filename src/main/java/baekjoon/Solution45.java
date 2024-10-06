package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 센서
 * n : 센서, k : 집중국
 *
 * 그룹 내의 센서들 간의 거리 합을 최소화하는 것
 */
public class Solution45 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[] sensors = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        // 센서들을 오름차순 정렬
        Arrays.sort(sensors);

        // 거리는 양쪽 2개를 비교하기에 n-1
        Integer[] distances = new Integer[n - 1];
        // 배열의 양쪽 거리 계산
        for (int i = 0; i < n - 1; i++) {
            distances[i] = sensors[i + 1] - sensors[i];
        }

        // Collections.reverseOrder()는 제네릭 메서드이며, Comparator<T>를 반환하여서
        // 객체를 반환하기에 distances 배열을 Integer로 선언
        // 이 거리들을 내림차순으로 정렬
        Arrays.sort(distances, Collections.reverseOrder());

        // 가장 큰 K-1개의 거리를 제외한 나머지 거리의 합 계산
        // K-1개의 가장 긴 거리를 제외함으로써,센서들을 K개의 그룹으로 나눌수 있음
        // k==2 [1 3] [6 6 7 9] , k==3  [1 3] [6 6] [7 9]
        int result = 0;
        for (int i = k - 1; i < n - 1; i++) {
            result += distances[i];
        }

        // 결과 출력
        System.out.println(result);
    }
}
