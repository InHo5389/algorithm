package inflearn.repeat.array;

import java.util.Scanner;

// 가위 바위 보
public class Solution3 {

    public static String solution(int n, int[] aArr, int[] bArr) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (aArr[i] == bArr[i]) answer+= "D";
            else if (aArr[i] == 1 && bArr[i]==3) answer+= "A";
            else if (aArr[i] == 2 && bArr[i]==1) answer+= "A";
            else if (aArr[i] == 3 && bArr[i]==2) answer+= "A";
            else answer+= "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }
        for (char ch : solution(n, aArr, bArr).toCharArray()) {
            System.out.println(ch);
        }
    }
}
