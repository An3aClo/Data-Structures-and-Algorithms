package disjointsetclass;

public class vertex {

    public char label; //label (e.g. ‘A’)
    public boolean wasVisited;

    public vertex(char lab) //constructor
    {
        label = lab;
        wasVisited = false;
    }
}
