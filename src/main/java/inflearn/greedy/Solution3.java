package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 결혼식
public class Solution3 {
    static class Time implements Comparable<Time> {
        public int time;
        public char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) return this.state - o.state;
            else return this.time - o.time;
        }
    }

    public static void main(String[] args) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            list.add(new Time(st,'s'));
            list.add(new Time(et,'e'));
        }

        Collections.sort(list);
        for (Time time : list) {
            if (time.state=='s') cnt++;
            else cnt--;
            answer = Math.max(answer,cnt);
        }

        System.out.println(answer);
    }
}
