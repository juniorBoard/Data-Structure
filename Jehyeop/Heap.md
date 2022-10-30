# Heap
- "우선순위 Queue"를 위해 만들어진 자료구조

## 우선순위 Queue
- 데이터들이 우선순위를 가지고 있다.
- 우선순위가 높은 데이터가 먼저 나감.
- 배열,연결리스트,힙으로 구현 가능
  - 힙이 가장 효율적(삽입,삭제 : O(logN))

### 활용 
- 시뮬레이션 시스템
- 작업 스케줄링
- 수치해석 계산

## Heap 특징
- 우선순위 개념 + Queue
- 이진트리의 일종 : 여러값 중 최대값,최소값을 빠르게 찾아내도록 만들어진 구조
- 반정렬 상태 
- HeapTree는 중복된 값 허용 (이진트리는 x)

### Heap 종류
1. 최대 힙 (max heap)  
   <img width="330" alt="최대힙" src="https://user-images.githubusercontent.com/90807141/198850870-73707238-0f17-4f2d-80ee-251985b006d8.png">
    - 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진트리
2. 최소 힙 (min heap)  
   <img width="330" alt="최소힙" src="https://user-images.githubusercontent.com/90807141/198850872-fb2e4f36-df88-4570-b506-184fb2aee308.png">
    - 부모 노드의 키 값이 자식 노드의 키 값보다 작거나 같은 완전 이진트리

### 구현 방법 이론
0. 부모 자식 노드
   - 부모 index = (자식 index) / 2
   - 왼쪽 자식 index = (부모 index) * 2
   - 오른쪽 자식 index = (부모 index) * 2 +1

1. 힙의 삽입  
   - 힙에 새로운 요소가 들어오면 일단 새로운 노드를 힙의 마지막 노드에 삽입
   - 새로운 노드를 부모 노드들과 교환 
   
   최대 힙 (max heap)
    - "부모 <= 자식" 조건으로 swap
      <img width="1562" alt="맥스힙 연산" src="https://user-images.githubusercontent.com/90807141/198851271-206e7d80-0c6d-48f8-ae14-2ee375a068e8.png">
    
   최소 힙 (min heap)
    - "부모 >= 자식" 조건으로 swap
      <img width="1562" alt="최소힙연산" src="https://user-images.githubusercontent.com/90807141/198851402-f6de7674-2d5d-4b09-a647-1b580d4ca7e1.png">

2. 힙의 삭제 
   - 최대 힙에서 최대값은 루트 노드이므로 루트 노드가 삭제됨 (최대 힙에서 삭제 연산은 최대값 요소를 삭제하는 것)
   - 삭제된 루트 노드에는 힙의 마지막 노드를 가져온다. 
   - 힙을 재구성 (연산 실행)
     <img width="1564" alt="힙의 삭제" src="https://user-images.githubusercontent.com/90807141/198851727-221a3df1-635f-4f54-b71d-1f642997cdc2.png">
   