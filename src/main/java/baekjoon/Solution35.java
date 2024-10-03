package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 두라무리 휴지
 *
 * 한 단어를 재배열해 다른 단어를 만들 수 있어야 한다.
 * 두 단어의 첫 글자와 마지막 글자는 서로 동일해야 한다.
 * 각 단어에서 모음(a, e, i, o, u)을 제거한 문자열은 동일해야 한다.
 */
public class Solution35 {

    static int n;
    static char[] arr1, arr2;

    public static String solution() {

        // 앞뒤 동일한지 확인
        if (arr1[0] != arr2[0] || arr1[n - 1] != arr2[n - 1]) return "NO";

        // map을 활용하여 동일한 알파벳이 들어있는지 확인
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // map의 이미 있으면 +1 하는 로직
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);

            // 모음을 제거하고 스트링 빌더에 추가
            if (!isVowel(arr1[i])) sb1.append(arr1[i]);
            if (!isVowel(arr2[i])) sb2.append(arr2[i]);
        }

        // map에 대한 알파벳 개수가 같은지 확인
        if (!map1.equals(map2)) {
            return "NO";
        }

        // 모음을 제거하고 글자가 동일한지 확인
        if (!sb1.toString().equals(sb2.toString())) {
            return "NO";
        }

        return "YES";
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n= Integer.parseInt(br.readLine());

        arr1 = new char[n];
        arr2 = new char[n];

        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();

        System.out.println(solution());
    }
}
