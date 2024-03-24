package lv1;

import java.util.Stack;

// 크레인 인형뽑기 게임
public class Solution70 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move-1]!=0){
                    if (stack.isEmpty()){
                        stack.push(board[i][move-1]);
                        board[i][move-1] = 0;
                        break;
                    }
                    if (board[i][move-1]==stack.peek()){
                        stack.pop();
                        answer+=2;
                    }else {
                        stack.push(board[i][move-1]);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
