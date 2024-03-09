package datastructure.priorityqueue;

import java.util.*;

// 연결리스트를 이용한 우선순위 큐
// 자바 기본 PriorityQueue
public class Practice1 {
    public static void main(String[] args) {
        System.out.println("== 연결리스트 방식의 우선순위 큐 ==");
        LinkedList<Integer> pqList = new LinkedList<>();
        enqueue(pqList,5);
        enqueue(pqList,7);
        enqueue(pqList,3);
        enqueue(pqList,1);
        enqueue(pqList,9);
        System.out.println(pqList);

        System.out.println(dequeue(pqList));
        System.out.println(dequeue(pqList));
        System.out.println(pqList);
        System.out.println();

        System.out.println("== 자바 기본 우선순위 큐 ==");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(1);
        pq.add(9);
        System.out.println(Arrays.toString(pq.toArray()));
    }

    public static void enqueue(LinkedList<Integer> list, int data) {
        int idx = list.size();
        for (int i = 0; i < idx; i++) {
            if (list.get(i)>data){
                idx = i;
                break;
            }
        }
        list.add(idx,data);
    }
    public static Integer dequeue(LinkedList<Integer>list){
        if (list.size()==0){
            return null;
        }
        Integer data = list.get(0);
        list.remove(0);
        return data;
    }
}
