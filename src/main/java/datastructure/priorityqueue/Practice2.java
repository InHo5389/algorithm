package datastructure.priorityqueue;

import java.util.PriorityQueue;

// PriorityQueue 응용
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        // this부분이 새로들어오는 데이터
        // 새롭게 추가하는 데이터가 더 적을 때 변경(적은값이 위로, 오름차순)
//        return this.age >= o.age ? 1 : -1;
        // 내림차순
        return this.age >= o.age ? -1 : 1;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        int[] age = {30, 20, 45, 62, 35};
        solution(name, age);

        // 인터페이스를 구현하지 않고 만드는 방법
        PriorityQueue<Person> pq = new PriorityQueue<>(
                (Person p1, Person p2) -> p1.age >= p2.age ? 1 : -1
        );
    }

    public static void solution(String[] name, int[] age) {
        PriorityQueue<Person> pq = new PriorityQueue<>();

        for (int i = 0; i < name.length; i++) {
            pq.offer(new Person(name[i], age[i]));
        }

        System.out.println("== 실제 출력 순서 ==");
        while (!pq.isEmpty()) {
            Person poll = pq.poll();
            System.out.println(poll.name + " " + poll.age);
        }
    }
}
