package heap;

import list.arraylist.ArrayList;

import java.util.List;

public class MinHeapImpl {
    private int[] heap = new int[100];

    private int size = 0;

    public void add(int o) {
        heap[size] = o;
        int nodeIdx = size;
        while(size > 0) {
            int parentIdx = getParentIdx(nodeIdx);
            if (heap[nodeIdx] < heap[parentIdx]) {
                swap(nodeIdx, parentIdx);
                nodeIdx = parentIdx;
                continue;
            }
            break;
        }
        size++;
    }

    public int poll() {
        int min = heap[0];
        heap[0] = heap[--size];
        int nodeIdx = 0;
        while(true) {
            int childLeftIdx = getChildLeftIdx(nodeIdx);
            int childRightIdx = getChildRightIdx(nodeIdx);
            int childIdx = (heap[childLeftIdx] <= heap[childRightIdx]) ? childLeftIdx : childRightIdx;
            if (heap[nodeIdx] > heap[childIdx]) {
                swap(nodeIdx, childIdx);
                nodeIdx = childIdx;
                continue;
            }
            break;
        }
        return min;
    }

    public int size() {
        return size;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private int getParentIdx(int childIdx) {
        return (childIdx - 1) / 2;
    }

    private int getChildLeftIdx(int parentIdx) {
        return 2 * parentIdx + 1;
    }

    private int getChildRightIdx(int parentIdx) {
        return 2 * parentIdx + 2;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += heap[i];
            if (i < size - 1) str += ", ";
        }
        return str + "]";
    }
}
