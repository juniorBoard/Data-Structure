# LinkedList

```java
List<Integer> list = new LinkedList<>();
```

## 특징
+ 배열과 달리 크기가 정해있지 않음.
+ 크기가 동적으로 변함.
+ 원시 자료형을 담을 수 없음. (원시 자료형에는 null값을 담을 수 없기 때문)
+ 중복을 허용함.
+ 순서가 있음.
+ Sequential Access : 순차 접근

### 접근
+ 인덱스로 값에 바로 접근 하지 못함.
+ head부터 순차적으로 접근해야함. O(n)

### 삽입
+ 값을 추가할때 Node 연결 관계만 수정해주면 됨. O(1)
+ 그 위치를 찾아가는 것은 O(n)

### 삭제
+ 값을 삭제할때 Node 연결 관계만 수정해주면 됨. O(1)
+ 그 위치를 찾아가는 것은 O(n)

### 검색
+ 순차적으로 하나씩 직접 확인해야함. O(n)

## 자바 속 LinkedList
### 메소드
+ add() : 요소 추가.
    + add(element)
    + add(index, element)
    + addFirst(element)
    + addLast(element)
+ get() : 요소 접근.
    + get(index)
    + getFirst()
    + getLast()
+ remove() : 요소 삭제.
    + remove(index)
    + removeFirst()
    + removeLast()
+ indexOf() : 요소 검색.
    + indexOf(object)
+ size() : 리스트 크기.
+ contains() : 요소 존재 여부.
    + contains(object)
+ isEmpty()
+ 양방향 큐
  + pop()
  + push()
  + peek()
    + peekFirst()
    + peekLast()
  + poll()
    + pollFirst()
    + pollLast()