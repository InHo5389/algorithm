package lv1;

// 실패율
public class Solution58 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] doubleArr = new double[N];
        int stagesLength = stages.length;
        double tempD;
        int tempI;

        for (int stage : stages) {
            if (stage != N +1){
                answer[stage-1] += 1;
            }
        }

        for (int i = 0; i < N; i++) {
            int personNum = answer[i];
            doubleArr[i] = (double) personNum / stagesLength;
            stagesLength -= personNum;
            answer[i] = i+1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N-i; j++) {
                if (doubleArr[j-1]<doubleArr[j]){
                    tempD = doubleArr[j-1];
                    doubleArr[j-1] = doubleArr[j];
                    doubleArr[j] = tempD;

                    tempI = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = tempI;
                }
            }
        }
        return answer;
    }
}
