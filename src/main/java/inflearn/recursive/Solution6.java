package inflearn.recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 이진 트리 탐색(bfs)
public class Solution6 {

    Node root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
    }

    public void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while (!q.isEmpty()){
            int len = q.size();
            System.out.print(l+" : ");
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.data+" " );
                if (cur.lt!=null){
                    q.offer(cur.lt);
                }
                if (cur.rt!=null){
                    q.offer(cur.rt);
                }
                l++;
                System.out.println();
            }
        }
    }

    class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }
}
