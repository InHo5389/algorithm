package sort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(5);
        dataList.add(1);
        dataList.add(7);
        dataList.add(2);
        dataList.add(3);

        for (int index = 0; index < dataList.size() - 1; index++) {
            for (int index2 = index + 1; index2 > 0; index2--) {
                if (dataList.get(index2) < dataList.get(index2 - 1)) {
                    Collections.swap(dataList, index2, index2 - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(dataList);
    }
}
