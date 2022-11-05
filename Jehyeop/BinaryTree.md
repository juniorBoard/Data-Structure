# BinaryTree (이진트리)
- 이진트리는 **자식 노드의 갯수가 2개로 제한**된다.
- 조건.
  - 루트 노드를 중심으로 두 개의 서브 트리로 나뉜다.
  - 나뉜 두 서브 트리 모두 이진 트리여야 한다. 

## 이진 트리와 공집합 노드
<img width="600" alt="트리 공집합" src="https://user-images.githubusercontent.com/90807141/199784636-3e0c89ef-cea7-4404-8727-ebe297ee32ef.png">

- 이진트리 : 하나의 노드에 최대 2개의 노드만 추가 가능 
  - 규칙을 벗어나지 않기 위해 공집합 노드 개념이 추가된다.
- 공집합 노드(Empty set) : 공간은 존재하지만 유효한 데이터가 들어있지 않은 노드

## 이진 트리 속성
<img width="500" alt="이진트리 높이 레벨" src="https://user-images.githubusercontent.com/90807141/199879928-cfbb9005-ada4-425d-ba9b-ca3b68327705.png">

### 레벨과 높이
- 트리의 레벨은 최상단 부모 노드 인덱스를 0으로 시작
- 트리의 높이와 레벨의 최대값은 항상 같다.

### 완전 이진 트리 (Complete Binary Tree)
<img width="300" alt="완전이진트리" src="https://user-images.githubusercontent.com/90807141/199882058-0ce26674-a22b-47bb-af7f-a5f78164bbf5.png">

- 위에서 아래로, 좌에서 우로 채워진 이진 트리를 의미
- 마지막 레벨을 제외 하고 모든 레벨이 완전히 채워져 있다.
- 배열을 사용해 효율적으로 표현이 가능하다. 

### 전 이진트리 (Full Binary Tree)
<img width="300" alt="전 이진트리" src="https://user-images.githubusercontent.com/90807141/199882063-dcd205fe-a655-4dad-a1a1-87bad4b432fd.png">

- 모든 노드가 0개 또는 2개의 자식 노드를 갖는 트리

### 포화 이진 트리 (Perfect Binary Tree)
<img width="360" alt="포화이진트리" src="https://user-images.githubusercontent.com/90807141/199882066-faaa6843-4d93-4ea0-8359-8c3cca0d4954.png">

- 모든 레벨이 노드로 꽉치 있는 트리 
- 전 이진 트리의 성질도 만족
- 모든 레벨에 노드가 꽉차서 더이상 레벨이 유지된 상태에서 노드 추가가 불가능한 상태

> 포화 이진 트리는 완전 이진 트리가 될수 있지만,  
> 완전 이진 트리는 포화 이진 트리가 될 수 없다.

## 이진트리 순회
- 순회 기준은 루트 노드를 방문하는 기준에 있다.
- 각 이진 트리 접근 시 최 말단 이진 트리의 접근이 끝나야 상위 트리의 접근이 가능하다

### 1. 중위 순회 (in-order)
<img width="250" alt="중위순회" src="https://user-images.githubusercontent.com/90807141/199890353-dd7446bb-1205-4f6c-8ca1-a8be3cecfc12.png">

<br>

<img width="350" alt="중위순회 설명" src="https://user-images.githubusercontent.com/90807141/199922055-106865bc-6200-491b-8402-05d1ed6d4ac6.png">

- 왼쪽 서브트리 - 루트노드 - 오른쪽 서브트리


### 2. 후위 순회 (post-order)
<img width="250" alt="후위 순회" src="https://user-images.githubusercontent.com/90807141/199890361-84dd01c9-e46b-45a6-85ee-f00aa110386b.png">

<br>

<img width="350" alt="후위순회 설명" src="https://user-images.githubusercontent.com/90807141/199922089-276eb840-a07c-4871-82fd-c413dac1487c.png">

- 왼쪽 서브트리 - 오른쪽 서브트리 - 루트노드

### 3. 전위 순회 (pre-order)
<img width="250" alt="전위 순회" src="https://user-images.githubusercontent.com/90807141/199890365-b4e30d8d-d79d-4eb3-8a3d-239784183cff.png">

<br>

<img width="350" alt="전위순회 설명" src="https://user-images.githubusercontent.com/90807141/199922071-ce5f84ec-61e0-455f-af28-cda0c8a074a0.png">

- 루트노드 - 왼쪽 서브트리 - 오른쪽 서브트리

<br>

참고 블로그  [Seongkyun Han's blog](https://seongkyun.github.io/data_structure/2019/08/02/data_structure/)