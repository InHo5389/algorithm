package datastructure.binarytree;

// 배열을 통한 이진 트리 탐색
class BinaryTree {
    char[] arr;

    public BinaryTree(char[] arr) {
        this.arr = arr.clone();
    }

    public void preOrder(int idx) {

        System.out.print(arr[idx] + " ");
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left<this.arr.length){
            preOrder(left);
        }
        if (right<this.arr.length){
            preOrder(right);
        }
    }

    public void inOrder(int idx) {

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left<this.arr.length){
            inOrder(left);
        }
        System.out.print(arr[idx] + " ");

        if (right<this.arr.length){
            inOrder(right);
        }
    }
    public void postOrder(int idx) {

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left<this.arr.length){
            postOrder(left);
        }

        if (right<this.arr.length){
            postOrder(right);
        }
        System.out.print(arr[idx] + " ");
    }

    public void levelOrder(int idx){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }

        BinaryTree bt = new BinaryTree(arr);
        System.out.println("=== PreOrder ===");
        bt.preOrder(0);
        System.out.println();

        System.out.println("=== InOrder ===");
        bt.inOrder(0);
        System.out.println();

        System.out.println("=== PostOrder ===");
        bt.postOrder(0);
        System.out.println();

        System.out.println("=== LevelOrder ===");
        bt.levelOrder(0);
        System.out.println();
    }
}
