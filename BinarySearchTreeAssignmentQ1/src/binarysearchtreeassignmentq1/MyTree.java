package binarysearchtreeassignmentq1;

public class MyTree {
    private MyNode tree;
    public MyTree() {
        tree = null;
    }
    public MyNode insert(MyNode tree, int value) {

        if (tree == null) {
            tree = new MyNode();
            tree.setKey(value);
            tree.setLeft(null);
            tree.setRight(null);
        } else if (value < tree.getKey()) {
            tree.setLeft(insert(tree.getLeft(), value));
        } else if (value > tree.getKey()) {
            tree.setRight(insert(tree.getRight(), value));
        }
        return tree;
    }
    public void inorder() {
        inorder(tree);
    }
    public void inorder(MyNode tree) {

        if (tree != null) {
            inorder(tree.getLeft());
            System.out.print(tree.getKey() + ", ");
            inorder(tree.getRight());
        }
    }
    public void insert(int i) {
        tree = insert(tree, i);
    }
}
