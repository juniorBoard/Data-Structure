# Tree
- 비선형 자료구조를 다루는 첫번째 자료구조
- Data 를 표현하는 개념으로 접근 (data 표현 > data 저장)

## 트리의 특징
- 트리에는 사이클이 존재할 수 없다.
- 모든 노드는 자료형으로 표현이 가능하다.
- 루트에서 한 노드로 가는 경로는 유일한 경로 뿐이다.
- 노드의 개수가 N개면, 간선은 N-1개를 가진다.

## 트리를 정의하는 구조체 특징
- 직접적으로 노드를 control 하는 함수를 정의 
- 트리 자체를 만드는 도구를 정의하게 된다. 
  - data의 저장이 아닌 직접 노드 자체를 연결/끊는 여러 도구들을 만든다.

## 트리의 접근과 이해
- 트리는 계층적 관계를 표현하는 자료구조 이다.
  - 하나의 중심점을 기점으로 뻗어나가는 구조
- 트리를 만드는 도구를 먼저 정의하는 이유
  - 트리로 표현 가능한 많은 형태의 data들을 모두 표현하도록 기반작업을 하는 것.

## 트리 관련 용어
<img width="400" alt="tree 구조" src="https://user-images.githubusercontent.com/90807141/199628935-1fb9817f-d5d1-4036-b83b-312ba0a2f3f6.png">

- 노드 (node) : 트리의 구성요소 
- 간선 (edge) : 노드와 노드를 연결하는 연결선
- 루트 노드 (root node) : 트리 구조에서 최상위에 존재하는 노드
- 단말 노드 (terminal node) : 아래로 또는 다른 노드가 연결되어 있지 않은 노드
- 내부 노드 (internal node) : 단말 노드를 제외한 모든 노드

## 트리의 노드간 관계 
- 계층적으로 해석되며 노드간의 관계는 상대적이다.   
  <img width="450" alt="트리 노드관계" src="https://user-images.githubusercontent.com/90807141/199712324-73852147-9d3f-41dc-a706-e551e55d7ba1.png">

## 서브 트리
  <img width="480" alt="subtree" src="https://user-images.githubusercontent.com/90807141/199714975-d78a3bb2-3411-4321-8acf-3056606ad804.png">

- 서브 트리는 서브 트리로 구성된 재귀적인 구조를 가진다.
  - 자신을 부모 노드로 하는 또 다른 자식 노드들을 가짐
- 자식노드의 갯수 제한이 없다.

<br>

참고 블로그  [Seongkyun Han's blog](https://seongkyun.github.io/data_structure/2019/06/05/data_structure/)