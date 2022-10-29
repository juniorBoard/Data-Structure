# CircularQueue
<img width="311" alt="워형큐" src="https://user-images.githubusercontent.com/90807141/198705359-8c0e5ff8-2b36-48a8-a031-54cc901ba3da.png">

- 논리적으로 배열의 처음과 끝이 연결

## 원형 큐의 연산
### enqueue
<img width="800" alt="원형큐 enqueue" src="https://user-images.githubusercontent.com/90807141/198709108-dde960fc-4598-4cfd-ad6d-8f234b426e71.png">

- R 포인터가 이동 후 해당 자리에 새로 들어온 데이터를 저장

### dequeue
<img width="800" alt="원형 큐 dequeue" src="https://user-images.githubusercontent.com/90807141/198709841-0be12253-d058-4235-b569-b452e5258dd1.png">

- F 포인터가 가리키는 데이터 반환 후 F 이동

### [ !! ] 원형 Queue의 단순한 연산의 문제점
- R 포인터 바로 다음이 F 포인터인 경우 다 찬 상태이거나 텅 빈 상태 일 것이다.
    - 이 말은 원형 큐가 빈상태인지 다 차있는 상태인지 구분할 수 없다.
- **다 차있는 경우**  
  <img width="300" alt="원형큐 full" src="https://user-images.githubusercontent.com/90807141/198713432-2d00c3b9-7757-408d-b981-13c06fe13805.png">
- **비어있는 경우**   
  <img width="300" alt="원형 큐 empty" src="https://user-images.githubusercontent.com/90807141/198713440-ca239c3d-3f62-4342-acb3-e9bb5a2a3376.png">

### 해결법 
- 텅 빈 상태를 초기화 상태로 정의, 초기화 상탱에서 F와 R은 같은 배열 index를 갖도록 설정
- 초기화 된 상태, 즉 F와 R이 같은 공간을 가리키는 상태를 Empty 상태로 정의
  - but, 해당 상태에 해당 index에는 정보를 넣지 못함(메모리 손실)
- R바로 다음 자리가 F가 되는 경우 Full 상태로 정의

### 그림 설명
1. R == F : Empty
   <img width="633" alt="원형큐 비어있는 상태" src="https://user-images.githubusercontent.com/90807141/198819172-223c858b-c071-4701-beab-5a9023bc87a6.png">
- F와 R이 같은 공간을 배열 index로 설정 (초기 index 자리가 비어있다.)
- index의 다음 공간부터 데이터를 채워 나간다. 

2. R+1 = F : Full  
   <img width="311" alt="원형큐 문제 꽉찬 상태" src="https://user-images.githubusercontent.com/90807141/198819174-26cd0cb4-eb78-4459-9b50-1a17c00140ec.png">
- 첫 자리를 비워뒀지만 Full로 인식한다. 
- 이 부분에서 메모리 손실 설명이 가능하다. (하지만 배열이 길어지면 손실은 상대적으로 적어진다.)
