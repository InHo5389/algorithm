package lv1;

// 가운데 글자 가져오기
public class Solution23 {
    public String solution(String s) {
        int length = s.length();
        if (length%2==0){// 1 3
            return s.substring(length/2-1,length/2+1);

        }else {
            return s.substring(length/2,length/2+1);
        }
    }
}
