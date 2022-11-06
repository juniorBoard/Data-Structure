class Node {
	int data;
	Node left;
	Node right;
}

class Tree {
	public Node root;

	public void setRoot(Node node) { // 루트 노드
		this.root = node;
	}

	public Node getRoot() {
		return root;
	}

	public Node createNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}

	// 중위 순회 Inorder = Left -> Root -> Right
	public void inOrder(Node node) {
		if(node != null) {
			inOrder(node.left); // left
			System.out.print(node.data + " → "); // 루트
			inOrder(node.right); // right
		}
	}

	// 전위순회 Preorder = Root -> Left -> Right
	public void preOrder(Node node) {
		if(node != null) {
			System.out.print(node.data + " → "); // root
			preOrder(node.left); // left
			preOrder(node.right); // right
		}
	}

	//후위순회 Postorder = Left -> Right -> Root
	public void postOrder(Node node) {
		if(node != null) {
			postOrder(node.left); // left
			postOrder(node.right); // right
			System.out.print(node.data + " → "); // root
		}
	}
}


public class Main {
	public static void main(String[] args) {
		Tree t = new Tree();

		Node n14 = t.createNode(null, 14, null);
		Node n13 = t.createNode(null, 13, null);
		Node n9 = t.createNode(null, 9, null);
		Node n8 = t.createNode(null, 8, null);
		Node n7 = t.createNode(n14, 7, null);
		Node n6 = t.createNode(null, 6, n13);
		Node n11 = t.createNode(null, 11, null);
		Node n10 = t.createNode(null, 10, null);
		Node n4 = t.createNode(n8, 4, n9);
		Node n5 = t.createNode(n10, 5, n11);
		Node n2 = t.createNode(n4, 2, n5);
		Node n3 = t.createNode(n6, 3, n7);
		Node n1 = t.createNode(n2, 1, n3);


		t.setRoot(n1); // 루트 노드

		System.out.println("전위 순회");
		t.preOrder(t.getRoot());
		System.out.println();

		System.out.println("중위 순회");
		t.inOrder(t.getRoot());
		System.out.println();

		System.out.println("후위 순회");
		t.postOrder(t.getRoot());
	}
}
