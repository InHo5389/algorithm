package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFSSearch {

    public static void main(String[] args) {
        BFSSearch bfs = new BFSSearch();
        HashMap<String, ArrayList<String>> testMap = bfs.testData();
        ArrayList<String> result = bfs.bfsFunc(testMap, "A");
        System.out.println(result);

    }

    public ArrayList<String> bfsFunc(HashMap<String,ArrayList<String>> graph,String startNode){
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisited = new ArrayList<>();

        needVisited.add(startNode);

        while (needVisited.size()>0){
            String node = needVisited.remove(0);

            if (!visited.contains(node)){
                visited.add(node);
                needVisited.addAll(graph.get(node));
            }
        }
        return visited;
    }
    public HashMap<String, ArrayList<String>>  testData(){

        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));
        return graph;
    }
}
