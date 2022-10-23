# Array vs ArrayList vs LinkedList

## 1. 크기  
#### Array
- static(길이 고정) 하다.
- 객체를 생성한 후에는 마음대로 변경할 수 없다.

#### ArrayList
- dynamic 하다. 요소들이 더해지면 자동적으로 늘어난다. (Default : 10)
- 내부적으로 설정된 길이를 넘어가면 배열 크기를 1.5배 증가시킨다. 

#### LinkedList
- 가변적이다. 

## 2. 데이터 관리
#### Array 
- index 로 값을 관리하여 찾는게 빠르다. 

#### ArrayList
- index 로 관리
  - 크기가 동적이므로 추가/삭제 시에는 성능이 떨어진다.

#### LinkedList
- node 로 순차적으로 연결하여 관리 
  - 추가/삭제는 성능이 좋지만 검색할때는 순차적으로 찾아야하므로 성능이 떨어진다.
  
## 3. 타입
#### Array
- 원시 타입, Object

#### ArrayList
- primitive data types(int, float, double etc)을 가질 수 없다.   
오직 Object만을 가질 수 있다.

## 4. 제네릭
#### Array
- 사용 불가능
#### ArrayList
- 사용 가능 
#### LinkedList
- 사용 가능

## 5. 다차원 
#### Array
- 가능하다
```java
int addarrayobject[][] = new int[3][2];
```
#### ArrayList
- 단일 차원만 가능 