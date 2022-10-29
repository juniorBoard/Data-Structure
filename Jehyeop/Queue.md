# Queue
FIFO(First In First Out) : 선입선출 형식의 자료구조  
<img width="450" alt="Queue" src="https://user-images.githubusercontent.com/90807141/198540306-8c23de17-8e4b-493e-9f52-4b53f6f50299.png">


## Queue의 기본연산

### 0. Base
- front : deQueue 할 위치 기억
- rear : enQueue 할 위치 기억

### 1. enQueue()
<img width="400" alt="enQueue" src="https://user-images.githubusercontent.com/90807141/198540322-11193b1c-6236-4e0b-8083-78988d483838.png">

- 데이터를 넣는 연산
- 데이터가 들어오면 rear는 새로 들어온 데이터가 된다. (R -> R')

### 2. dnQueue()
<img width="400" alt="dnQueue" src="https://user-images.githubusercontent.com/90807141/198540336-c581ce93-ef3c-4461-a784-703a4ab90777.png">

- 데이터를 빼는 연산
- 데이터가 나가면 front는 다음 데이터가 된다. (F -> F')

### 3. isEmpty()
<img width="350" alt="QueueEmpty" src="https://user-images.githubusercontent.com/90807141/198542277-3860214b-9aa0-43c3-8702-63303481e510.png">

- 데이터가 비었는지 확인
- front == rear

### 3. isFull()
<img width="350" alt="QueueFull" src="https://user-images.githubusercontent.com/90807141/198545014-8bc02102-9a35-497c-a58d-2b3b8e733828.png">

- 데이터가 꽉 차있는지 확인
- rear == QueueSize-1

### 4. Peek()
- 가장 첫번째 데이터를 반환하되 삭제는 하지 않는다. 
- 다음 출력 값이 미리 알아보는 역할 

### [ !! ] 배열 기반의 Queue의 문제점
<img width="400" alt="Queue 추가 x" src="https://user-images.githubusercontent.com/90807141/198704940-d87de6ae-f294-4d39-ab33-c368d47af18b.png">

- 배열의 길이가 정해진 경우, R포인터를 더 오른쪽으로 옮길 수 없는 문제가 발생한다.
  - = rear가 끝에 도달했을 경우 큐에 빈 메모리가 남아 있어도 꽉 차있는 것으로 판단할 수 있다.
- 이를 개선하기 위한 원형 큐 개념이 있다.

