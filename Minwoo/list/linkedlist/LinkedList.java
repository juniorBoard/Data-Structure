package list.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(int index, Object input) {
        if (index == 0) {
            addFirst(input);
            return;
        }
        Node n = node(index - 1);
        Node newNode = new Node(input);
        newNode.next = n.next;
        n.next = newNode;
        size++;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void delete(int index) {
        Node deleted = null;
        if (index == 0) {
            deleted = head;
            head = head.next;
        } else {
            Node n = node(index - 1);
            deleted = n.next;
            n.next = deleted.next;
            if (n.next == null) {
                tail = n;
            }
        }
        deleted = null;
        size--;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        Node n = node(index);
        return n.data;
    }

    public int indexOf(Object object) {
        Node n = head;
        for (int i = 0; i < size; i++) {
            if (n.data == object) return i;
            n = n.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        StringBuilder str = new StringBuilder("[");
        while(temp != null) {
            str.append(temp.data);
            if (temp.next != null) str.append(", ");
            temp = temp.next;
        }

        return str.append("]").toString();
    }

    private Node node(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }
}
