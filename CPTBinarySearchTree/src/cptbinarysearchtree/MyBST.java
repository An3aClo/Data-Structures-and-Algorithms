package cptbinarysearchtree;

public class MyBST {

    private MyTreeNode tree;

    public MyBST() {
        tree = null;
    }

    public void insert(int value) {
        tree = insert(tree, value);
    }

    public MyTreeNode insert(MyTreeNode tree, int value) {

        if (tree == null) {
            tree = new MyTreeNode();
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

    //overload inorder 
    public void inorder(MyTreeNode tree) {

        if (tree != null) {
            inorder(tree.getLeft());                    // L
            System.out.print(tree.getKey() + ", ");   //N
            inorder(tree.getRight());                   // R
        }
    }

    public void preorder() {
        preorder(tree);

    }

    public void preorder(MyTreeNode tree) {

        if (tree != null) {

            System.out.print(tree.getKey() + ", ");   //N
            preorder(tree.getLeft());                  //L
            preorder(tree.getRight());                 //R
        }
    }

    public void postorder() {
        postorder(tree);

    }

    public void postorder(MyTreeNode tree) {

        if (tree != null) {
            postorder(tree.getLeft());                  //L
            postorder(tree.getRight());                 //R
            System.out.print(tree.getKey() + ", ");   //N

        }
    }

    public void delete(int target) {
        //Find the ting you want to delete
        MyTreeNode p = tree;
        MyTreeNode r = null;
        while (p.getKey() != target) {
            r = p;//r is the parent that follow the child, p is the child that r follows r is the chaser
            if (target < p.getKey()) {
                p = p.getLeft();

            } else if (p.getKey() < target) {
                p = p.getRight();
            }
        }
        //check whether p is at a leaf

        if (p.getLeft() == null && p.getRight() == null) {
            if (r.getKey() > p.getKey()) {
                p.setLeft(null);
            } else {
                p.setRight(null);
            }
        }
        //send q to the position of the replacement
        MyTreeNode qc = p;
        MyTreeNode q = p.getLeft();
        //q = p.getLeft();
        while (q.getRight() != null) {
            qc = q;
            q = q.getRight();
        }
        //replace the value
        p.setKey(q.getKey());
        qc.setRight(q.getLeft());
       
    }
   

}
