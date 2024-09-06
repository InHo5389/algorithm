package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 백준 베스트셀러 1302
 * map을 sort 하기 위해 list에 넣고
 * Comparator를 구현하여 value는 내림차순, key는 오름차순으로 sort
 */
public class Solution13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((e1, e2) -> {
            int compareValue = e2.getValue().compareTo(e1.getValue());
            if (compareValue != 0) {
                return compareValue;
            }
            return e1.getKey().compareTo(e2.getKey());
        });

        System.out.println(entries.get(0).getKey());
    }
}
