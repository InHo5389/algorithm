package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 잃어버린 괄호
 * -로 문자열을 분리 후 첫번째는 숫자니까 result 더하고
 * -로 분리된 문자열을 result에서 계속 빼주면 됨!
 * (55)-(50+40) = -35
 */
public class Solution36 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] minusSplit = str.split("-");
        int result = sum(minusSplit[0]);

        for (int i = 1; i < minusSplit.length; i++) {
            result -= sum(minusSplit[i]);
        }

        System.out.println(result);
    }

    public static int sum(String str) {
        int sum = 0;
        String[] plusSplit = str.split("\\+");
        for (String num : plusSplit) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
