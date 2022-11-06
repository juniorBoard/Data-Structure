# 힙

## 힙이란?

- 완전 이진 트리의 일종으로 우선순위 큐를 위하여 만들어진 자료구조
- 최댓값이나 최솟값을 빠르게 찾아낼수 있는 자료구조
- 반정렬 상태
- 힙 트리에서는 중복된 값을 허용.

## 구조와 동작원리

### 트리 & 이진트리

<img src="https://user-images.githubusercontent.com/77231274/198821233-ab91f254-4a83-4b4f-8519-37d781d1fae0.png" width="60%">

> **트리**

- Root : 부모가 없는 최상단 노드.
- Leaf : 자식이 없는 말단 노드.

> **이진 트리**

각 노드에 최대 두 개의 자식을 갖을 수 있는 트리

> **이진 탐색 트리**

모든 노드가 특정 순서를 따르는 속성이 있는 이진 트리

### Min Heap

부모 노드의 값이 자식 노드의 값보다 작거나 같은 이진 트리.

<img src="https://user-images.githubusercontent.com/77231274/198821297-b9ed277c-ba9e-449f-b2f7-28aae2308653.png" width="60%">

> **노드 추가 _O(logN)_**

1. 가장 마지막 위치에 노드 추가

    <img src="https://user-images.githubusercontent.com/77231274/198821331-00f3d2ef-4e29-4b66-bdb1-fb269863b933.png" width="60%">

2. 부모 노드와 비교하여 작은 노드가 상위 레벨에 있도록 swap (완전한 구조가 될때까지 반복)

    <img src="https://user-images.githubusercontent.com/77231274/198821460-0de52576-c1fc-42e3-a0a2-b83176abf0fb.png" width="60%">
    
    <img src="https://user-images.githubusercontent.com/77231274/198821481-8257d9d7-13ca-40fc-ba6a-060d05effa45.png" width="60%">
    

> **poll 최솟값 추출 (root 노드 추출) _O(logN)_**

1. 루트 노드 제거

    <img src="https://user-images.githubusercontent.com/77231274/198821573-90b2ba30-5255-4477-a734-42e8df694e70.png" width="60%">
    
2. 빈 루트 노드에 마지막 노드 이동

    <img src="https://user-images.githubusercontent.com/77231274/198821752-4e4b469a-c9f7-4e21-92f5-e8abde478316.png" width="60%">

    
3. 자식 노드 중 작은 노드와 swap (완전한 구조가 될때까지 반복)

    <img src="https://user-images.githubusercontent.com/77231274/198821766-a58a9b3d-ca61-48ad-bc87-8c6e5a9ada93.png" width="60%">

    <img src="https://user-images.githubusercontent.com/77231274/198821779-8f98ceb8-f2e5-44ad-a518-89f56f6d27f2.png" width="60%">

    
    > **배열 또는 리스트 등 선형자료구조로 표현**
    
    <img src="https://user-images.githubusercontent.com/77231274/198821801-1a3e0895-6674-426e-bee9-b8ffc1e6a1ab.png" width="60%">

    <img src="https://user-images.githubusercontent.com/77231274/198821806-80475ab1-70f8-4f3e-a7ca-5bbcd3a599dc.png" width="60%">

    > **부모 노드 인덱스와 자식 노드 인덱스 관계**
    
    <img src="https://user-images.githubusercontent.com/77231274/198821815-9658a3e2-269d-4d2e-9955-879225c70a8a.png" width="60%">
    
    <img src="https://user-images.githubusercontent.com/77231274/198821810-97644cac-8670-459c-a19a-582c89639c1e.png" width="30%">
    
    ```java
    int parentIdx = (child - 1) / 2;
    int childLeftIdx = 2 * parentIdx + 1;
    int childRightIdx = 2 * parentIdx + 2;
    ```
