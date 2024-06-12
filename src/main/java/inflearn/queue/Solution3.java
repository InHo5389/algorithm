package inflearn.queue;

import java.util.*;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

// 응급실
public class Solution3 {

    public static int solution(int[] arr, int m) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person person : queue) {
                if (person.priority > tmp.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp!=null){
                answer++;
                if (tmp.id == m){
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = solution(arr, m);
        System.out.println(solution);
    }
}
