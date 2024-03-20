package lv1;

// 로또의 최고 순위와 최저 순위
public class Solution61 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroNum = 0;
        int sameNum = 0;

        for (int lotto : lottos) {
            if (lotto ==0){
                zeroNum++;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum){
                    sameNum++;
                }
            }
        }

        answer[0] = getGrade(sameNum + zeroNum);
        answer[1] = getGrade(sameNum);
        return answer;
    }

    public int getGrade(int number){
        switch (number){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
