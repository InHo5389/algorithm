package inflearn.recursive;

import java.util.LinkedList;
import java.util.Queue;

// 트리 말단 노드까지의 가장 짧은 경로(bfs)
public class Solution9 {

    Node root;

    public int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if (cur.lt == null && cur.rt == null){
                    return level;
                }
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution9 tree = new Solution9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.bfs(tree.root));
    }

    static class Node {
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }
}

