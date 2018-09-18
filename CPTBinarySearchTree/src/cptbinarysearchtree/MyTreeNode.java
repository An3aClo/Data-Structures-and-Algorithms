package cptbinarysearchtree;

public class MyTreeNode {
    
    private int key;
    private MyTreeNode left;
    private MyTreeNode right;
    
   public MyTreeNode(){
       key=0;
       left=null;
       right = null;
   }

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * @return the left
     */
    public MyTreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(MyTreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public MyTreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(MyTreeNode right) {
        this.right = right;
    }
   
   
    
}
