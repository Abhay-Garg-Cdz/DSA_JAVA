package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;

public class DirectedGraphWithShortestPath2642L {

    public static void main(String[] args) {
        int[][] edges = { { 0, 2, 5 }, { 0, 1, 2 }, { 1, 2, 1 }, { 3, 0, 3 } };

        Graph g = new Graph(4, edges);
        System.out.println(g.shortestPath(3, 2));
    }
}


// Used Dijikstra Algorithm
class Graph {

    List<List<Pair<Integer, Integer>>> adjList;

    public Graph(int n, int[][] edges) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList.add(new ArrayList<>());
        for (int[] e : edges)
            adjList.get(e[0]).add(new Pair<>(e[1], e[2]));

            // System.out.println(adjList);
    }

    public void addEdge(int[] edge) {
        adjList.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
    }

    public int shortestPath(int node1, int node2) {
        int n = adjList.size();
        var pq = new PriorityQueue<List<Integer>>(Comparator.comparingInt(list -> list.get(0)));
        // System.out.println(pq);
        int[] costForNode = new int[n];
        Arrays.fill(costForNode, Integer.MAX_VALUE);
        costForNode[node1] = 0;
        pq.offer(Arrays.asList(0, node1));
        // System.out.println(pq);

        while (!pq.isEmpty()) {
            var curr = pq.poll();
            int currCost = curr.get(0);
            int currNode = curr.get(1);

            if (currCost > costForNode[currNode]) {
                continue;
            }
            if (currNode == node2) {
                return currCost;
            }
            for (var neighbor : adjList.get(currNode)) {
                int neighborNode = neighbor.getKey();
                int cost = neighbor.getValue();
                int newCost = currCost + cost;

                if (newCost < costForNode[neighborNode]) {
                    costForNode[neighborNode] = newCost;
                    pq.offer(Arrays.asList(newCost, neighborNode));
                    // System.out.println(pq);
                }
            }
        }

        return -1;
    }
}

class Pair<E, T> {
    Integer key;
    Integer value;

    Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public Integer getKey() {
        return this.key;
    }
    public String toString(){

        return("("+this.key+","+this.value+")");
    }
}




// Soln On LeetCode Using javafx.Pair Class  and using dijikstra Algo

// class Graph {
//     List<List<Pair<Integer, Integer>>> adjList;
//     public Graph(int n, int[][] edges) {
//         adjList = new ArrayList<>();
//         for (int i = 0; i < n; i++)
//             adjList.add(new ArrayList<>());
//         for (int[] e : edges)
//             adjList.get(e[0]).add(new Pair<>(e[1], e[2]));
//     }

//     public void addEdge(int[] edge) {
//         adjList.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
//     }

//     public int shortestPath(int node1, int node2) {
//         int n = adjList.size();
//         var pq = new PriorityQueue<List<Integer>>(Comparator.comparingInt(list -> list.get(0)));
//         int[] costForNode = new int[n];
//         Arrays.fill(costForNode, Integer.MAX_VALUE);
//         costForNode[node1] = 0;
//         pq.offer(Arrays.asList(0, node1));

//         while (!pq.isEmpty()) {
//             var curr = pq.poll();
//             int currCost = curr.get(0);
//             int currNode = curr.get(1);

//             if (currCost > costForNode[currNode]) {
//                 continue;
//             }
//             if (currNode == node2) {
//                 return currCost;
//             }
//             for (var neighbor : adjList.get(currNode)) {
//                 int neighborNode = neighbor.getKey();
//                 int cost = neighbor.getValue();
//                 int newCost = currCost + cost;

//                 if (newCost < costForNode[neighborNode]) {
//                     costForNode[neighborNode] = newCost;
//                     pq.offer(Arrays.asList(newCost, neighborNode));
//                 }
//             }
//         }

//         return -1;
//     }
// }




// soln on leetsode using Pair class and Floyd–Warshall algorithm


// class Graph {
//     private int[][] adjMatrix;

//     public Graph(int n, int[][] edges) {
//         adjMatrix = new int[n][n];
//         Arrays.stream(adjMatrix).forEach(row -> Arrays.fill(row, (int)1e9));
//         for (int[] e : edges) {
//             adjMatrix[e[0]][e[1]] = e[2];
//         }
//         for (int i = 0; i < n; i++) {
//             adjMatrix[i][i] = 0;
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 for (int k = 0; k < n; k++) {
//                     adjMatrix[j][k] = Math.min(adjMatrix[j][k], 
//                                                adjMatrix[j][i] +
//                                                adjMatrix[i][k]);
//                 }
//             }
//         }
//     }

//     public void addEdge(int[] edge) {
//         int n = adjMatrix.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 adjMatrix[i][j] = Math.min(adjMatrix[i][j],
//                                            adjMatrix[i][edge[0]] +
//                                            adjMatrix[edge[1]][j] +
//                                            edge[2]);
//             }
//         }
//     }

//     public int shortestPath(int node1, int node2) {
//         if (adjMatrix[node1][node2] == (int)1e9)
//             return -1;
//         return adjMatrix[node1][node2];
//     }
// }