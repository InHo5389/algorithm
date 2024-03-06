package datastructure.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 인접 행렬 그래프의 DFS,BFS
class MyGraphMatrix2 extends MyGraphMatrix{

    public MyGraphMatrix2(int size) {
        super(size);
    }

    public void dfs(int id){
        boolean[] visited = new boolean[elemCnt];
        Stack<Integer> stack = new Stack<>();

        stack.push(id);
        visited[id] = true;

        while (!stack.isEmpty()){
            Integer curId = stack.pop();
            System.out.print(vertices[curId]+" ");

            for (int i = elemCnt -1 ; i >= 0 ; i--) {
                if (adjMat[curId][i]==1 && visited[i] == false){
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    public void bfs(int id){
        boolean[] visited = new boolean[elemCnt];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(id);
        visited[id] = true;

        while (!queue.isEmpty()){
            Integer curId = queue.poll();
            System.out.print(vertices[curId]+" ");

            for (int i = elemCnt -1 ; i >= 0 ; i--) {
                if (adjMat[curId][i]==1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
}
public class Practice1 {


}
