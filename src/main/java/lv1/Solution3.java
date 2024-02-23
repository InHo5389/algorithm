package lv1;

// 약수의 합
public class Solution3 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n/2 ; i++) {
            if (n%i==0){
                answer+=i;
            }
        }
        return answer+n;
    }
}
