/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackofdinosaurs;

/**
 *
 * @author andre
 */
public class Dinosaur {

    private String name, description;

    public Dinosaur(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "name:" + getName() + ", Description:" + getDescription();
    }
}
