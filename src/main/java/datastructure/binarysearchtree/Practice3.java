package datastructure.binarysearchtree;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    Node head;

    public BinarySearchTree(int key) {
        this.head = new Node(key, null, null);
    }

    public void addNode(int key) {
        if (this.head == null) {
            head = new Node(key, null, null);
        } else {
            Node cur = this.head;

            while (true) {
                Node pre = cur;

                if (key < cur.key) {
                    cur = cur.left;

                    if (cur == null) {
                        pre.left = new Node(key, null, null);
                        break;
                    }
                } else {
                    cur = cur.right;

                    if (cur == null) {
                        pre.right = new Node(key, null, null);
                        break;
                    }
                }
            }
        }
    }

    public void removeNode(int key) {
        Node parent = null;
        Node successor = null;
        Node predecessor = null;
        Node child = null;

        Node cur = this.head;
        while (cur != null) {
            if (key == cur.key) {
                break;
            }

            parent = cur;
            if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        if (cur == null) {
            System.out.println("해당 노드가 없습니다.");
        }

        if (cur.left == null && cur.right == null) {
            if (parent == null) {
                this.head = null;
            } else {
                if (parent.left == cur) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (cur.left != null && cur.right == null || cur.left == null && cur.right != null) {
            if (cur.left != null) {
                child = cur.left;
            } else {
                child = cur.right;
            }

            if (parent == null) {
                this.head = child;
            } else {
                if (parent.left == cur) {
                    parent.left = cur;
                } else {
                    parent.right = cur;
                }
            }
        } else {
            predecessor = cur;
            successor = cur.left;

            while (successor.right != null) {
                predecessor = successor;
                successor = successor.right;
            }

            predecessor.right = successor.left;
            successor.left = cur.left;
            successor.right = cur.right;

            if (parent == null) {
                this.head = successor;
            } else {
                if (parent.left == cur){
                    parent.left = successor;
                }else {
                    parent.right = successor;
                }
            }
        }
    }
}

public class Practice3 {

}
