package cptbinarysearchtree;

public class CPTBinarySearchTree {

    public static void main(String[] args) {
        
        MyBST myTree = new MyBST();
        
        myTree.insert(10);
        myTree.insert(7);
        myTree.insert(15);
        myTree.insert(5);
        myTree.insert(9);
        myTree.insert(20);
        
        System.out.println("In order: ");
        myTree.inorder();
        
        System.out.println();
        System.out.println("Post-Order");
        myTree.postorder();
        
        System.out.println();
        System.out.println("Pre-Order");
        myTree.preorder();
        System.out.println();
        myTree.delete(10);
        System.out.println("New Tree");
        myTree.inorder();
    }
    
}
