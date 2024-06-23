package inflearn.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x-o.x;
    }
}
// 좌표 정렬
public class Solution7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x,y);
        }

        Arrays.sort(points);
        for (Point point : points) {
            System.out.println(point.x+" "+point.y);
        }
    }
}
