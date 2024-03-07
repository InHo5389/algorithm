package lv1;

// 수박수박수박수박수박수?
public class Solution22 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i%2==0) sb.append("수");
            else sb.append("박");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution22 s = new Solution22();
        String solution = s.solution(4);
        System.out.println(solution);

    }
}
