# ArrayList

```java
List<Integer> list = new ArrayList<>();
```

## 특징
+ 배열과 달리 크기가 정해있지 않음.
+ 크기가 동적으로 변함.
+ 원시 자료형을 담을 수 없음. (원시 자료형에는 null값을 담을 수 없기 때문)
+ 중복을 허용함.
+ 순서가 있음.
+ Random Access : 랜덤 접근

### 접근
+ 인덱스로 값에 바로 접근 가능함 O(1)

### 삽입
+ 해당 인덱스의 값을 추가할때 다른 요소를 움직여 공간을 확보함. O(n)

### 삭제
+ 해당 인덱스를 삭제하고 빈 공간을 메우기 위해 다른 요소를 움직임. O(n)

### 검색
+ 담겨있는 인덱스로는 바로 접근 가능하지만 담겨있는 값은 모르기 때문에 하나씩 직접 확인해야함. O(n)

## 자바 속 ArrayList
### 메소드
+ add() : 요소 추가.
  + add(element)
  + add(index, element)
+ get() : 요소 접근.
  + get(index)
+ remove() : 요소 삭제.
  + remove(index)
+ indexOf() : 요소 검색.
  + indexOf(object)
+ size() : 리스트 크기.
+ contains() : 요소 존재 여부.
  + contains(object)
+ isEmpty()