package Jehyeop.Prac.DataStructurePrac.src.main.java.Heap;

import java.util.ArrayList;

public class MaxHeap {
    private final ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
        heap.add(0); // 첫번째 인덱스는 사용하지 않음
    }

    // 삽입
    public void insert(int val) {
        // 맨 마지막 위치에 삽입
        heap.add(val);

        // 새로 넣은 노드의 인덱스 위치 정보
        int data = heap.size()-1;

        // 루트까지 이동, 자식이 더 크면 교환
        while(data > 1 && heap.get(data) > heap.get(data/2)) {
            // 부모랑 자식 swap
            heap.set(data/2, heap.get(data));
            heap.set(data, heap.get(data/2));

            data /= 2;
        }
    }

    // 삭제
    public int delete() {
        // heap 이 비어있으면 0리턴
        if(heap.size()-1 < 1) {
            return 0;
        }

        // 삭제할 루트 노드 값 저장
        int deleteItem = heap.get(1);

        // 삭제된 노드에 마지막 노드 가져오기 , 마지막 노드 삭제
        heap.set(1,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        // 루트에 새로 넣은 노드의 인덱스 정보
        int pos = 1;
        while((pos*2)<heap.size()) {

            int max = heap.get(pos*2); // 왼쪽 자식
            int maxPos = pos*2;

            // 오른쪽 자식이 존재하고 오른쪽 자식이 왼쪽 자식보다 클때 바꿀 자식 오른쪽으로 설정
            if((pos*2 +1)<heap.size() && max < heap.get(pos*2 +1)) {
                max = heap.get(pos*2+1);
                maxPos = pos*2+1;
            }

            // 부모가 더 크면 끝
            if(heap.get(pos) > max){
                break;
            }

            // 자식이 더 크면 교환
            int tmp = heap.get(pos);
            heap.set(pos, max);
            heap.set(maxPos, tmp);
            pos = maxPos;
        }
        return deleteItem;
    }
}
