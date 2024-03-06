package datastructure.graph;

import java.util.Stack;

// 연결리스트를 통한 그래프의 DFS,BFS
class MyGraphList2 extends MyGraphList {

    public MyGraphList2(int size) {
        super(size);
    }

    public void dfs(int id) {
        boolean[] visited = new boolean[id];
        Stack<Integer> stack = new Stack<>();

        stack.push(id);
        visited[id] = true;

        while (!stack.isEmpty()) {
            Integer curId = stack.pop();
            System.out.print(vertices[curId] + " ");

            Node cur = adjList[curId];
            while (cur != null) {
                if (visited[cur.id] == false) {
                    stack.push(cur.id);
                    visited[cur.id] = true;
                }

                cur = cur.next;
            }
        }
    }
}

public class Practice2 {
}
