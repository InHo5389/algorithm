package datastructure.heap;

import java.util.ArrayList;

class MinHeap {
    ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void insert(int data) {
        heap.add(data);

        int cur = heap.size() - 1;

        while (cur > 1 && heap.get(cur / 2) > heap.get(cur)) {
            int parentVal = heap.get(cur / 2);
            heap.set(cur / 2, data);
            heap.set(cur, parentVal);

            cur /= 2;
        }
    }

    public Integer delete() {
        if (heap.size() == 1) {
            System.out.println("heap is empty");
            return null;
        }

        int target = heap.get(1);

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int cur = 1;
        while (true) {
            int leftIdx = cur * 2;
            int rightIdx = cur * 2 + 1;
            int targetIdx = -1;

            if (rightIdx < heap.size()) {
                targetIdx = heap.get(leftIdx) < heap.get(rightIdx) ? leftIdx : rightIdx;
            }else if (leftIdx < heap.size()){
                targetIdx = cur * 2;
            }else {
                break;
            }

            if (heap.get(cur) < heap.get(targetIdx)){
                break;
            }else {
                int parentVal = heap.get(cur);
                heap.set(cur,heap.get(targetIdx));
                heap.set(targetIdx,parentVal);
                cur = targetIdx;
            }
        }
        return target;

    }

    public void printTree() {
        for (int i = 1; i < heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
    }
}

public class Practice1 {
}
