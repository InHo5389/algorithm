package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 회의실 배정
class Time implements Comparable<Time> {
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> list = new ArrayList<>();
        int answer = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            list.add(new Time(s, e));
        }
        Collections.sort(list);

        int et = 0;
        for (Time time : list) {
            if (time.s >= et) {
                answer++;
                et = time.e;
            }
        }
        System.out.println(answer);
    }
}
