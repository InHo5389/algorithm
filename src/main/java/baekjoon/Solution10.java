package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

// 백준 20291 파일정리
public class Solution10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String key = br.readLine().split("\\.")[1];
            map.put(key, map.getOrDefault(key, 0) + 1);

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
