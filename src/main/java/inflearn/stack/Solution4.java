package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution4 {

    public static int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)){
                stack.push(Integer.valueOf(ch));
            }else {
                int rt = stack.pop();
                int lt = stack.pop();

                if(ch=='+') stack.push(lt+rt);
                else if(ch=='-') stack.push(lt-rt);
                else if(ch=='*') stack.push(lt*rt);
                else if(ch=='/') stack.push(lt/rt);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

    }
}
