package inflearn.recursive;

// 트리 말단 노드까지의 가장 짧은 경로(dfs)
public class Solution8 {

    Node root;

    public int dfs(int level, Node root) {
        if (root.lt == null && root.rt == null) {
            return level;
        }

        return Math.min(dfs(level + 1, root.lt), dfs(level + 1, root.rt));
    }

    public static void main(String[] args) {
        Solution8 tree = new Solution8();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(0, tree.root));
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
