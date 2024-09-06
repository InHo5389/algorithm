package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 백준 서로 다른 부분 문자열의 개수 11478
 * substring()를 사용하여 연속된 것을 다 가져와
 * set 자료구조로 중복제거
 */
public class Solution11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        HashSet<String> substrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }

        System.out.println(substrings.size());
    }
}
