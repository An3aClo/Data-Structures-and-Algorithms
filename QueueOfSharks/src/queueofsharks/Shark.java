package queueofsharks;

public class Shark {

    private String name, type;

    public Shark(String name, String type) {
        this.name = name;
        this.type = type;
    }

  

    public String getName() {
        return name;

    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Name: " + getName() + ", Type: " + getType();
    }
}
