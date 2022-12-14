# Tree

<img src = https://user-images.githubusercontent.com/74857364/199453611-f8308794-d123-4a19-a406-75c6cbdca3a9.png width="50%">          

트리는 값을 가진 `노드(Node)`와 이 노드들을 연결해주는 `간선(Edge)`으로 이루어져있다.

그림 상 데이터 1을 가진 노드가 `루트(Root)` 노드다.

모든 노드들은 0개 이상의 `자식(Child)` 노드를 갖고 있으며 보통 부모-자식 관계로 부른다.

<br><br>

- `부모 노드(parent node)` : 자기 자신(노드)과 연결 된 노드 중 자신보다 높은 노드를 의미 (ex. `5`의 부모노드 : `2`)

- `자식 노드(child node)` : 자기 자신(노드)과 연결 된 노드 중 자신보다 낮은 노드를 의미 (ex. `3`의 자식노드 : `6`, `7`)

- `루트 노드 (root node)` : 일명 뿌리 노드라고 하며 루트 노드는 하나의 트리에선 하나밖에 존재하지 않고, 부모노드가 없다.              
    위에선 `1`이 뿌리노드다.

- `단말 노드(leaf node)` : 리프 노드라고도 불리며 자식 노드가 없는 노드를 의미한다. 위 이미지에서 `8`, `9`, `10`, `11`, `13`, `14` 노드가 단말노드다.

- `내부 노드(internal node)` : 단말 노드가 아닌 노드(루트 노드와 내부 노드 사이에 있는 노드)

- `형제 노드(sibling node)` : 부모가 같은 노드를 말한다. (ex. `4`, `5`는 모두 부모노드가 `2`이므로 `4`, `5`는 형제노드다.)

- `깊이(depth)` : 특정 노드에 도달하기 위해 거쳐가야 하는 '간선의 개수'를 의미 (ex. `5`의 깊이 : `1` → `2` → `5` 이므로 깊이는 2가 됨)

- `레벨(level)` : 특정 깊이에 있는 노드들의 집합을 말하며, 구현하는 사람에 따라 `0` 또는 `1`부터 시작한다.     
   → `1` 노드를 0 레벨이라 하고 `2`와 `3`의 노드 레벨을 1 레벨이라고 할 수도 있고 `1` 노드를 1레벨이라고 하면 `2`와 `3` 노드는 2레벨이 된다.         

- `차수(degree)` : 특정 노드가 하위(자식) 노드와 연결 된 개수 (ex. `4`의 차수 = 2 {`8`, `9`} )

- 높이 : 트리의 높이는 루트 노드부터 리프 노드까지 거리 중 가장 긴 거리를 의미하며 위의 트리 높이는 3이다.      

<br>

🐣 `V - 1 = E` : `간선 수 = 노드 수 - 1`

<br><br><br>

## 트리 순회 방식

### 전위 순회(pre-order)
각 루트(Root)를 순차적으로 먼저 방문하는 방식이다.                
(Root → 왼쪽 자식 → 오른쪽 자식)                          

<img src = https://user-images.githubusercontent.com/74857364/199453080-279f9bd7-097b-40d9-991f-5d228ef2c4c7.gif width="50%">

1 → 2 → 4 → 8 → 9 → 5 → 10 → 11 → 3 → 6 → 13 → 7 → 14

<br><br>

### 중위 순회(in-order)
왼쪽 하위 트리를 방문 후 루트(Root)를 방문하는 방식이다.                         
(왼쪽 자식 → Root → 오른쪽 자식)             

<img src = https://user-images.githubusercontent.com/74857364/199499853-8fad06fe-bc02-4cbb-b636-2aa676172a40.gif width="50%">       

8 → 4 → 9 → 2 → 10 → 5 → 11 → 1 → 6 → 13 → 3 →14 → 7

<br><br>

### 후위 순회(post-order)
왼쪽 하위 트리부터 하위를 모두 방문 후 루트(Root)를 방문하는 방식이다.       
(왼쪽 자식 → 오른쪽 자식 → Root)

<img src = https://user-images.githubusercontent.com/74857364/199560730-ead257a4-fe36-4278-86c3-f41475eeac50.gif width="50%">  

8 → 9 → 4 → 10 → 11 → 5 → 2 → 13 → 6 → 14 → 7 → 3 → 1

<br><br>


### 레벨 순회(level-order)
루트(Root)부터 계층 별로 방문하는 방식이다.

<img src = https://user-images.githubusercontent.com/74857364/199559536-7099077c-acd9-492f-a8f1-d6d28bae11d4.gif width="50%">

1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 13 → 14

<br><br><br>

출처                
[Tree](https://gyoogle.dev/blog/computer-science/data-structure/Tree.html)              
[자바 [JAVA] - Binary Search Tree (이진 탐색 트리) 구현하기](https://st-lab.tistory.com/300)            
