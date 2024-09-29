package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * 먼저 문자열의 길이로 정렬합니다 (짧은 것부터).
 * 길이가 같으면 사전순으로 정렬합니다.
 */
public class Solution25 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            if (o1.length() != o2.length()){
                return o1.length() - o2.length();
            }else return o1.compareTo(o2);
        });

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
