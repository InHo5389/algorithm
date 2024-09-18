package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최대 수입 스케쥴
class Lecture implements Comparable<Lecture> {
    int day;
    int money;

    public Lecture(int day, int money) {
        this.day = day;
        this.money = money;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}

public class Solution4 {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).day < i) break;

                pq.offer(arr.get(j).money);
            }
            if (!pq.isEmpty()){
                answer+=pq.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lecture> list = new ArrayList<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            max = Math.max(d, max);
            list.add(new Lecture(d, m));
        }
    }
}
