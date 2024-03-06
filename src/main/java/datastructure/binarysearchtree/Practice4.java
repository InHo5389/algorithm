package datastructure.binarysearchtree;

class BinarySearchTree2 {
    Node head;

    BinarySearchTree2(int key) {
        this.head = new Node(key, null, null);
    }

    public Node addNodeRecursive(Node cur, int key) {
        if (cur == null) {
            return new Node(key, null, null);
        }

        if (key < cur.key) {
            cur.left = addNodeRecursive(cur.left,key);
        }else {
            cur.right = addNodeRecursive(cur.right,key);
        }
        return cur ;
    }

    public Node removeNodeRecursive(Node cur, int key) {
        return null;
    }
}

public class Practice4 {
}
