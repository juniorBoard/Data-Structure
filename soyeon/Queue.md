# 큐(Queue)

큐는 먼저 집어 넣은 데이터가 먼저 나오는 성질(**FIFO**, First In First Out)을 지닌 자료 구조이며, 

나중에 집어 넣은 데이터가 먼저 나오는 스택과 반대되는 개념을 가졌다.

삽입 및 삭제에 `O(1)`, 탐색에 `O(n)`이 걸린다.

![image](https://user-images.githubusercontent.com/74857364/198228887-d9e26486-d743-4395-b36b-94d680dd8a4f.png)


**Enqueue :** 큐 맨 뒤에 데이터 추가

**Dequeue :** 큐 맨 앞쪽의 데이터 삭제

<br><br><br>

## 특징

큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행한다.

다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행한다.

<br>

큐의 가장 첫 원소를 front, 끝 원소를 rear라고 부른다.

큐는 **들어올 때 rear로 들어오지만, 나올 때는 front부터 빠지는 특성**을 가진다.

접근방법은 가장 첫 원소와 끝 원소로만 가능하다.

<br>

Java Collection에서 Queue는 인터페이스다.

큐를 구현하는 클래스는 크게 PriorityQueue(우선순위 큐), ArrayDeque(배열 양방향 큐), LinkedList(연결리스트) 3가지가 있다.

<br><br>

### 사용

버퍼, 마구 입력된 것을 처리하지 못하고 있는 상황, BFS(너비 우선 탐색)

<br><br><br>

## Queue 선언

```java
Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
Queue<String> queue = new LinkedList<>(); //String형 queue 선언, linkedlist 이용
```

자바에서 큐는 LinkedList를 활용하여 생성해야한다.

(가장 대중적이고, 배열로 구현하는 큐에 비해 쉬운편)

<br><br>

### Queue Interface에 선언 할 메소드

- 추가(enqueue) : `Queue명.offer(값);`
- 추가(enqueue) : `Queue명.add(값)`             
  큐가 꽉 차서 추가할 수 없는 경우에는 에러가 출력
  
- 삭제(dequeue) : `Queue명.remove()`
- 삭제(dequeue) : `Queue명.poll();`                
   값을 반환하고 제거. 큐가 비어있으면 null을 반환

- 검사 : `Queue명.peek()`
- 검사 : `Queue명.element()`                  
  다음에 출력될 값을 확인                    
  Queue에서 다 뽑아내거나 Queue가 비어있으면 에러가 출력

<br>

```java
Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언
    queue.offer(1);     // queue에 값 1 추가
    queue.offer(2);     // queue에 값 2 추가
    queue.offer(3);     // queue에 값 3 추가
    queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
    queue.remove();     // queue에 첫번째 값 제거
    queue.clear();      // queue 초기화
```

<br>

```java
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            queue.offer(i);
        }
        
        while(!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println(element);
        }
    }
}
```

1 2 3 4 5 6 7 8 9 10 순서대로 출력된다.

<br><br><br>

## 종류

### Linear Queue : 선형 큐
기본적인 Queue 형태로 막대 모양이다. 주로 배열을 사용하여 구현한다. 

![image](https://user-images.githubusercontent.com/74857364/198268860-5bdf6854-c735-4545-aadf-930cd283802f.png)


dequeue 하여 생겨난 공간을 사용하기 위해서는 큐에 저장된 데이터를 재 정렬하는 과정을 거쳐야 하는 단점이 존재한다.

위와 같은 단점을 극복하기 위하여 배열이 아닌 링크드 리스트로 구현하거나 원형 큐를 사용한다.

<br>

rear 값이 큐의 크기이면 큐가 꽉 찼다고 판단하게 된다.

front과 rear가 같은 값이면 스택이 비어있다고 판단하게 된다.

<br><br><br>

#### Code

- 데이터 넣음 : `enQueue()`
- 데이터 뺌 : `deQueue()`
- 비어있는 지 확인 : `isEmpty()`
- 꽉차있는 지 확인 : `isFull()`

<br>

데이터를 넣고 뺄 때 해당 값의 위치를 기억해야 한다. (스택에서 스택 포인터와 같은 역할_기본 값 : -1)

이 위치를 기억하고 있는 게 front와 rear다.             
- front : deQueue 할 위치 기억
- rear : enQueue 할 위치 기억

<br>

삽입 시 rear를 증가시키고 삭제시 front를 감소시킨다.

- front는 큐의 삭제가 발생하는 지점을 가리킨다.
- rear는 큐의 삽입이 발생하는 지점을 가리킨다.

<br><br>

**기본 값**

```java
private int size = 0; 
private int rear = -1; 
private int front = -1;

Queue(int size) { 
    this.size = size;
    this.queue = new Object[size];
}
```
<br><br><br>

**enQueue**

```java
public void enQueue(Object o) {
    
    if(isFull()) {
        return;
    }
    
    queue[++rear] = o;
}
```

큐에 요소를 추가한다. rear + 1을 하고 그 자리에 요소를 추가한다.

enQueue 시, 가득 찼다면 꽉 차 있는 상태에서 enQueue를 했기 때문에 overflow

🐣 overflow : 메모리에 표현 범위를 초과하는 수의 값을 저장할 때 발생

<br><br><br>

**deQueue**

```java
public Object deQueue(Object o) {
    
    if(isEmpty()) { 
        return null;
    }
    
    Object o = queue[front];
    queue[front++] = null;
    return o;
}
```
큐에서 맨 앞의 요소를 빼낸다. front + 1을 하고 그 자리에 있던 요소를 출력한다.

deQueue를 할 때 공백이면 underflow

front에 위치한 값을 object에 꺼낸 후, 꺼낸 위치는 null로 채워준다.

🐣 underflow : 메모리가 표현 범위보다 작은 수의 값을 저장할 때 발생

<br><br><br>

**isEmpty**

```java
public boolean isEmpty() {
    return front == rear;
}
```

큐가 비었는지 확인한다. `front = rear`이면 큐가 비었다고 판단한다.

<br><br><br>

**isFull**

```java
public boolean isFull() {
    return (rear == queueSize-1);
}
```

큐가 꽉 찼는지 확인한다. rear = n - 1, 즉 rear가 마지막 인덱스를 가리키면 꽉 찬 것이다.

<br><br><br>

일반 큐의 단점 : 큐에 빈 메모리가 남아 있어도, 꽉 차있는것으로 판단할 수도 있다.
(rear가 끝에 도달했을 때)

![image](https://user-images.githubusercontent.com/74857364/198269199-16164cb0-68f4-4ba7-a6d7-cd2f1fca53f0.png)

선형 큐에서 삽입 및 삭제를 반복하다 보면, rear가 맨 마지막 인덱스를 가리키고, 앞에는 비어 있을 수 있지만 이를 꽉 찼다고 인식한다.

실제 데이터는 삭제 때마다 한 칸 앞으로 이동시키지 않았고, 인덱스 단위로 큐의 연산을 진행했기 때문인데

이를 개선한 것이 **원형 큐**다.

논리적으로 배열의 처음과 끝이 연결되어 있는 것으로 간주한다.

<br><br><br>

### Circular Queue : 원형 큐
원형 큐는 선형 큐의 문제점을 보완하기 위한 자료구조다. 

선형 큐의 문제점은 rear이 가르키는 포인터가 배열의 마지막 인덱스를 가르키고 있을 때

앞쪽에서 Dequeue로 발생한 배열의 빈 공간을 활용 할 수가 없었다. 

<br>

원형큐에서는 포인터 증가 방식이 `(rear+1)%arraysize` 형식으로 변환하기 때문에 

배열의 첫 인덱스부터 다시 데이터의 삽입이 가능해진다.

<br><br><br>

#### Enqueue
rear의 포인터를 1증가 시키고 그 위치에 데이터 삽입이 이루어진다. 

만약 rear+1이 배열의 끝이고 포화상태가 아니라면 배열의 첫 번째 인덱스에 데이터를 삽입한다.

<br>
 
→ 배열의 포화상태 여부를 판단하기 위하여 배열의 1칸은 비워둔다.        

`(rear+1)%arraysize == front` 라면 배열이 포화상태인걸로 판단하여 데이터 삽입이 이루어지지 않게 된다.

<br><br><br>

#### Dequeue
front의 포인터를 1증가 시키고 그 위치의 데이터를 배열에서 가지고 온다. 

`rear==front` 조건이라면 배열이 공백상태인걸로 판단하여 Dequeue가 실행되지 않는다.

<br><br><br>

#### 데이터 입출력 과정

<img src = https://user-images.githubusercontent.com/74857364/198270414-cad364f3-375c-4794-aa57-67db0ab81640.png width = "30%">

먼저 rear과 front는 0 인덱스를 가지고 시작한다. 

현재 상태에서 Dequeue가 실행되면 `rear==front`이므로 실행이 되지 않는다.


<br><br>

<img src = https://user-images.githubusercontent.com/74857364/198270469-5891e0e9-cd31-42a1-b996-00fd38f4be81.png width="40%">     

데이터 1이 Enqueue 실행 된 상태이다. 

`(rear+1)%4 == front` 조건을 검사하고 `(rear+1)%4`을 증가하여 해당 인덱스에 데이터 1의 값을 삽입 하였다.

<br><br>

<img src = https://user-images.githubusercontent.com/74857364/198270508-95df0b29-f351-49d7-bb91-85bab9b03725.png width="40%">

마찬가지로 Enqueue 2를 실행 한 상태다. 포화상태가 아니므로 정상적으로 데이터 삽입이 이루어진다.

<br><br>

<img src = https://user-images.githubusercontent.com/74857364/198270541-66c7a223-b828-49e4-b39c-0557fe0a01ce.png width="30%">        

Enqueue 3의 실행 상태다. 이제 한번 더 Enqueue를 할려고 하면 포화 조건인 `(rear+1)%4==front`를 만족하게 된다. 

이 상태에서는 더 이상 Enqueue가 실행되지 못한다.

<br><br>

<img src = https://user-images.githubusercontent.com/74857364/198270577-162e62c3-d84f-42c0-b5f1-f8df26537d79.png width="40%">     

Dequeue를 실행한 상태다. 

공백 상태 조건인 `front==rear`을 만족하지 않기 때문에 `(front+1)%4`한 인덱스에 존재하는 배열의 데이터를 가지고 온다.


<br><br>

<img src = https://user-images.githubusercontent.com/74857364/198270642-8a5a2ea3-5d86-4b87-a8f7-75abba7d88df.png width="40%">      

한번 더 Dequeue를 실행 한 상태다. 

마찬가지로 공백 조건에 만족하지 않으므로 `(front+1)%4` 인덱스의 데이터를 가지고 온다. 

이 상태에서 두 번 연속 Dequeue를 실행하게 되면 두 번째 Dequeue에서 공백 조건에 만족하게 되므로 Dequeue가 실행되지 않는다.


<br><br>

<img src = https://user-images.githubusercontent.com/74857364/198270685-7de37903-0ea6-4e3b-8ba6-9d5a03d92ced.png width="40%">

Enqueue 4를 한 결과다. 

그림에서 보면 0번째 인덱스에 삽입이 이루어졌는데, rear 포인터 연산이 `(rear+1)%4`의 형태로 이루어지기 때문이다. 

즉 배열의 크기로 나머지 연산을 함으로써 배열의 인덱스를 계속해서 순환할 수 있도록 하는 것이다.

<br><br>

#### code
```java
public class Circular_Queue {
    int rear = 0;            //최초 0에서부터 시작
    int front = 0;            //최초 0에서부터 시작
    int maxsize = 0;        //배열의 크기
    int[] circular_Queue;          //배열

    public Circular_Queue(int maxsize) {
        this.maxsize = maxsize;
        circular_Queue = new int[this.maxsize];
    }

    public boolean Isempty() { // 배열이 공백 상태인지 체크하는 메서드
        if (rear == front) {
            return true;
        }
        return false;
    }

    public boolean Isfull() { // 배열이 포화 상태인지 체크하는 메서드
        if ((rear + 1) % maxsize == front) {
            return true;
        }
        return false;
    }

    public void EnQueue(int num) {
        if (Isfull()) { // 배열이 포화상태일 경우
        System.out.println("큐가 가득 찼습니다");
        } 
        else {  // 배열이 포화상태가 아닐경우
            rear = (rear + 1) % maxsize;
            circular_Queue[rear] = num;
        }
    }

    public int DeQueue() {
        if (Isempty()) { // 배열이 공백상태이면 -1반환
            return -1;
        } 
        else { // 배열이 공백상태가 아니라면
            front = (front + 1) % maxsize;
            return circular_Queue[front];
        }
    }
}
```
<br><br><br>

### PriorityQueue : 우선순위 큐

데이터에 우선순위가 주어져 큐에 들어간 순서에 관계없이 우선순위가 높은 데이터가 나오게 된다.

우선순위 큐를 구현하는 방법은 배열, 링크드 리스트, 힙이 있다. 

이 3가지 중 가장 효율 적인 방법은 힙을 사용하여 구현한다.

힙은 완전 이진트리 구조로 빠르게 최댓값, 최솟값 찾도록 만들어진 자료구조이다.

<br><br>

#### code

넣는 순서대로 나오는게 아니라 값 순서에 따라 출력이 된다.

```java
public static void main(String[] args) {
        
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
    q.offer(200);
    q.offer(50);
    q.offer(93);
    q.offer(7);
    q.offer(80);
        
    System.out.println(q.poll()); // 7
    System.out.println(q.poll()); // 50
    System.out.println(q.poll()); // 80
    System.out.println(q.poll()); // 93
    System.out.println(q.poll()); // 200
 
    }
```

<br><br>

작은 값이 먼저 나오는게 아니라 큰 값이 먼저 나오게 할 수도 있다.

크기 부분에 `Collections.reverseOrder()`를 추가해주면 된다.

```java
public static void main(String[] args) {

    PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

    q.offer(200);
    q.offer(50);
    q.offer(93);
    q.offer(7);
    q.offer(80);

    System.out.println(q.poll()); // 200
    System.out.println(q.poll()); // 93
    System.out.println(q.poll()); // 80
    System.out.println(q.poll()); // 50
    System.out.println(q.poll()); // 7

	}
```

<br><br><br>

### LinkedList 큐
LinkedList를 기반으로 Queue를 구현하기에 앞서 가장 기본적인 데이터를 담을 Node 클래스를 먼저 구현한다.

#### Node
```java
class Node<E> {
    E data;
    Node<E> next;    // 다음 노드를 가리키는 역할을 하는 변수
	
    Node(E data) {
        this.data = data;
        this.next = null;
    }
}
```

<br><br><br>
 
#### interface

```java
// 자바 Queue Interface
// Queue는 ArrayQueue, LinkedQueue, Deque, PriorityQueue 에 의해 구현
 
public interface Queue<E> {

    boolean offer(E e);

    E poll();

    E peek();
	
}
```

- `boolean offer(E e);` : 큐의 가장 마지막에 요소를 추가
    - *@param* : e 큐에 추가할 요소
    - *@return* : 큐에 요소가 정상적으로 추가되었을 경우 true를 반환

- `E poll();` : 큐의 첫 번째 요소를 삭제하고 삭제 된 요소를 반환
    - *@return* : 큐의 삭제 된 요소 반환

- `E peek();` : 큐의 첫 번째 요소를 반환
    - *@return* : 큐의 첫 번째 요소 반환

<br><br>

#### Queue 클래스 및 생성자 구성하기

```java
public class LinkedListQueue<E> implements Queue<E> {
 
    private Node<E> head;
    private Node<E> tail;
    private int size;
	
    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}
```

- **head** : 큐에서 가장 앞에있는 노드 객체를 가리키는 변수
- **tail** : 큐에서 가장 뒤에있는 노드 객체를 가리키는 변수
- **size** : 큐에 담긴 요소의 개수

<br>

처음 큐를 생성할 때는 아무런 데이터가 없으므로 head와 tail은 가리킬 노드가 없는상태이므로 null로 초기화해주고, 

size 또한 0으로 초기화 해준다.

<br><br><br>


#### offer() : 데이터 추가

Queue에 데이터를 추가하는 메소드(맨 뒤에 데이터 추가)

*리스트로 치면 add(E value)와 같은 역할

<img src = https://user-images.githubusercontent.com/74857364/198283378-17636955-163b-44a5-9e96-321545858a13.png width="60%">     

<br>

기본 삽입 : `offer(E item)` _ 가장 마지막 부분에 추가

```java
@Override
public boolean offer(E value) {
    Node<E> newNode = new Node<E>(value);
		
    // 비어있을 경우 
    if(size == 0) {
        head = newNode;
    }
    // 그 외의 경우 마지막 노드(tail)의 다음 노드(next)가 새 노드를 가리키도록 한다.
    else {
        tail.next = newNode;
    }
	
    // tail이 가리키는 노드를 새 노드로 바꿔준다.
    tail = newNode;
    size++;
    
    return true;
}
```

큐에 아무 요소들이 없을 때. 즉 size가 0일 때는 새 요소가 head이자 tail이 된다. 

그렇기 때문에 큐가 비어있을 경우에는 head를 새 노드를 가리키도록 해야하고 그 외에는 이미 요소가 있다는 의미이므로 

tail이 가리키는 요소의 다음 노드(tail.next)를 새 노드를 가리키도록 한 뒤 tail이 가리키는 노드를 새 노드를 가리키도록 한다.

<br><br><br>

#### 데이터 삭제

리스트에서의 `remove()`와 같은 역할로 가장 앞에있는 위치에 있는 요소인 head 요소를 삭제하면 된다.

`remove()` 같은 경우 삭제 할 요소가 없으면 *NoSuchElementException*() 예외를 던진다. 

반대로 `poll()`의 경우는 삭제 할 요소가 없다면 null을 반환한다는 차이점이 있다.

<img src = https://user-images.githubusercontent.com/74857364/198283772-dcc5867e-65c8-4312-babb-7c4d0e497386.png width = "50%">  

1. `poll()`
```java
@Override
public E poll() {
		
    // 삭제할 요소가 없을 경우 null 반환
    if(size == 0) {
        return null;
    }
		
    // 삭제될 요소의 데이터를 반환하기 위한 임시 변수 
    E element = head.data;
		
    // head 노드의 다음노드
    Node<E> nextNode = head.next;
		
    // head의 모든 데이터들을 삭제 
    head.data = null;
    head.next = null;
		
    // head 가 가리키는 노드를 삭제된 head노드의 다음노드를 가리키도록 변경 
    head = nextNode;
    size--;
		
    return element;
}
```

<br><br>

2. `remove()`

```java
public E remove() {
		
    E element = poll();
		
    if(element == null) {
        throw new NoSuchElementException();
    }
		
    return element;
}
```
<br><br><br>

#### 조회

가장 앞에 있는 데이터(head.data)를 삭제하지 않고 확인만 하고싶을 때 쓰인다.

`poll()` 메소드에서 삭제과정만 없는 것이 `peek()` 이다.

1. `peek()`

```java
@Override
public E peek() {	
		
	// 요소가 없을 경우 null 반환
    if(size == 0) {
        return null;
    }
    return head.data;
}
```

head의 데이터를 그대로 반환하기만 하면 된다.

<br><br>

2. `element()`

```java
public E element() {
		
    E element = peek();
		
    if(element == null) {
        throw new NoSuchElementException();
    }
    return element;
}
```

`peek()` 메소드로 데이터를 얻은 뒤, 얻은 요소가 null 이라면 예외를 던진다.

<br><br><br>

#### 그 외 메소드

#### size()

현재 큐에 있는 요소의 개수를 알려준다.

```java
public int size() {
    return size;
}
```
<br><br><br>

#### isEmpty()

현재 큐가 비어있는지를 확인 할 때 쓰인다. 

요소의 개수가 0개라면 비어있다는 뜻이므로, 비어있다면 true를, 비어있지 않다면 false를 반환한다.

```java
public boolean isEmpty() {
    return size == 0;	
}
```

<br><br><br>

#### contains()

현재 찾고자하는 요소가 큐에 들어가있는지를 알려주는 메소드

```java
public boolean contains(Object value) {
		
    // head 데이터부터 x가 null이 될 때까지 value랑 x의 데이터(x.data)랑
    // 같은지를 비교하고 같을 경우 true를 반환한다.
    for(Node<E> x = head; x != null; x = x.next) {
        if(value.equals(x.data)) {
        return true;
        }
    }
    return false;
}
```

<br><br><br>

#### clear()

Queue의 모든 요소를 비워버린다.

```java
public void clear() {
    for (Node<E> x = head; x != null; ) {
        Node<E> next = x.next;
        x.data = null;
        x.next = null;
        x = next;
    }
    size = 0;
    head = tail = null;
}
```

이 때는 모든 데이터를 명시적으로 null 처리를 해주는 것이 좋다.

그리고 빈 공간은 초기 상태와 마찬가지로 head 와 tail와 size 모두 0으로 초기화 해준다.

<br><br><br>


출처          
[자바 헤엄치기[기초부터 알고리즘까지]](https://wikidocs.net/102684)                
[자바 Queue 알아보기](https://flatsun.tistory.com/76)               
[[Java] 자바 Queue 클래스 사용법 & 예제 총정리](https://coding-factory.tistory.com/602)               
[[자료구조]Queue - add vs offer](https://goodteacher.tistory.com/112)               
[스택 & 큐](https://gyoogle.dev/blog/computer-science/data-structure/Stack%20&%20Queue.html)               
[자바 [JAVA] - 연결리스트를 이용한 Queue (큐) 구현하기](https://st-lab.tistory.com/184)                  
[자료구조 : 큐](https://newbie22.tistory.com/152)                       
[C 언어 - 정수, 실수의 오버플로우, 언더플로우 (overflow , underflow)](https://infinitt.tistory.com/295)    
[03 원형 큐 (Circular Queue) 자료 구조](https://lktprogrammer.tistory.com/59)            
[[자료구조] 큐 - 정리 및 연습문제](https://atoz-develop.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%ED%81%90-%EC%A0%95%EB%A6%AC-%EB%B0%8F-%EC%97%B0%EC%8A%B5%EB%AC%B8%EC%A0%9C)         
