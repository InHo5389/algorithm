package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 30
 * 주어진 값들 중 30의 배수 가장 큰 값을 만들어라
 * 만약 없으면 -1 출력
 */
public class Solution38 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] count = new int[10];
        int sum = 0;

        for (char ch : input.toCharArray()) {
            int digit = ch - '0';
            count[digit]++;
            sum += digit;
        }

        if (sum % 3 != 0 || count[0] == 0){
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while (count[i]>0){
                sb.append(i);
                count[i]--;
            }
        }

        System.out.println(sb);
    }
}
