# 선형자료구조
선형 자료 구조란 요소가 일렬로 나열되어 있는 자료 구조를 말한다.

<br>

**랜덤 접근과 순차적 접근**

- Random Access: 어떤 요소에 바로 접근하는 것                        
  <img src = https://user-images.githubusercontent.com/74857364/196882977-bc00b959-f4f8-4a16-be32-61751adb7070.png width="50%">             

<br>

- Sequential Access: 어떤 요소에 접근할 때, 처음부터 차례차례 접근하는 것                          
  <img src = https://user-images.githubusercontent.com/74857364/196880487-6913814e-e835-4215-a5f1-c468ad157052.png width="70%">      
  
<br><br><br>

## Array
- 같은 타입의 변수들로 이루어져있다.
- 크기가 정해져있다.
- 중복을 허용하고 순서(index)가 있다.
- index로 해당 원소에 접근이 가능하다.
- index만 알고 있으면 시간 복잡도 `O(1)`만에 해당 원소로 접근할 수 있다.
- *Random Access*가 가능하다.
- 원소를 **삽입**할 경우 새로운 원소를 추가하고 모든 원소들의 *index*를 1씩 shift 해줘야 하므로 시간복잡도 `O(n)`이 걸린다.
- 원소를 **삭제**할 경우 삭제한 원소보다 큰 *index*를 가진 원소들을 옮겨줘야(shift)하므로 시간 복잡도 `O(n)`이 걸린다.


<br><br><br>

## LinkedList
- 자료의 주소 값으로 노드를 이용해 서로 연결되어 있는 구조를 갖는다.
- 순차적 접근 방식
- 특정 위치에 있는 원소에 바로 접근이 불가능하다. (주소를 바로 알 수 없기 때문)
- 시간복잡도 → 삽입과 삭제 : `O(1)`,  탐색 : `O(n)`                        
  - 단, 어느 곳에 삽입하던지 삭제하던지 `O(n)`의 시간 복잡도를 갖고 있지만 중간 삽입 혹은 중간 삭제가 없다면 시간 복잡도 `O(1)`이 된다.              

<br><br>

### Array와 LinkedList 비교

배열은 상자를 순서대로 나열한 데이터 구조이며 몇 번째 상자인지만 알면 해당 상자의 요소를 끄집어낼 수 있다.

연결 리스트는 상자를 선으로 연결한 형태의 데이터 구조이며,                                 
상자안의 요소를 알기 위해서는 하나씩 상자 내부를 확인해봐야 한다는 점이 다르다.                         

<br>


- *Array* : 랜덤 접근이 가능하다. `O(1)`

- *Linked List* : 랜덤 접근이 불가능하다. 순차접근 방식 _ `O(n)`

<br><br>

#### 데이터 접근 속도

**Array**는 인덱스를 사용해 빠르게 원소에 접근할 수 있다.              

따라서 *Random Access*를 지원한다.                              

시간 복잡도 `O(1)`로 빠르게 찾을 수 있다.                         

<br>

**LinkedList**는 순차 접근 방식(*Sequential Access*)을 사용한다.              

특정 원소에 접근하기 위해서는 처음부터 원소에 도달할 때까지 순차적으로 검색하면서 찾는다.          

시간 복잡도 `O(N)`                                  

<br><br>
              
#### 데이터의 삽입 속도
🐣 배열에 공간이 많이 남아있고 맨 끝에 삽입한다면 삽입 속도 역시 O(1)에 가능하다.

<br>

**Array**(배열)의 경우 데이터를 중간이나 맨 앞에 삽입할 경우 그 이후의 데이터를 한 칸씩 미뤄야 하는 추가 과정과 시간이 소요된다.                     

데이터가 많을 경우 비효율적이다. 그렇기 때문에 *LinkedList*가 필요하게 되었다.                       

<br>

**LinkedList**는 어느 곳에 삽입하던지 O(N)의 시간 복잡도를 갖는다.                

  → 삽입할 위치를 찾고(`O(n)`) 삽입 연산을 진행하기 때문에 `O(n)`의 시간 복잡도를 갖는다.                

그럼에도 Array보다 빠른 성능을 보인다.        

🐣 만약, 중간 삽입이 없다면 O(1)의 시간복잡도를 갖는다.                      
                 
<br>

**Array**의 경우 데이터 삽입 시 모든 공간이 다 차버렸다면 새로운 메모리 공간을 할당받지만     

**LinkedList**는 추가할 때마다 동적으로 할당한다.

<br><br>

#### 데이터의 삭제 속도
**Array**는 데이터 삭제의 경우 그 위치의 데이터를 삭제 후, 전체적으로 Shift 해줘야 한다. (O(N))

**LinkedList**의 경우 삭제할 원소를 찾기 위해서 `O(N)`의 시간 복잡도를 갖고 삭제를 한다. 

결국 `O(N)`의 시간 복잡도를 갖는다. 하지만 Array 보다 빠르게 삭제 연산을 수행한다.

<br><br>

#### 메모리 할당
**Array**에서 메모리는 Array가 선언되자 마자 Compile time에 할당되어 진다. 

이것을 정적 메모리 할당이라고 한다.

Stack 영역에 메모리 할당이 이루어진다.

<br>

**LinkedList**에서 메모리는 새로운 node가 추가될 때 runtime에 할당되어 진다. 

이것은 동적 메모리 할당이라고 한다.

Heap 영역에 메모리 할당이 이루어진다.

<br><br>

#### size
Array의 size는 반드시 선언 시점에 지정되어있어야 한다.

LinkedList의 size는 다양할 수 있다. 

node들이 추가될 때 runtime 시점에서 LinkedList의 size가 커질 수 있기 때문이다.

<br><br>

따라서 데이터 추가와 삭제를 많이 하는 것은 연결 리스트, 탐색을 많이 하는 것은 배열로 하는 것이 좋다.

배열은 인덱스에 해당하는 원소를 빠르게 접근해야하거나 간단하게 데이터를 쌓고 싶을 때 사용한다.

<br>

- 삽입과 삭제가 빈번하다면 **LinkedList**를 사용하는 것이 더 좋다.
- 데이터의 접근하는 게 중요하다면 **Array**를 사용하는 것이 좋다.


<br><br><br>

## ArrayList

<br><br>

### LinkedList와 ArrayList 비교

*LinkedList*와 *ArrayList*는 모두 Java에서 제공하는 List 인터페이스를 구현한 Collection 구현체이다.      

하지만 인터페이스만 같을 뿐 내부적으로 동작하는 방식은 다르다. 

<br><br>

### ArrayList
ArrayList는 내부적으로 데이터를 배열에서 관리하며 데이터의 추가, 삭제를 위해                       

아래와 같이 임시 배열을 생성해 데이터를 복사 하는 방법을 사용 하고 있다.

![image](https://user-images.githubusercontent.com/74857364/196906098-c0684ddc-8b81-4af7-b492-fc52a9033620.png)


대량의 자료를 추가/삭제 하는 경우에는 그만큼 데이터의 복사가 많이 일어나게 되어 성능 저하를 일으킬 수 있다. 

반면 각 데이터는 인덱스를 가지고 있기 때문에 한번에 참조가 가능해 데이터의 **검색**에는 유리한 구현체이다.

<br><br>

### LinkedList

LinkedList는 데이터를 저장하는 각 노드가 이전 노드와 다음 노드의 상태만 알고 있다고 보면 된다.

![image](https://user-images.githubusercontent.com/74857364/196906263-29bbe102-d704-42b4-b864-7844e937c651.png)

ArrayList와 같이 데이터의 추가, 삭제시 불필요한 데이터의 복사가 없어 데이터의 **추가, 삭제**시에 유리한 반면 

데이터의 **검색**시에는 처음부터 노드를 순회해야 하기 때문에 성능상 불리하다.

<br><br>

### 데이터의 검색, 삽입, 삭제시 성능 비교

#### 검색

데이터 검색 시에는 ***ArrayList***는 *LinkedList*에 비해 굉장히 빠르다.                      

ArrayList는 인덱스 기반의 자료 구조이며 get(int index) 를 통해 `O(1)` 의 시간 복잡도를 가진다.  

그에 비해 ***LinkedList***는 검색 시 모든 요소를 탐색해야 하기 때문에 최악의 경우에는 `O(N)`의 시간 복잡도를 가진다.                      

<br><br>

#### 삽입, 삭제

***LinkedList***에서의 데이터의 삽입, 삭제 시에는 *ArrayList*와 비교해 굉장히 빠른데,         

LinkedList는 이전 노드와 다음 노드를 참조하는 상태만 변경하면 되기 때문이다.            

삽입, 삭제가 일어날 때 `O(1)`의 시작 복잡도를 가진다.                       

반면 ***ArrayList***의 경우 삽입, 삭제 이후 다른 데이터를 복사해야 하기 때문에 최악의 경우 `O(N)` 의 성능을 내게 된다.                      

<br><br>

**ArrayList에서의 삽입, 삭제 과정**

<img src = https://user-images.githubusercontent.com/74857364/196973051-606fca7e-38f9-45c8-8628-7fcde93676f3.png width="75%">        

<img src = https://user-images.githubusercontent.com/74857364/196973091-947e0e05-68c5-4b03-83bf-ce11f9b7c5b4.png width="75%">

<br><br>

**LinkedList에서의 삽입, 삭제 과정**

<img src = https://user-images.githubusercontent.com/74857364/196973122-0c8ca3ee-b5e9-49f4-9e7a-cfabed1b09e1.png width="75%">        

<img src = https://user-images.githubusercontent.com/74857364/196973142-1ef64493-52a3-440d-a694-dfd4a2b4da42.png width="75%">       



<br><br>

- **Array**	: 정적인 길이를 제공하는 배열                      
- **ArrayList**	: 동기화가 제공되지 않음. 데이터의 **검색에 유리**하며 추가, 삭제에는 성능을 고려해야 한다.          
- **LinkedList** : ArrayList 에 비해 데이터의 **추가, 삭제에 유리**하며 데이터 검색 시에는 성능을 고려해야 한다.          

<br><br><br>

출처                 
[Java의 LinkedList와 ArrayList에 대한 비교](https://www.holaxprogramming.com/2014/02/12/java-list-interface/)             
[[Data Structure] Array vs LinkedList](https://woovictory.github.io/2018/12/27/DataStructure-Diff-of-Array-LinkedList/)                   
[자료구조: Linked List 대 ArrayList](https://www.nextree.co.kr/p6506/)                 
