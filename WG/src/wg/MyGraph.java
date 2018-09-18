/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wg;

/**
 *
 * @author MakhuraneT
 */
public class MyGraph {

    private int[][] adj; // Adjacency matrix
    private Vertex[] vertexList;

    // for dijkstra's algorithm
    private int[] dist;
    private int[] prev;

    public MyGraph(int size) {
        // initialise the adjacency matrix
        adj = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                adj[row][column] = 0;
            }
        }
        // initialise the vertex list
        vertexList = new Vertex[size];

        for (int i = 0; i < vertexList.length; i++) {
            vertexList[i] = new Vertex(i);
            vertexList[i].setLabel(i);
            vertexList[i].setWasVisited(false);
        }
    }

    public void addEdge(int i, int j, int weight) {
        adj[i][j] = weight;
        adj[j][i] = weight;
    }

    public void addVertex(int i) {
        vertexList[i] = new Vertex(i);
    }

    public void displayVertex(int i) {
        System.out.print(vertexList[i].getLabel() + " ");
    }

    public int getAdjUnvisitedVertex(int i) {
        int pos = 0;
        while (pos < adj.length) {
            if (adj[i][pos] > 0 && !vertexList[pos].isWasVisited()) {
                return pos;
            }
            pos++;
        }
        return -1;
    }

    public void dfs() {
        MyStack aStack = new MyStack(adj.length);
        // begin at vertex 0;
        vertexList[0].setWasVisited(true);
        aStack.push(0);
        while (!aStack.isEmpty()) {
            int u = aStack.peek();
            int v = getAdjUnvisitedVertex(u);
            if (v == -1) {
                int garbage = aStack.pop();
            } else {
                vertexList[v].setWasVisited(true);
                aStack.push(v);
                displayVertex(u);
                displayVertex(v);
                System.out.println(" ");
            }
        }
        for (int i = 0; i < vertexList.length; i++) {
            vertexList[i].setWasVisited(false);
        }

    }

    public void bfs() {
        MyQueue q = new MyQueue(adj.length);
        // begin at vertex 0
        q.enqueue(0);
        while (!q.isEmpty()) {
            int u = q.dequeue();
            vertexList[u].setWasVisited(true);
            for (int v = 0; v < adj.length; v++) {
                if (adj[u][v] > 0 && !vertexList[v].isWasVisited()) {
                    displayVertex(u);
                    displayVertex(v);
                    System.out.println(" ");
                    q.enqueue(v);
                }
            }
        }
        for (Vertex v : vertexList) {
            v.setWasVisited(false);
        }
    }

    // Minimum Spanning Tree
    public void kruskal() {
        // set up a list of edges from our adjacency matrix
        // instantiate edge array
        EdgeArray ea = new EdgeArray(adj.length * adj.length);
        for (int i = 0; i < ea.getEdge().length; i++) {
            ea.getEdge()[i] = new Edge();
        }

        // extract edges from the adjacency matrix, counting upward
        // as each edge is encountered while scanning through the adj matrix
        int count = 0;
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                if (adj[i][j] > 0 && adj[j][i] > 0) {
                    Edge anEdge = new Edge();
                    anEdge.setU(i);
                    anEdge.setV(j);
                    anEdge.setWeight(adj[i][j]);
                    ea.getEdge()[count] = anEdge;
                    count++;
                }
            }
        }

        // Kruskal's algorithm using our disjoint set forest ds
        DisjointSetForest ds = new DisjointSetForest(adj.length);

        // initialise the disjoint set
        for (int i = 0; i < vertexList.length; i++) {
            ds.makeSet(i);
        }
        ea.sort();  // sort edges into ascending weight order

        for (int i = 0; i < ea.getEdge().length; i++) {
            Edge e = ea.getEdge()[i];
            int u = e.getU();
            int v = e.getV();
            int w = e.getWeight();
            if (ds.find(u) != ds.find(v)) { // i.e. v is not yet incorporated
                displayVertex(u);           // into the disjoint set with u
                displayVertex(v);
                System.out.print(" " + w);
                System.out.println(" ");
                ds.union(u, v);
            }
        }
    }

    // Shortest Path
    public void dijkstra(int source, int target) {
        final int INFINITY = Integer.MAX_VALUE;
        final int UNDEFINED = -999;
        dist = new int[adj.length];
        prev = new int[adj.length];
        // Dijkstra's algorithm
        MyLinkedList q = new MyLinkedList();
        for (int v = 0; v < adj.length; v++) {
            dist[v] = INFINITY;
            prev[v] = UNDEFINED;
            q.append(v);
        }
        dist[source] = 0;
        while (!q.isEmpty()) {
            int u = q.getUWithMinDist(dist);
            //q.delete(u);
            for (int v = 0; v < adj.length; v++) {
                if (adj[u][v] > 0) { // i.e. for each neighbour
                    int alt = dist[u] + adj[u][v];
                    if (alt < dist[v]) {
                        dist[v] = alt;
                        prev[v] = u;
                    }
                }
            }
        }
        // do the output using a stack to reverse the order of prev's contents
        System.out.print("Path: ");
        MyStack s = new MyStack(adj.length * adj.length);
        int v = target;
        while (prev[v] != UNDEFINED) {
            s.push(v);
            v = prev[v];
        }
        s.push(v);
        while (!s.isEmpty()) { // empty the stack to view the output
            System.out.print(s.pop() + ", ");
        }
        System.out.println(":\tdistance is " + dist[target]);
    }

    @Override
    public String toString() {
        String buffer = "\nAdjacency Matrix\n";
        for (int row = 0; row < adj.length; row++) {
            for (int column = 0; column < adj.length; column++) {
                buffer = buffer + adj[row][column] + ", ";
            }
            buffer = buffer + "\n";
        }
        buffer += "\nVertex List\n";
        for (int i = 0; i < vertexList.length; i++) {
            buffer = buffer + vertexList[i].getLabel() + ", ";
        }
        buffer = buffer + "\n";
        return buffer;
    }

}
