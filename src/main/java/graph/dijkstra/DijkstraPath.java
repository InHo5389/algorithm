package graph.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraPath {

    public static void main(String[] args) {
        DijkstraPath dijkstra = new DijkstraPath();
        HashMap<String, ArrayList<Edge>> hashMap = dijkstra.testData();
        HashMap<String, Integer> result = dijkstra.dijkstraFunc(hashMap, "A");
        System.out.println(result);
    }

    public HashMap<String,Integer> dijkstraFunc(HashMap<String,ArrayList<Edge>> graph, String start){
        Edge edgeNode,adjacentNode;
        int currentDistance,weight,distance;
        String currentNode,adjacent;
        ArrayList<Edge> nodeList;
        HashMap<String,Integer> distances = new HashMap<>();
        for (String key : graph.keySet()){
            distances.put(key,Integer.MAX_VALUE);
        }
        distances.put(start,0);
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(distances.get(start),start));

        while (priorityQueue.size()>0){
            edgeNode = priorityQueue.poll();
            currentDistance = edgeNode.distance;
            currentNode = edgeNode.vertex;

            if (distances.get(currentNode)<currentDistance){
                continue;
            }
            nodeList = graph.get(currentNode);
            for (int index=0;index<nodeList.size();index++){
                adjacentNode = nodeList.get(index);
                adjacent = adjacentNode.vertex;
                weight = adjacentNode.distance;
                distance = currentDistance + weight;

                if (distance < distances.get(adjacent)){
                    distances.put(adjacent,distance);
                    priorityQueue.add(new Edge(distance,adjacent));
                }
            }
        }
        return distances;
    }

    public HashMap<String,ArrayList<Edge>> testData(){
        HashMap<String, ArrayList<Edge>> graph = new HashMap<String, ArrayList<Edge>>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(new Edge(5, "A"))));
        return graph;
    }
}
