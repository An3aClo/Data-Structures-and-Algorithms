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
public class Vertex {

    private int label;
    private boolean wasVisited;

    public Vertex(int label) {
        this.label = label;
        wasVisited = false;
    }

    /**
     * @return the label
     */
    public int getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(int label) {
        this.label = label;
    }

    /**
     * @return the wasVisited
     */
    public boolean isWasVisited() {
        return wasVisited;
    }

    /**
     * @param wasVisited the wasVisited to set
     */
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

}
