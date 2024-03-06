package datastructure.graph;

// 연결리스트를 이용한 그래프 구현
class Node {
    int id;
    Node next;

    public Node(int id, Node next) {
        this.id = id;
        this.next = next;
    }
}

public class MyGraphList {
    char[] vertices;
    Node[] adjList;
    int elemCnt;

    public MyGraphList(int size) {
        vertices = new char[size];
        adjList = new Node[size];
        elemCnt = 0;
    }

    public boolean isFull() {
        return elemCnt == this.vertices.length;
    }

    public void addVertex(char data) {
        if (isFull()) {
            System.out.println("graph is full");
            return;
        }

        this.vertices[this.elemCnt++] = data;
    }

    public void addEdge(int x, int y) {
        adjList[x] = new Node(y,adjList[x]);
        adjList[y] = new Node(x,adjList[y]);
    }

    public void printAdjacentList(){
        for (int i = 0; i < elemCnt; i++) {
            System.out.print(vertices[i]+": ");

            Node cur = adjList[i];
            while (cur!=null){
                System.out.print(vertices[cur.id]+" ");
                cur = cur.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        MyGraphList graph = new MyGraphList(4);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.printAdjacentList();
    }
}
