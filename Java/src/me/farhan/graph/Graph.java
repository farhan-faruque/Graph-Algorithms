package me.farhan.graph;

/**
 * Created by farhan on 8/24/15.
 */
public class Graph {

    private final int V;
    private int E;

    public Graph(int V){
        this.V = V;
    }

    public Graph(In in){
        this(in.readInt());
    }

    public int V(){
        return 0;
    }

    public int E(){
        return 0;
    }

    public void addEdge(int v,int w){

    }

    public Iterable<Integer> adj(int v){
        return null;
    }

    @Override
    public String toString() {
        String s = V + " vertices, " + E + " edges\n";
        for (int v = 0; v < V; v++)
        {
            s += v + ": ";
            for (int w : this.adj(v))
                s += w + " ";
            s += "\n";
        }
        return s;
    }

    public static int degree(final Graph G,final int v){
        int degree = 0;
        for(int w: G.adj(v))
            degree++;
        return degree;
    }

    public static int maxDegree(Graph G){
        int maxdegree = 0;
        for(int v = 0; v< G.V(); v++)
        {
            int d = degree(G,v);
            if(d > maxdegree)
                maxdegree = d;
        }
        return maxdegree;
    }

    public static int avgDegree(Graph G){
        return 2 * G.V() / G.E();
    }

    public static int numberOfSelfLoops(Graph G){
        int count = 0;

        for (int v = 0; v < G.V(); v++){
            for(int w : G.adj(v)){
                if(v == w)
                    count++;
            }
        }
        return count / 2;
    }
}
