package lv1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// 2016년
public class Solution50 {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}
