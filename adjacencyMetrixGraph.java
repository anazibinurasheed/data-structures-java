package IIIrdWeakDSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import repeatweakdsa2.stack;

/**
 * arrgraphfinal
 */
public class adjacencyMetrixGraph {

    int[][] adjmatrix;
    int e;
    int v;

    adjacencyMetrixGraph(int capacity) {
        adjmatrix = new int[capacity][capacity];
        e = 0;
        v = capacity;
    }

    void addEdge(int u, int v) {
        if (u == v)
            return;
        adjmatrix[u][v] = 1;
        adjmatrix[v][u] = 1;
        e++;
    }

    void removeEdge(int u, int v) {
        if (u == v)
            return;
        adjmatrix[u][v] = 0;
        adjmatrix[v][u] = 0;
    }

    boolean contains(int u, int v) {
        if (u == v)
            return false;
        return adjmatrix[u][v] == 1;
    }

    void print() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " :");
            for (int j = 0; j < v; j++) {
                System.out.print(adjmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    void bfs(int s) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.println(u + " ");
            for (int i = 0; i < v; i++) {
                if (adjmatrix[u][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }

        }
    }

    void dfs(int s) {
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.println(u + " ");
                for (int i = 0; i < v; i++) {
                    if (adjmatrix[u][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        adjacencyMetrixGraph g = new adjacencyMetrixGraph(4);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(0, 3);
        g.print();
        g.bfs(0);
        g.dfs(0);

    }
}