package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class graphAdjList {
    List<List<Integer>> adjList;

    graphAdjList(int nodes){
        adjList = new ArrayList<>();
        for(int i=0; i<nodes; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int[] edge, boolean isDirected){
        int u = edge[0];
        int v = edge[1];
        adjList.get(u).add(v);
        if(!isDirected){
            adjList.get(v).add(u);
        }
    }

    public void printAdjList(){
        for(int i=0; i<adjList.size(); i++){
            System.out.print(i + " -> ");
            System.out.println(adjList.get(i));
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0,2},{0,1},{1,3}}; 
        int nodes = 4;

        System.out.println("Undirected Graph:");
        graphAdjList g1 = new graphAdjList(nodes);
        for(int[] edge : edges){
            g1.addEdge(edge, false);
        }
        g1.printAdjList();

        System.out.println("Directed Graph:");
        graphAdjList g2 = new graphAdjList(nodes);
        for(int[] edge : edges){
            g2.addEdge(edge, true);
        }
        g2.printAdjList();
    }
}
