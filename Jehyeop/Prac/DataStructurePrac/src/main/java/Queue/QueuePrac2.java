package Jehyeop.Prac.DataStructurePrac.src.main.java.Queue;

public class QueuePrac2 {
    int MAX = 3;
    int front;
    int rear;
    int [] queue;
    public QueuePrac2() {
        front = rear = 0; // 초기값 0
        queue = new int[MAX]; // 배열 생성
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == MAX;
    }

    public int size() {
        return front-rear;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        queue[rear++] = value; // rear가 위치한 곳에 값을 넣어주고 rear를 증가시킨다.
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front++];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = front; i < rear; i++) {
            sb.append(queue[i]);
            if (i < rear - 1) sb.append(", ");
        }
        return sb + "]";
    }
    public static void main(String[] args) {
        QueuePrac2 queue = new QueuePrac2();
        for(int i=0; i<3; i++){
            queue.push(i);
        }
        System.out.println(queue);
        System.out.println(queue.isFull());
        queue.pop();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        queue.pop();
        queue.pop();
        System.out.println(queue.isEmpty());
    }
}
