package heap;

public class MinHeapTest {
    public static void main(String[] args) {
        MinHeapImpl minHeap = new MinHeapImpl();
        minHeap.add(5);
        minHeap.add(6);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(3);
        System.out.println(minHeap);
        System.out.printf("size : %d\n", minHeap.size());
        int poll = -1;
        poll = minHeap.poll();
        System.out.printf("poll : %d\n", poll);
        System.out.println(minHeap);
        System.out.printf("size : %d\n", minHeap.size());
        minHeap.add(1);
        System.out.println(minHeap);
    }
}
