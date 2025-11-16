package GRAPH;

import java.util.*;


// Using Adjacenct Matrix :
// PLease change accordingly and delete this comment

//Edge List
//Use it for creating graph for MST (Minimum span of Tree)

//Implicit Graph
// a graph is given in the Question like Floof Fill
public class AdjecencyMatrixGraph {
    static class Edge{
        int src;
        int des;
        int weight;
        public Edge(int src, int des, int weight){
            this.src = src;
            this.des = des;
            this.weight = weight;
        }
    }

    public static void ceateGraph(ArrayList<Edge> graph[]){
        for( int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,2,2));
        graph[1].add(new Edge(1,3,2));

        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,5));
        graph[2].add(new Edge(2,3,5));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(1,2,4));

    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        ceateGraph(graph);

        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.des + " , "+e.weight);
        }

    }
}
