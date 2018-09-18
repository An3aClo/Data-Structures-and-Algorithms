package linkedlist;

public class MyListNode {

    private int key;
    private MyListNode next;

    public MyListNode() {
        key = 0;
        next = null;
    }

    public void setKey(int value) {
        key = value;
    }

    public int getKey() {
        return key;
    }

    public void setNext(MyListNode mln) {
        next = mln;
    }

    public MyListNode getNext() {
        return next;
    }
}
