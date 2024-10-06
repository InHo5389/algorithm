package baekjoon;

import java.util.Scanner;

/**
 * 거스름 돈
 * 주어진 금액 n을 만들기 위해 필요한 최소 동전 개수를 찾는 것이 목표
 *
 *  5원으로 나누어지면 count의 몫을 추가하고 break;
 *  나누어지지 않으면 n을 2씩 감소하며 count ++하는 로직
 */
public class Solution44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                n=0;
                break;
            }

            n-=2;
            count++;
        }

        if (n==0) System.out.println(count);
        else System.out.println(-1);
    }
}
