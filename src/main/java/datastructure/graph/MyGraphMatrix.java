package datastructure.graph;

// 인접 행렬을 이용한 그래프 구현
public class MyGraphMatrix {
    char[] vertices;
    int[][] adjMat;
    int elemCnt;

    public MyGraphMatrix(int size) {
        this.vertices = new char[size];
        this.adjMat = new int[size][size];
        this.elemCnt = 0;
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
        this.adjMat[x][y] = 1;
        this.adjMat[y][x] = 1;
    }

    public void deleteEdge(int x, int y) {
        this.adjMat[x][y] = 0;
        this.adjMat[y][x] = 0;
    }

    public void printAdjacentMatrix() {
        System.out.print("  ");
        for (char vertex : vertices) {
            System.out.print(vertex + " ");
        }
        System.out.println();

        for (int i = 0; i < elemCnt; i++) {
            System.out.print(vertices[i]+" ");
            for (int j = 0; j < elemCnt; j++) {
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyGraphMatrix graph = new MyGraphMatrix(4);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.printAdjacentMatrix();
    }
}

