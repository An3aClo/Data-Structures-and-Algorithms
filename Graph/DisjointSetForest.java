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
public class DisjointSetForest {
    private int[] parents;
    
    public DisjointSetForest(int capacity) {
        parents = new int[capacity];
        for(int i = 0; i < capacity; i++)
            makeSet(i);
    }
    
    public void makeSet(int i) {
        parents[i] = -1;
    }
    
    public boolean isRoot(int i) {
        return parents[i] == -1;
    }
    
    protected int find(int i) {
        while (!isRoot(i))
            i = parents[i];
        return i;
    }
    
    public boolean inSameSet(int i, int j) {
        return find(i) == find(j);
    }
    
    public void union(int i, int j) {
        // works just fine with this implementation
        parents[find(i)] = find(j);
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < parents.length; i++)
            str = str + parents[i] + " ";
        return str;
    }
}