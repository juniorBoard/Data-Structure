package Jehyeop.Prac.DataStructurePrac.src.main.java.LinkedList;

public class LinkedList{

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int input) { // 생성자
            data = input;
            next = null;
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

    public static void main(String[] args){

        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // 첫번째 노드에 두번째 노드 연결
        second.next = third; // 두번째 노드에 세번째 노드 연결

        System.out.println("1.LinkedList 생성");
        llist.printList();
        System.out.println("\nhead = "+llist.head.data);



        // 값 추가
        // List 첫번째 노드에 값 추가 (+head 변경)
        Node zero = new Node(0);
        zero.next = llist.head;
        llist.head = zero;

        System.out.println("2.노드 첫번째에 값 추가");
        llist.printList();
        System.out.println("\nhead = "+llist.head.data);


        // List 중간에 값 추가1 (index : 3)
        Node inNode = new Node(33);

        second.next = inNode; // 넣을 위치의 앞 노드
        inNode.next = third; // 넣의 위치의 뒤 노드
        System.out.println("3.노드 3번째에 값 추가1");
        llist.printList();


        // List 중간에 값 추가2 (index : 3)
        Node inNode2 = new Node(23);
        Node temp0 = llist.head;
        int index = 3;

        // 해당 노드로 이동
        while(--index != 0) {
            temp0 = temp0.next;
        }
        temp0.next = inNode2;
        inNode2.next = inNode;
        System.out.println("\n4.노드 3번째에 값 추가2");
        llist.printList();


        // last node 추가
        Node temp = llist.head;
        Node last = new Node(100);

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;

        System.out.println("\n5.노드 마지막에 값 추가");
        llist.printList();



        // 삭제
        Node temp2 = llist.head;
        int delete_index = 3;

        while (--delete_index != 0) {
            temp2 = temp2.next;
        }
        Node deleteNode = temp2.next;
        temp2.next = temp2.next.next;

        System.out.println("\n6.노드 삭제");
        llist.printList();
        System.out.println("\n삭제 노드 = " + deleteNode.data);


    }
}
