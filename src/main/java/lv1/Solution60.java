package lv1;

// 제일 작은 수 제거하기
public class Solution60 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if (arr.length == 1) return new int[]{-1};
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[tmp] > arr[i]) {
                tmp = i;
            }
        }
        for (int i = tmp + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
