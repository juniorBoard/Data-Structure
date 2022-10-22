package list.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.addLast(50);
        numbers.add(1, 5);
        System.out.println(numbers);
        System.out.printf("numbers size : %d\n", numbers.size());
        System.out.printf("numbers get(0) : %s\n", numbers.get(0));
        numbers.delete(0);
        System.out.println(numbers);
        System.out.printf("numbers get(2) : %s\n", numbers.get(2));
        numbers.delete(2);
        System.out.println(numbers);
        numbers.delete(3);
        System.out.println(numbers);
        System.out.printf("numbers size : %d\n", numbers.size());
        System.out.printf("numbers head : %s\n", numbers.head);
        System.out.printf("numbers tail : %s\n", numbers.tail);
        System.out.printf("numbers indexOf(40) : %d\n", numbers.indexOf(40));
    }
}
