package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplTest {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6); // ignore
        System.out.println(queue);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue()); // null
        System.out.println(queue);

        queue.enQueue(6);// 사이즈 초과
    }
}
