package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<>();
        for(int i =0;i<100;i++) {
            testData.add((int) (Math.random() * 100+1));
        }
        QuickSort sort = new QuickSort();
        System.out.println(sort.sort(testData));
    }

    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        if (dataList.size()<=1){
            return dataList;
        }
        int pivot = dataList.get(0);
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        for (int index = 1;index<dataList.size();index++){
            if (dataList.get(index)>pivot){
                rightArr.add(dataList.get(index));
            }else {
                leftArr.add(dataList.get(index));
            }
        }

        ArrayList<Integer> mergerArr = new ArrayList<>();
        mergerArr.addAll(sort(leftArr));
        mergerArr.addAll(Arrays.asList(pivot));
        mergerArr.addAll(sort(rightArr));

        return mergerArr;
    }
}
