# Stack
LIFO(Last In First Out) : 후입선출 형식의 자료구조

## Stack의 기본연산
### 1. push()
<img width="108" alt="push2" src="https://user-images.githubusercontent.com/90807141/198384611-5b1e84c9-017a-4a9a-945f-026546bc4330.png">

- item 하나를 스택의 가장 윗 부분에 추가  

### 2. pop()
<img width="136" alt="pop2" src="https://user-images.githubusercontent.com/90807141/198384969-357ead90-b7bd-4786-bf73-2d0793a49998.png">

- 스택에서 가장 위에 있는 항목을 제거  

### 3. peek()
<img width="58" alt="peek()" src="https://user-images.githubusercontent.com/90807141/198383789-28bd6328-ebdb-4c39-b32b-65e5c41c1040.png">

- 스택의 가장 위에 있는 항목을 반환

### 4. isEmpty()
<img width="58" alt="empty2" src="https://user-images.githubusercontent.com/90807141/198384985-7948a0ce-5194-48f8-a3aa-f7b4ae726e6d.png">

- 스택이 비어 있을 때에 true를 반환

### 5. isFull()
<img width="59" alt="full2" src="https://user-images.githubusercontent.com/90807141/198384994-99d5d481-7895-4a35-8a62-1672e36b0ad7.png">

- 스택이 꽉차 있을 때 true를 반환  

## 동적 배열 스택 
- 최대 크기가 없는 스택

### 1. arraycopy 활용
<img width="68" alt="두배2" src="https://user-images.githubusercontent.com/90807141/198384998-fb3ae481-b965-4e48-bb9d-0da59db34657.png">

- 스택이 최대가 되면 스택 크기를 2배로 늘리는 방법.  

### 2. 연결리스트로 구현
<img width="68" alt="두배3" src="https://user-images.githubusercontent.com/90807141/198388287-c1f776b3-d3ef-4779-9828-8bcb18fbbb94.png">

- 스택이 최대가 되면 새 노드를 연결

## 특징
- 배열과 달리 index 같은 위치값으로 접근할 수가 없다.
    - 검색시. 제일 상위 값부터 검색해야 하므로 O(1)~O(n) 의 시간이 걸린다.
- 데이터 추가 및 삭제는 O(1)
    - 배열처럼 원소들을 하나씩 밀어줄 필요가 없다.

## 사용 사례
- 재귀 알고리즘
    - 재귀적으로 함수를 호출해야하는 경우 임시 데이터를 스택에 넣어준다.
    - 재귀함수를 빠져 나와 퇴각 검색(backtrack)을 할 때는 스택에 넣어 두었던 임시 데이터를 빼 줘야 한다.
    - 스택은 이런 일련의 행위를 직관적으로 가능하게 해 준다.
    - 또한 스택은 재귀 알고리즘을 반복적 형태(iterative)를 통해서 구현할 수 있게 해준다.
- 웹 브라우저 방문기록 (뒤로가기)
- 실행 취소 (undo)
- 역순 문자열 만들기
- 수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)
    - Ex) 올바른 괄호 문자열(VPS, Valid Parenthesis String) 판단하기
- 후위 표기법 계산
- 등등 