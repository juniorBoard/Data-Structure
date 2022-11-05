package BST;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(4);
        bst.insert(7);
        bst.insert(3);
        bst.insert(2);
        bst.delete(5);
        bst.preOrder();
    }
}
