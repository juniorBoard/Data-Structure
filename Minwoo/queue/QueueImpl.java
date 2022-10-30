package queue;

public class QueueImpl {
    private int size = 100;
    private int front = 0;
    private int rear = 0;
    private Object[] queue;

    public QueueImpl() {
        this.queue = new Object[size];
    }

    public QueueImpl(int size) {
        this.size = size;
        this.queue = new Object[size];
    }

    public boolean isFull() {
        return rear == size;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void enQueue(Object object) {
        if (isFull()) return;
        this.queue[rear++] = object;
    }

    public Object deQueue() {
        if (isEmpty()) return null;
        Object object =  this.queue[front];
        this.queue[front++] = null;
        return  object;
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
}
