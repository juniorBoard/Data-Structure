# 스택

## Stack이란?
+ 스택(Stack) → 티슈, 프링글스 : **후입선출** Last in First out [LIFO]
+ [JVM 함수 호출 스택, Stack Overflow 에러] 에서의 스택

<img  alt="스택" src="https://github.com/juniorBoard/Data-Structure/blob/main/Minwoo/stack/stack.png" width="70%">

## 구현할 기능
[구현 코드](https://github.com/juniorBoard/Data-Structure/blob/main/Minwoo/stack/StackImpl.java)
+ push() → 스택에 맨 위에 넣는 기능
+ pop() → 맨 위에서 꺼내고 없애는 기능
+ peek() → 맨 위의 값을 확인 하는 기능(없애지 않음)
+ isEmpty() → 비어있는지 확인

## 자바 속 Stack
```java
Stack<Integer> stack = new Stack<>();
```
+ push()
+ pop()
+ peek()
+ isEmpty()
+ size()

Stack이 List도 상속받고 있어 List의 메소드도 사용가능
+ add()
+ get()
+ indexOf()
+ …

<img alt="상속_다이어그램" src="https://github.com/juniorBoard/Data-Structure/blob/main/Minwoo/stack/diagram.png" width="60%">