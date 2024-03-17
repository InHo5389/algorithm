package lv1;

// 카드 뭉치
public class Solution49 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int x = 0;
        int y = 0;

        int i = 0;
        while (i<goal.length){
            if (x<cards1.length && goal[i].equals(cards1[x])){
                x++;
            }else if (y<cards2.length && goal[i].equals(cards2[y])){
                y++;
            }else {
                answer="No";
                break;
            }
            i++;
        }
        return answer;
    }
}
