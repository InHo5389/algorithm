package lv1;

// 최대공약수와 최소공배수
public class Solution30 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        return answer;
    }

    public static void main(String[] args) {
        gcd(2,5);
    }

    public static int gcd(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            System.out.println("b="+b);
            a= temp;
        }
        return a;
    }

    public int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
