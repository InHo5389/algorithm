package lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 데이터 분석
public class Solution74 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String,Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);

        int[][] filterData = Arrays.stream(data).filter(x -> x[map.get(ext)] < val_ext)
                .toArray(int[][]::new);
        Arrays.sort(filterData,(o1,o2)->o1[map.get(sort_by)] - o2[map.get(sort_by)]);
        return filterData;
    }
}
