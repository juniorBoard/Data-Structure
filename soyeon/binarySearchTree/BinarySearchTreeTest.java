public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insertNode(3);
        tree.insertNode(2);
        tree.insertNode(1);

        if (tree.removeNode(2)) {
            System.out.println("노드 삭제");
        }

        tree.inorderTree(tree.rootNode, 1);
        // tree.postorderTree(tree.rootNode, 0);
        //tree.preorderTree(tree.rootNode, 0);
    }
}
