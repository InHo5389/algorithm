package lv1;

public class Solution37 {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;

        for (int[] size : sizes) {
            length = Math.max(length,Math.max(size[0],size[1]));
            height = Math.max(height,Math.min(size[0],size[1]));
        }
        return length * height;
    }
}
