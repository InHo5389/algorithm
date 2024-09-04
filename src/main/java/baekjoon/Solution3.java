package baekjoon;

import java.util.Scanner;

// 수들의 합(2018)
public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1, end = 1, sum = 1;
        int count = 0;

        while (start <= end) {
            if (sum == n) count++;
            if (sum < n) {
                end++;
                sum+=end;
            }else if (sum >= n){
                sum -= start;
                start++;
            }
        }

        System.out.println(count);
    }
}
