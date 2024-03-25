package lv1;

// 키패드 누르기
public class Solution71 {
    int[][] numpadPos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };

    //초기 위치
    int[] leftPos = {3,0};
    int[] rightPos = {3,2};
    String hand;

    public String solution(int[] numbers, String hand) {
        String answer = "";
        this.hand = hand.equals("right") ? "R":"L";
        for (int number : numbers) {
            String umji = pushNumber(number);
            answer+=umji;

            if(umji.equals("L")) {leftPos = numpadPos[number]; continue;}
            if(umji.equals("R")) {rightPos = numpadPos[number]; continue;}
        }
        return answer;
    }

    private String pushNumber(int number) {
        if(number==1 || number==4 || number==7) return "L";
        if(number==3 || number==6 || number==9) return "R";
        if (getDist(leftPos,number) > getDist(rightPos,number)) return "R";
        if (getDist(leftPos,number) < getDist(rightPos,number)) return "L";
        return this.hand;
    }

    private int getDist(int[] pos, int number) {
        return Math.abs(pos[0]-numpadPos[number][0])+Math.abs(pos[1]-numpadPos[number][1]);
    }
}
