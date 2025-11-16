package GRAPH;

import java.util.*;


 // Using Adjacenct List
// NO extra space
public class MyGraph {
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
        graph[3].add(new Edge(3,2,4));

    }

    public static void bfs(ArrayList<Edge>  graph[], int V,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr);
                vis[curr] = true;
                for(int i = 0; i <graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[] , int curr, boolean vis[]){
        System.out.println(curr + " ");
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.des] == false){
                dfs(graph, e.des , vis);
            }
        }
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        ceateGraph(graph);
        boolean vis[] = new boolean[V];

        //  This is very usefull when the graph is unconnected
        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                dfs(graph,i,vis);
            }
        }


    //  This is very usefull when the graph is unconnected
//        for(int i = 0; i < V; i++){
//            if(vis[i] == false){
//                bfs(graph, V, vis, i);
//            }
//        }
//        for(int i = 0; i < graph[2].size(); i++){
//            Edge e = graph[2].get(i);
//            System.out.println(e.des + " , "+e.weight);
//        }

    }
}
