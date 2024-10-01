package baekjoon;

import java.util.Scanner;
import java.util.Stack;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Point> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (!stack.isEmpty() && stack.peek().y > y) {
                Point temp = stack.pop();
                if (!stack.isEmpty() && stack.peek().y == temp.y) continue;
                if (temp.y == 0) continue;

                answer++;
            }
            stack.push(new Point(x, y));
        }

        while (!stack.isEmpty()) {
            Point temp = stack.pop();
            if (!stack.isEmpty() && stack.peek().y == temp.y) continue;

            if (temp.y == 0) continue;

            answer++;
        }

        System.out.println(answer);
    }
}

