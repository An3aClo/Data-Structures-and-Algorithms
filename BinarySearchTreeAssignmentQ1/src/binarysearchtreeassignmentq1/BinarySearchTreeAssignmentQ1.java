package binarysearchtreeassignmentq1;

public class BinarySearchTreeAssignmentQ1 {

    public static void main(String[] args) {
        MyTree mt = new MyTree();

        mt.insert(5);
        mt.insert(1);
        mt.insert(6);
        mt.insert(2);
        mt.insert(4);
        mt.insert(3);

        System.out.println("In order: ");
        mt.inorder();
    }

}
