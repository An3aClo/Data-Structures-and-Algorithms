package binarysearchtreeassignmentq1;

public class MyNode {

    private int key;
    private MyNode left;
    private MyNode right;

    public MyNode() {
        key = 0;
        left = null;
        right = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }
}

