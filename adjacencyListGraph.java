package IIIrdWeakDSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class adjacencyListGraph {
    private LinkedList<Integer>[] adj;
    private int V;// number of veritces;
    private int E;// number of edges;

    private adjacencyListGraph(int nodes) {
        nodes = nodes + 1;
        this.adj = new LinkedList[nodes];
        this.E = 0;
        this.V = nodes;
        for (int i = 0; i < nodes; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    void addEdge(int u, int v) {
        if (u == v) {
            System.out.println("Self loop not possible ");
            return;
        }
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    void dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");

                for (Integer w : adj[u]) {
                    stack.push(w);
                }
            }

        }
    }

    void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.offer(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int w : adj[v]) {
                if (!visited[w]) {
                    q.offer(w);
                    visited[w] = true;
                }
            }
        }
        System.out.println();
    }

    void print(int i) {

        if (i < V) {
            System.out.print(i + " :");
            for (int a : adj[i]) {
                System.out.print(+a + " ");

            }
            System.out.println();
            print((i + 1));
        }

    }

    public static void main(String[] args) {
        adjacencyListGraph g = new adjacencyListGraph(4);
        g.addEdge(0, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.addEdge(2, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.bfs(0);
        g.dfs(0);
    }
}