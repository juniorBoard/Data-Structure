# ArrayList
## 특징
- 용량을 초과하면 자동으로 부족한 크기만큼 용량이 늘어난다. (동적 메모리 할당) 
- 추가시 메모리를 재할당하여 속도가 느림
- object element 만 가능
- 제네릭 사용가능 (타입 안정성 보장)

## 선언 방법
```java
ArrayList list = new ArrayList(); // 타입 설정x Object로 사용
ArrayList<Integer> i = new ArrayList<Integer>(); // int 타입으로 선언
ArrayList<Integer> i = new ArrayList<>(); // Integer 타입 사용
ArrayList<Integer> i = new ArrayList<Integer>(10); // 초기 용량 세팅
ArrayList<Integer> i = new ArrayList<Integer>(Arrays.asList(1, 2, 3)); // 초기 값 세팅

ArrayList<String> s = new ArrayList<String>(); // String 타입 사용
ArrayList<Character> ch = new ArrayList<Character>(); // char 타입 사용
```
- 타입을 설정하면 해당 타입의 데이터만 추가 가능

## 데이터 관리 방법
### 데이터 추가
- add(Object) : ArrayList 의 마지막에 데이터를 추가  
- add(int index, Object) : index 에 데이터를 추가 - index 이후의 값들은 뒤로 밀린다. (길이 고정x)

### 데이터 변경
- set(int index, Object) : index 의 데이터 Object 로 변경

### 데이터 삭제
- clear() : ArrayList 의 모든 값을 삭제
- remove(Object) : Object 와 같은 데이터 삭제
- remove(int index) : index 에 해당하는 데이터 삭제

### 데이터 출력
- get(int index) : index 에 해당하는 값 출력

### ArrayList 크기
- size()

### ArrayList 데이터 검색
- contains(Object) : Object 데이터가 있는지 여부만 파악 - true, false
- indexOf(Object) : Object 데이터의 index 출력, 없을 시 -1 출력 

### 반복
```java
Iterator it = numbers.iterator();

while(it.hasNext()){
    int value = it.Next();
}
```
- Iterator
- .hasNext() : 가져올수 있는 다음 element 가 있는지 확인 (boolean) 
- .Next() : 호출시 조회 하지 않은 첫번째 값을 가져와 value 에 담아준다. 