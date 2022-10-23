# 연결 리스트

연결 리스트는 데이터를 감싼 노드를 포인터로 연결해서 공간적인 효율성을 극대화 시킨 자료 구조다.

삽입과 삭제가 `O(1)`이 걸리며 탐색에는 `O(n)`이 걸린다.

<br><br><br>

## 구조
연결 리스트는 아래와 같이 노드와 포인터로 이루어져 있고 다음 노드와 연결되어 있다.

<img src = https://user-images.githubusercontent.com/74857364/196752267-a32b51c2-65cd-4667-8cf6-64a794aa3472.png width="55%">           

- 자료의 주소 값으로 노드를 이용해 서로 연결되어 있는 구조를 갖는다.
  - → 메모리를 연속적으로 사용하지 않는다.
            
- 순차적 접근방식이다. → 특정 원소에 접근하기 위해서 처음부터 검색하면서 찾는다. 
                                
- 동적으로 삽입, 삭제가 편하다.

- 원소를 삽입할 경우
  - 맨 앞 , 맨 뒤 삽입은 위치를 찾지 않아도 되서 시간 복잡도 O(1)이다.
  - 중간 삽입은 이전 노드와 다음 노드의 위치를 알고 있는 경우 시간 복잡도는 O(1)이다.
  - 하지만 탐색을 해야하는 경우 시간 복잡도 O(n)이다.
   
- 원소를 삭제할 경우
  - 삽입과 마찬가지로 맨 앞, 맨 뒤 삭제는 시간 복잡도 O(1)이다.
  - 중간 삭제는 시간 복잡도 O(n) 또는 O(1)이다. (삽입과 같음)
   
- 특정 위치에 있는 원소에 바로 접근이 불가능하다. (주소를 바로 알 수 없기 때문)
  - 원하는 원소를 찾기 위해서 최소 한 번은 리스트를 순회해야하기 때문에 시간 복잡도는 O(n)이다.
   
- 메모리는 새로운 노드가 추가될 때 (Runtime) Heap 영역에 할당한다.


<br><br><br>

## 종류

prev 포인터와 next 포인터로 앞과 뒤의 노드를 연결시킨 것이 연결 리스트이며         

연결 리스트는 `싱글 연결 리스트`, `이중 연결 리스트`, `원형 이중 연결 리스트`가 있다.      

<br>

*맨 앞에 있는 노드를 헤드(head)라고 한다.                  

- **싱글** 연결 리스트 : *next* 포인터만 가진다.                             
- **이중** 연결 리스트 : *next* 포인터와 *prev* 포인터를 가진다.
- **원형 이중** 연결 리스트 : 이중 연결 리스트와 같지만 마지막 노드의 *next* 포인터가 헤드 노드를 가리키는 것을 말한다.

<br><br><br>

### 싱글 연결 리스트(Singly Linked List)
**자료들이 링크로 서로 연결되어 있는 형태**

<img src = https://user-images.githubusercontent.com/74857364/196751267-af74923a-c845-4e9c-9bec-d235ce559021.png width="70%">       

- 단방향 링크
- 이전 노드에 접근하기 위해선 첫 번째 노드부터 다시 순회해야한다.
- 각 노드 당 한 개의 포인터가 있고 포인터는 다음 노드의 위치를 가르킨다.
- 테일은 가장 마지막이므로 다음을 가리키는 포인터를 갖지 않는다.


<br><br><br>

### 원형 연결 리스트(Circular Linked List)
**가장 마지막 자료가 가장 처음 자료와 연결되어 있는 형태**

단일 연결 리스트(Single Linked List)는 마지막 노드가 null을 가리킨다. 

이 마지막 노드가 첫 번째 노드를 가리키게 하면 원형 연결 리스트가 된다.        

🐣 단일 연결 리스트의 테일에 포인터가 추가된 형태로 테일의 포인터는 헤더를 가르켜 원형이 되도록 한다. 

![image](https://user-images.githubusercontent.com/74857364/196751291-1036a092-b769-4d40-a3a3-bdc37d851ae2.png)

- 단방향 링크
- 마지막 노드와 첫 번째 노드가 연결된 원형 구조
- 이전 노드에 접근하기 위해서 계속 한 방향으로만 순회하면 된다.

<br><br><br>

### 이중 연결 리스트(Doubly Linked List)
**앞 뒤 자료가 서로서로에게 양쪽으로 연결되어 있는 형태**

단일 연결 리스트는 포인터를 한 개 가지고 있어 다음 노드만 가리킬 수 있었다면             

이중 연결 리스트는 포인터를 두 개 가지고 있어 이전 노드와 다음 노드를 가리킨다.         

![image](https://user-images.githubusercontent.com/74857364/196751325-402b2865-8492-46c7-985a-4187c66ad9bd.png)

- 양방향 링크
- 각 노드가 앞 뒤로 연결된다.
- 이전 노드에 직접 접근(Direct Access) 가능하다.

<br>

이중 연결 리스트는 앞에서부터 요소를 넣는 `push_front()`, 뒤에서부터 요소를 넣는 `push_back`,               

중간에 요소를 넣는 `insert()` 등의 함수가 있다.

<br><br><br>

#### 특성 비교          
**이전 노드에 대한 접근 연산**                  
**싱글** 연결 리스트 : 이전노드를 접근할수 있는 방법이 없다. 무조건 가장 처음 노드부터 검색해야한다.           
**원형** 연결 리스트 : 계속 가다보면 나의 이전 노드의 값을 찾을 수 있다.              
**이중** 연결 리스트 : 이중으로 연결되어 있기 때문에 바로 이전 노드를 접근 할 수 있다.     

<br><br><br>

### 원형 이중 연결 리스트
이중 연결 리스트와 원형 연결 리스트의 특성을 합친 개념이다.

<br>

인접한 두개의 노드는 서로의 위치를 알고 있으며,                 

맨 마지막 노드는 맨 앞의 노드인 HEAD 노드와 인접하게 되어 서로의 위치를 알게 된다.       

따라서 원형의 형태를 띄게 된다.    


<img src = https://user-images.githubusercontent.com/74857364/196751343-8729ecea-f28e-4311-898f-d93358547db2.png width="70%">   

- HEAD에서 부터 시작해서 시계방향 또는 시계 반대방향으로 순환이 가능하다.        


<br><br><br>

## code
### 단일 연결 리스트 
데이터와 다른 노드를 가리킬 주소 데이터를 담을 객체가 필요하다. → 노드(*node*)

<img src = https://user-images.githubusercontent.com/74857364/196886282-6c3e0ee9-a076-47cd-990f-beafefae4de9.png width="30%">

사용자가 저장할 데이터는 data 변수에 담기고, reference 데이터(참조 데이터)는 다음에 연결할 노드를 가리키는 데이터가 담긴다.

위와같은 노드들이 여러개가 연결 되어있는 것을 연결 리스트, 즉 LinkedList라고 한다.

<br>

이렇게 연결된 노드들에서 '삽입'을 한다면 링크만 바꿔주면 되기 때문에 매우 편리하며,

반대로 '삭제'를 한다면 삭제 할 노드에 연결 된 이전노드에서 링크를 끊고 삭제할 노드의 다음 노드를 연결해주면 된다.

<br><br><br>

#### Node 구현
```java
class Node<E> {
 
	E data;
	Node<E> next;	// 다음 노드객체를 가리키는 래퍼런스 변수
 
	Node(E data) {
		this.data = data;
		this.next = null;
	}
}
```
next 가 앞서 그림에서 보여주었던 Reference 변수다. 

다음 노드를 가리키는 변수이며, '노드 자체'를 가리키기 때문에 타입 또한 `Node<E>`타입으로 지정해주어야 한다.

그리고 위 노드를 이용하기 위한 단일 연결리스트(Singly LinkedList)를 구현하면 된다.

<br><br><br>

#### List Interface
```java
public interface List<E> {

	boolean add(E value);

	void add(int index, E value);

	E remove(int index);

	boolean remove(Object value);

	E get(int index);

	void set(int index, E value);

	boolean contains(Object value);

	int indexOf(Object value);

	int size();

	boolean isEmpty();

	public void clear();
 
}
```
1. `boolean add(E value);`
    - 리스트에 요소를 추가한다.
    - @param value 리스트에 추가할 요소
    - @return 리스트에서 중복을 허용하지 않을 경우에 리스트에 이미 중복되는     
      요소가 있을 경우 {@code false}를 반환하고, 중복되는 원소가 없을경우 {@code true}를 반환

2. `void add(int index, E value);`
    - 리스트에 요소를 특정 위치에 추가한다. 
    - 특정 위치 및 이후의 요소들은 한 칸씩 뒤로 밀린다.
    - @param index 리스트에 요소를 추가할 특정 위치 변수
    - @param value 리스트에 추가할 요소


3. `E remove(int index);`
    -  리스트의 index 위치에 있는 요소를 삭제한다.
    -  @param index 리스트에서 삭제 할 위치 변수
    -  @return 삭제된 요소를 반환

4. `boolean remove(Object value);`
    - 리스트에서 특정 요소를 삭제합니다. 동일한 요소가 여러 개일 경우 가장 처음 발견한 요소만 삭제된다.
    - @param value 리스트에서 삭제할 요소
    - @return 리스트에 삭제할 요소가 없거나 삭제에 실패할 경우 {@code false}를 반환하고 삭제에 성공할 경우 {@code true}를 반환 

5. `E get(int index);`

    - 리스트에 있는 특정 위치의 요소를 반환한다.
    - @param index 리스트에 접근할 위치 변수 
    - @return 리스트의 index 위치에 있는 요소 반환 

6. `void set(int index, E value);`
    - 리스트에서 특정 위치에 있는 요소를 새 요소로 대체한다.
    - @param index 리스트에 접근할 위치 변수 
    - @param value 새로 대체할 요소 변수 

7. `boolean contains(Object value);`
    - 리스트에 특정 요소가 리스트에 있는지 여부를 확인한다.
    - @param value 리스트에서 찾을 특정 요소 변수 
    - @return 리스트에 특정 요소가 존재할 경우 {@code true}, 존재하지 않을 경우 {@code false}를 반환  

8. `int indexOf(Object value);`
    - 리스트에 특정 요소가 몇 번째 위치에 있는지를 반환한다.
    - @param value 리스트에서 위치를 찾을 요소 변수  
    - @return 리스트에서 처음으로 요소와 일치하는 위치를 반환, 만약 일치하는 요소가 없을경우 -1 을 반환  



<br><br><br>

#### SingleLinked 클래스
List 인터페이스를 implements 해준다.

```java
public class SingleLinked<E> implements List<E> {
	private Node<E> head;	// 노드의 첫 부분
	private Node<E> tail;	// 노드의 마지막 부분
	private int size;	// 요소 개수

	// 생성자
	public SingleLinked() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
}
```
- Node<E> head : 리스트의 가장 첫 노드를 가리키는 변수다.

- Node<E> tail : 리스트의 가장 마지막 노드를 가리키는 변수다.

- size : 리스트에 있는 요소의 개수(=연결 된 노드의 개수)

<br>
	
처음 단일 연결리스트를 생성 할 때에는 아무런 데이터가 없으므로  
	
head와 tail이 가리킬 노드가 없기에 null로 초기화 및 size는 0으로 초기화해준다.

<br><br><br>

#### search 메소드 구현
단일 연결리스트이다보니 특정 위치의 데이터를 삽입, 삭제, 검색하기 위해서는 

처음 노드(head)부터 next변수를 통해 특정 위치까지 찾아가야 하기 때문에 `search()` 메소드를 작성한다.
	
```java
// 특정 위치의 노드를 반환하는 메소드
private Node<E> search(int index) {
		
	// 범위 밖(잘못된 위치)일 경우 예외 던지기 
	if(index < 0 || index >= size) {
		throw new IndexOutOfBoundsException();
	}
		
	Node<E> x = head;	// head가 기리키는 노드부터 시작 
		
	for (int i = 0; i < index; i++) {
		x = x.next;	// x노드의 다음 노드를 x에 저장한다
	}
	return x;
}
```

<br><br><br>

#### add 메소드 구현
- 가장 앞부분에 추가 - addFirst(E value)

- 가장 마지막 부분에 추가 (기본값) - addLast(E value)

- 특정 위치에 추가 - add(int index, E value)

```java
public void addFirst(E value) {
 
	Node<E> newNode = new Node<E>(value);	// 새 노드 생성
	newNode.next = head;	// 새 노드의 다음 노드로 head 노드를 연결
	head = newNode;	// head가 가리키는 노드를 새 노드로 변경
	size++;
 
	/**
	 * 다음에 가리킬 노드가 없는 경우(=데이터가 새 노드밖에 없는 경우)
	 * 데이터가 한 개(새 노드)밖에 없으므로 새 노드는 처음 시작노드이자
	 * 마지막 노드다. 즉 tail = head 다.
	 */
	if (head.next == null) {
		tail = head;
	}
}
```


<br><br><br>

출처             
[원형 연결 리스트(circular linked list), 이중 연결 리스트(double linked list)](https://codingsalon.tistory.com/m/44)             
[[자료구조] Array VS LinkedList](https://hee96-story.tistory.com/46)                    
[[자료구조] 연결 리스트의 종류](https://skytitan.tistory.com/45)                    
[[Data Structure] 연결리스트에 대해 알아보자(Linked List)](https://fomaios.tistory.com/entry/DataStructure-%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%EC%97%90-%EB%8C%80%ED%95%B4-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90Linked-List)         
[원형 연결리스트, 이중 연결리스트, 이중 원형 연결리스트 - 자료구조 기초](https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kiminhovator&logNo=220335487935)                  
[[자료구조] 연결리스트의 종류와 특성](https://chaezzing-fly-dev.tistory.com/16)              
[자바 [JAVA] - Singly LinkedList (단일 연결리스트) 구현하기](https://st-lab.tistory.com/167)
