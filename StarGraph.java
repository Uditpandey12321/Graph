package GRAPH;
//import java.util.*;

class CenterOfStarGraph {  
    public int findCenter(int[][] edges) {
        
        if (edges[0][0] == edges[1][1] || edges[0][0] == edges[1][0]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
    }
}

public class StarGraph {
    public static void main(String[] args) {
        // Example star graph: edges connecting the center node
        int[][] edges = { {1, 2}, {1, 3}, {1, 4}, {1, 5} };

        // Creating an instance of CenterOfStarGraph correctly
        CenterOfStarGraph solution = new CenterOfStarGraph();
        
        // Finding the center of the star graph
        int center = solution.findCenter(edges);
        
        // Displaying result
        System.out.println("The center of the star graph is: " + center);
    }
}