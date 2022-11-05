# BinarySearchTree
- 이진탐색(binary search) + 연결리스트(linked list)
  - 이진탐색 : 탐색 시간복잡도 O(logN), but 삽입,삭제 불가.
  - 연결리스트 :  삽입/삭제 시간복잡도 O(1), but 탐색 시간복잡도 O(N)
  - 두 가지의 장점을 활요하려는 자료구조 
- 효율적인 탐색 능력을 유지하면서도, 자료 입력과 삭제를 가능하게 고안.

## 이진탐색트리 속성 
<img width="400" alt="이중탐색트리" src="https://user-images.githubusercontent.com/90807141/200105703-6c6535d2-91f5-4272-9dbf-0ac127628e97.png">

- 각 노드의 왼쪽 서브트리는 해당 노드의 값보다 작은값을 지닌 노드들로 이루어져 있다.
- 각 노드의 오른쪽 서브트리는 해당 노드의 값보다 큰값을 지닌 노드들로 이루어져 있다.
- 중복된 노드가 없어야 한다.
- 왼쪽 서브트리, 오른쪽 서브트리 둘다 이진탐색트리이다.
- 이진 탐색 트리를 순회할 때는 중위 순회 방식으로 한다. 

## 이진탐색트리 연산
- 검색(retrieve), 삽입(insert), 삭제(delete)
- 이진탐색트리 생성(create), 이진탐색트리 삭제(destroy), 비어있는지 확인(isEmpty), 트리순회(tree traverse)등등

### retrieve/find
<img width="400" alt="이중탐색트리 검색" src="https://user-images.githubusercontent.com/90807141/200124005-c76b4063-3157-442e-9742-223d768790ba.png">

- 20을 탐색 한다는 가정.
- 20은 22보다 작다 = 오른쪽 서브트리는 필요없다.
- 15보다 크다 = 15의 왼쪽 서브트리가 필요없다.
- 18보다 크다 = 18의 잎새노드를 확인.
- 20을 탐색 할동안 비교하는 값 : 22,15,18
- 계산 복잡성 : O(h) ( h = 루트노드에서 잎새노드까지 이르는 엣지의 수 최대값 )

### insert
<img width="400" alt="이진탐색트리 추가" src="https://user-images.githubusercontent.com/90807141/200124233-5653815e-e0bf-4e0e-b9ae-e95b2b0982fe.png">

- 14를 추가 한다는 가정
- 15와 7사이에 추가해도 이진탐색트리의 속성이 깨지지 않음을 확인할 수 있다. 
- 하지만 이진탐색 트리가 커질 경우 중간에 새 데이터를 넣는것은 위험하다.
- 그래서 삽입은 반듯이 잎새 노드에서 이루어져야 한다.

### delete

#### 1. 자식 노드가 없는 경우
   - 바로 삭제 해주면 된다.
#### 2. 자식 노드가 하나 있는 경우  
   <img width="400" alt="이진탐색트리 삭제 수정" src="https://user-images.githubusercontent.com/90807141/200135988-46d93fc6-f64a-4e98-8834-d52b945bca3a.png">
   <img width="400" alt="이진탐색트리 삭제1-2" src="https://user-images.githubusercontent.com/90807141/200128345-ae635dc7-e0ff-4afe-8bbe-1e1fdc13dff8.png">

   - 해당 노드를 지운다.
   - 해당 노드의 자식노드와 부모 노드를 연결해 준다.

#### 3. 자식 노드가 두개 있는 경우  
   <img width="400" alt="이진탐색트리 삭제 2" src="https://user-images.githubusercontent.com/90807141/200136215-b83fa979-00c1-472f-9904-b5ce598664d2.png">
   <img width="400" alt="이진탐색트리 삭제 2-2" src="https://user-images.githubusercontent.com/90807141/200136219-9bd06d97-fe74-4394-96a9-947560c7f994.png">

   - 45를 지운다는 가정 
   - 트리의 각 요소를 중위순회 방식으로 읽는다.  
     5,7,10,15,18,20,22,36,45,47,48,55,60
   - 45를 지운다.  
     5,7,10,15,18,20,22,36,47,48,55,60
   
<br>

참고 블로그  [ratsgo's blog](https://ratsgo.github.io/data%20structure&algorithm/2017/10/22/bst/)