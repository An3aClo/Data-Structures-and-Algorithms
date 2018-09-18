/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wg;

import java.util.Arrays;

/**
 *
 * @author MakhuraneT
 */
public class EdgeArray {
    private Edge[] edge;
    
    public EdgeArray(int size) {
        edge = new Edge[size];
    }

    /**
     * @return the edge
     */
    public Edge[] getEdge() {
        return edge;
    }

    public void sort() {
        Arrays.sort(edge);
    }
    /**
     * @param edge the edge to set
     */
    public void setEdge(Edge[] edge) {
        this.edge = edge;
    }
    
    
    
}
