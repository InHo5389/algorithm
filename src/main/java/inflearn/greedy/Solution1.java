package inflearn.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 인프런 - 씨름 선수
class Body implements Comparable<Body> {
    public int key;
    public int weight;

    public Body(int key, int weight) {
        this.key = key;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.key - this.key;
    }
}

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int answer = 0;
        int n = sc.nextInt();
        ArrayList<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int weight = sc.nextInt();

            list.add(new Body(key,weight));
        }

        Collections.sort(list);

        for (Body body : list) {
            if (body.weight > max){
                max = body.weight;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
