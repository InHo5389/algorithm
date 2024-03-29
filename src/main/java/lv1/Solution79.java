package lv1;

import java.util.HashMap;
import java.util.HashSet;

// 신고 결과 받기
public class Solution79 {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportHash = new HashMap<>();
        HashMap<String,HashSet<String>> resultHash = new HashMap<>();
        int[] answer = new int[id_list.length];

        for (String r : report){
            String[] str = r.split(" ");
            if (reportHash.containsKey(str[0])==false){
                reportHash.put(str[0],new HashSet<>());
            }
            reportHash.get(str[0]).add(str[1]);

            if (resultHash.containsKey(str[1])==false){
                resultHash.put(str[1],new HashSet<>());
            }
            resultHash.get(str[1]).add(str[0]);
        }
        for (int i = 0; i < answer.length; i++) {
            String user = id_list[i];
            if (reportHash.containsKey(user)==false)continue;

            for (String bad : reportHash.get(user)){
                if (resultHash.get(bad).size()>=k){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
