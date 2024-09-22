package inflearn.repeat.string;

import java.util.Scanner;

// 숫자만 추출
public class Solution9 {

    public static int solution(String str){
        str = str.replaceAll("[^0-9]","");
        return Integer.valueOf(str);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
