package stackofdogs;

public class Dogs {

    private String name;
    private String type;

    public Dogs(String n, String t) {
        n = name;
        t = type;
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
