# 큐
## Queue이란?
+ 큐(Queue) -> 주문, 대기줄, 선입선출 First In First Out [FIFO]
+ 메시지 큐

![queue](https://github.com/juniorBoard/Data-Structure/blob/main/Minwoo/queue/queue.png)

## 구현할 기능
+ enQueue() -> 스택에 맨 위에 넣는 기능
+ deQueue() -> 맨 위에서 꺼내고 없애는 기능
+ isEmpty() -> 비어있는지 확인
+ isFull() -> 가득 차있는지 확인

## 자바 속 Queue
+ add() == offer() : 맨 뒤에 요소 추가
+ peek() : 맨 앞에 있는 요소 반환.
+ poll() : 맨 앞에 있는 요소 반환 후 제거.