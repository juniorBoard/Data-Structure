class BinarySearchTree {
    Node rootNode = null;


    public void insertNode(int value) {


        if (rootNode == null) {
            rootNode = new Node(value);
            }
		else {
            Node head = rootNode;
            Node currentNode;

            while (true) {
                currentNode = head;


                if (head.value > value) {
                    head = head.leftChild;

                    if (head == null) {
                        currentNode.leftChild = new Node(value);
                        break;
                    }
                } else {
                    head = head.rightChild;

                    if (head == null) {
                        currentNode.rightChild = new Node(value);
                        break;
                    }
                }
            }
        }
    }




    // 특정 노드 삭제
    public boolean removeNode(int value) {
        Node removeNode = rootNode;
        Node parentOfRemoveNode = null;

        while (removeNode.value != value) {
            parentOfRemoveNode = removeNode;

            if (removeNode.value > value) {
                removeNode = removeNode.leftChild;
            } else {
                removeNode = removeNode.rightChild;
            }

            if (removeNode == null)
                return false;
            }


        if (removeNode.leftChild == null && removeNode.rightChild == null) {


            if (removeNode == rootNode) {
                rootNode = null;
            }

            else if (removeNode == parentOfRemoveNode.rightChild) {
                parentOfRemoveNode.rightChild = null;

            } else {
                parentOfRemoveNode.leftChild = null;
            }
        }


		else if (removeNode.leftChild == null) {
			if (removeNode == rootNode) {
				rootNode = removeNode.rightChild;

			} else if (removeNode == parentOfRemoveNode.rightChild) {
				parentOfRemoveNode.rightChild = removeNode.rightChild;

			} else {
				parentOfRemoveNode.leftChild = removeNode.rightChild;
			}
		}


        else if (removeNode.rightChild == null) {

            if (removeNode == rootNode) {
				rootNode = removeNode.leftChild;

            } else if (removeNode == parentOfRemoveNode.rightChild) {
                parentOfRemoveNode.rightChild = removeNode.leftChild;

            } else {
                parentOfRemoveNode.leftChild = removeNode.leftChild;
            }
        }



        else {
            Node parentOfReplaceNode = removeNode;

            Node replaceNode = parentOfReplaceNode.rightChild;

            while (replaceNode.leftChild != null) {
                parentOfReplaceNode = replaceNode;
                replaceNode = replaceNode.leftChild;
            }

            if (replaceNode != removeNode.rightChild) {
                parentOfReplaceNode.leftChild = replaceNode.rightChild;

                replaceNode.rightChild = removeNode.rightChild;
            }

            if (removeNode == rootNode) {
                rootNode = replaceNode;
            } else if (removeNode == parentOfRemoveNode.rightChild) {
                parentOfRemoveNode.rightChild = replaceNode;
            } else {
                parentOfRemoveNode.leftChild = replaceNode;
            }
            replaceNode.leftChild = removeNode.leftChild;
        }

        return true;
    }



    //중위 순회
    public void inorderTree(Node root, int depth) {
        if (root != null) {
            inorderTree(root.leftChild, depth + 1);
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.value);
            inorderTree(root.rightChild, depth + 1);
        }
    }


    //후위 순회
    public void postorderTree(Node root, int depth) {
        if (root != null) {
            postorderTree(root.leftChild, depth + 1);
            postorderTree(root.rightChild, depth + 1);
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.value);
        }
    }

    // 전위 순회
    public void preorderTree(Node root, int depth) {
        if (root != null) {
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.value);
            preorderTree(root.leftChild, depth + 1);
            preorderTree(root.rightChild, depth + 1);
        }
    }
}
