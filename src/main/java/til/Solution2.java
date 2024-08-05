package til;

import java.util.Arrays;

public class Solution2 {
    public String solution(int[] numbers) {
        String[] strArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (strArray[0].equals("0")){
            return "0";
        }
        return String.join("",strArray);
    }
}
