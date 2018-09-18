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
public class WG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 6;
        MyGraph gr = new MyGraph(n);
        gr.addVertex(0);
        gr.addVertex(1);
        gr.addVertex(2);
        gr.addVertex(3);
        gr.addVertex(4);
        gr.addVertex(5);
        
        // addEdge(u, v, weight)
        gr.addEdge(0, 1, 3);
        gr.addEdge(0, 2, 1);
        gr.addEdge(2, 3, 6);
        gr.addEdge(3, 4, 7);
        gr.addEdge(3, 5, 1);
        gr.addEdge(1, 2, 2);
        gr.addEdge(1, 3, 2);
        gr.addEdge(2, 4, 3);
        gr.addEdge(4, 5, 4);
        
        
        System.out.println(gr.toString());
        
        System.out.println("\nDepth First Search\n");
        gr.dfs();
        
        System.out.println("\nBreadth First Search\n");
        gr.bfs();
        
        
        System.out.println("\nMinimum Spanning Tree (Kruskal's algorithm)\n");
        gr.kruskal();
        
        System.out.println("\nShortest Path (Dijkstra's algorithm)\n");
        gr.dijkstra(0, 5);
    }
    
}
