package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(5);
        dataList.add(1);
        dataList.add(7);
        dataList.add(2);
        dataList.add(3);

        int lowest;
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;
            for (int index = stand + 1; index < dataList.size(); index++) {
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }
        System.out.println(dataList);
    }
}
