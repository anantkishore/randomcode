package com.kishore.anant.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean[] visited = new boolean[adj.size()];

        s.push(0);
        visited[0] = true;

        while (s.size() > 0)
        {
            int v = s.pop();
            System.out.print(v + " ");
            result.add(v);

            ArrayList<Integer> edges = adj.get(v);

            for (Integer e: edges) {
                if (!visited[e]) {
                    visited[e] = true;
                    s.push(e);
                }
            }
        }
        return result;
    }

    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList();
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        visited[0] = true;
        queue.add(0);
        while (queue.size() > 0) {

            // pop a vertex from queue and print it
            int v = queue.poll();
            System.out.print(v + " ");
            result.add(v);

            ArrayList<Integer> edges = adj.get(v);

            for (int i = 0; i < edges.size(); i++) {
                if (edges.get(i) == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }

    return result;
    }

}
