# 배열 Array
- 가장 기본적인 데이터 구조이다.
- 인덱스(Index)와 인덱스에 해당하는 요소(Element)로 구성

## 특징
1. **길이가 고정되어 있다.(정적 메모리 할당)**
2. Random Access를 지원한다. 즉, 인덱스를 통해서 각 요소에 직접 접근할 수 있는 특징이 있다.
3. 논리적 순서와 물리적 순서가 일치한다. 인접한 메모리 위치에 연이어 저장

## 시간 복잡도
1. 검색 (Search) 
   - 요소마다 인덱스를 부여했기 때문에 특정 요소를 접근하는 시간복잡도는 0(1)이다. 
   - 인덱스를 모르는 값을 찾기 위해서는 배열의 모든 요소들을 살펴봐야 하기 때문에 0(n)의 시간 복잡도를 갖는다.
2. 추가/삭제(Insert/Delete) 
   - 삽입이나 삭제를 하기 위해서는 길이가 고정되어 있기 때문에 차례대로 한칸씩 밀어야 하는 과정이 필요하며  
     이 과정에서 0(n)의 시간 복잡도가 생긴다.

## Array vs List

### 데이터 삽입
- Array : 넣으려는 자리(index)의 값에 넣으려는 값을 덮어씌운다.
- List : 넣으려는 자리에 데이터가 있을경우 뒤로 밀고 값을 넣는다.

### 데이터 삭제
- Array : 삭제한 자리(index)는 존재하지만 값은 지워진다.
  - 단점. 
    - 값이 비어있는지 확인하는 과정을 해줘야한다.
  - 장점.
    - 삭제 후에도 다음 데이터가 밀리지 않아 데이터 들의 고유 자리를 유지할 수 있다.

- List : 삭제한 데이터의 값이 지워지고 다음 데이터가 자리를 채운다.
  - 단점. 
    - 자리를 채운 후의 데이터들의 인덱스 값을 유지하기가 어려워진다.

### index 값의 의미
- Array : 데이터의 값을 확인하는 식별자 역할
- List : 몇번째 데이터인지 확인하는 정도의 역할