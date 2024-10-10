package til;

// 프로그래머스 - 타겟 넘버
public class Solution4 {
    int[] numbers;
    int target;
    int answer = 0;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        dfs(0, 0);
        return answer;
    }

    private void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (target == sum){
                answer++;
            }
            return;
        }
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
