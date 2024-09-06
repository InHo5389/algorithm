package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 단어 뒤집기2 17413
 */
public class Solution12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean isTag = false;

        for (char ch : str.toCharArray()) {
            if (ch == '<') {
                result.append(word.reverse());
                word.setLength(0);
                isTag = true;
                result.append(ch);
            } else if (ch == '>') {
                isTag = false;
                result.append(ch);
            } else if (isTag) {
                result.append(ch);
            } else if (ch == ' ') {
                result.append(word.reverse()).append(ch);
            } else {
                word.append(ch);
            }
        }

        result.append(word.reverse());
        System.out.println(result);
    }
}
