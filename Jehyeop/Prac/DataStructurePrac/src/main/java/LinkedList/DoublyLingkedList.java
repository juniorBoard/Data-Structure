package Jehyeop.Prac.DataStructurePrac.src.main.java.LinkedList;

public class DoublyLingkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int input) { // 생성자
            data = input;
            next = null;
            prev = null;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input);
        newNode.next = head;

        if(head != null) {
            head.prev = newNode;
        }

        head = newNode;
        size++;

        if(head.next == null){
            tail = head;
        }
    }

    public void addLast(int input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }

    }
}
