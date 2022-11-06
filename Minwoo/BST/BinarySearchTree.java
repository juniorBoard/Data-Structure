package BST;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    class Node {
        Integer data;
        Node childLeft;
        Node childRight;

        Node(Integer date) {
            this.data = date;
        }
    }

    public Node search(Node root, int key) {
        if (root == null || root.data == key) return root;
        if (root.data > key) return search(root.childLeft, key);
        return search(root.childRight, key);
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {
         /*
         root가 null이면 그 자리에 노드 생성.
         부모보다 작으면 왼쪽 자식에
         부모보다 크면 오른쪽 자식에
         */
        if (root == null) { // 비어있으면 그 자리에 노드를 생성해서 추가.
            root = new Node(data);
            return root;
        }
        if (data < root.data) { // 노드보다 작으면
            root.childLeft = insert(root.childLeft, data); // 왼쪽 자식으로 추가.
            // 왼쪽 자식이 null이면 그 자리에 노드를 추가할 것.
            // null이 아니면 null 일때까지 재귀.
        } else if (data > root.data) {
            root.childRight = insert(root.childRight, data);
        }
        return root;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {
        if (root == null) return root;
        if (data < root.data) {
            root.childLeft = delete(root.childLeft, data);
        } else if (data > root.data) {
            root.childRight = delete(root.childRight, data);
        } else {
            if (root.childLeft == null && root.childRight == null) return null;
            else if (root.childLeft == null) return root.childRight;
            else if (root.childRight == null) return root.childLeft;

            root.data = findMin(root.childRight);
            root.childRight = delete(root.childRight, root.data);
        }
        return root;
    }

    int findMin(Node root) {
        int min = root.data;
        while (root != null) {
            min = root.childLeft.data;
            root = root.childLeft;
        }
        return min;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node current) {
        if (current != null) {
            System.out.println(current.data);
            preOrder(current.childLeft);
            preOrder(current.childRight);
        }
    }
}
