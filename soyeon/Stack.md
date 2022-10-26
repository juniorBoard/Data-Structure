# 스택

스택은 가장 마지막으로 들어간 데이터가 가장 첫 번째로 나오는 성질(**LIFO**, Last In First Out)을 가진 자료 구조이다.

재귀적인 함수, 알고리즘에 사용되며 웹 브라우저 방문 기록 등에 쓰인다.

삽입 및 삭제에 `O(1)`, 탐색에 `O(n)`이 걸린다.

<br><br><br>

## 개념

한 쪽 끝에서만 자료를 넣고 뺄 수 있다.

<br><br><br>

## 연산

- `pop()` : 스택에서 가장 위에 있는 항목을 제거한다.
- `push(item)` : item 하나를 스택의 가장 윗 부분에 추가한다.
- `peek()` : 스택의 가장 위에 있는 항목을 반환(조회)한다. 
pop 메소드와는 달리 스택에서 제거하지는 않는다.
- `isEmpty()` : 스택이 비어 있을 때에 true를 반환한다.
- `clear()` : 스택에 존재하는 모든 자료들을 삭제한다.

<br><br>

push와 pop할 때는 해당 위치를 알고 있어야 하므로 기억하고 있는 '스택 포인터(SP)'가 필요하다.         

스택 포인터는 다음 값이 들어갈 위치를 가리키고 있다. (처음 기본값은 -1)

```java
	public boolean isEmpty(){
		return top == -1;
	}
```

<br><br><br>

## 동작 배열 스택

스택에는 MAX_SIZE라는 최대 크기가 존재해야 한다.            

→ 스택 포인터와 MAX_SIZE를 비교해서 isFull 메소드로 비교해야되기 때문이다. 

<br>
                                            
최대 크기가 없는 스택을 만드려면?       

arraycopy를 활용한 동적배열 사용한다.           

<br><br><br>

### 구현

```java
class Stack{
	private int top;
	private int stackSize;
	private char stackArr[];

	// 스택이 비어있는 상태인지 확인
	// 스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌 경우 false를 return
	public boolean isEmpty(){
		return top == -1;
	}

	// 스택이 가득찬 상태인지 확인
	// 스택 포인터가 스택의 마지막 인덱스와 동일한 경우 true 아닌 경우 false를 return
	public boolean isFull(){
		return top == this.stackSize -1;
	}

	// 스택에 데이터를 추가
	public void push (char item){
		if(isFull()){
			System.out.println("Stack is full!");
		}
		else{
			stackArr[++top] = item; // top 값이 먼저 증가된 후에 해당 코드 실행
			System.out.println("입력된 문자 : " + item);
		}
	}

	// 스택의 최상위(마지막) 데이터 추출 후 삭제
	public char pop(){
		if (isEmpty()) {
			System.out.println("Deleting fail! Stack is empty!");
			return 0;
		} else {
			System.out.println("삭제된 문자 : " + stackArr[top]);
			return stackArr[top--]; // 해당 코드가 실행 된 후 top 값 감소
		}
	}

	// 스택의 최상위(마지막) 데이터 추출
	public char peek(){
		if (isEmpty()){
			System.out.println("Peeking fail! Stack is empty!");
			return 0;
		}
		else {
			System.out.println("최상위 문자 조회 : " + stackArr[top]);
			return stackArr[top];
		}
	}

	// 스택 초기화
	public void clear(){
		if (isEmpty()){
			System.out.println("Stack is already empty!");
		} else {
			top = -1; // 스택 포인터 초기화
			stackArr = new char[this.stackSize]; // 새로운 스택 배열 생성
			System.out.println("Stack is clear!");
		}
	}

	// 스택을 생성하는 생성자
	public Stack(int stackSize){
		top = -1; // 스택 포인터 초기화
		this.stackSize = stackSize; // 스택 사이즈 설정
		stackArr = new char[this.stackSize]; // 스택 배열 생성
	}

	// 스택에 저장된 모든 데이터를 출력
	public void printStack(){
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			System.out.print("Stack elements : ");
			for (int i =0; i<=top; i++) {
				System.out.print(stackArr[i] + " ");
			}
			System.out.println();
		}
	}

}

public class StackTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 사용자로부터 키 입력을 받기 위해서는 System.in을 사용한다.
		System.out.print("스택 사이즈를 입력하세요. :  ");
		int stackSize = scanner.nextInt(); // int nextInt() : 입력받은 값을 int 타입으로 반환

		Stack stack = new Stack(stackSize);

		stack.push('A');
		stack.printStack();

		stack.push('B');
		stack.printStack();

		stack.push('C');
		stack.printStack();

		stack.pop();
		stack.printStack();

		stack.peek();
		stack.printStack();

		stack.clear();
		stack.printStack();
	}
}

// https://velog.io/@kungsboy/%EC%88%99%EC%A0%9C-Stack-%EA%B5%AC%ED%98%84
```
<br>

![image](https://user-images.githubusercontent.com/74857364/198081932-324f9900-3a49-42f2-a7ca-49d0b34f9225.png)

<br><br><br>

### 활용

- 재귀 알고리즘
- 웹 브라우저 방문기록(뒤로가기)
- 실행 취소
- 역순 문자열 만들기
- 수식의 괄호 검사
- 후위 표기법 계산

<br><br><br>

출처    
[[자료구조] 스택(Stack)이란](https://gmlwjd9405.github.io/2018/08/03/data-structure-stack.html)              
[숙제: Stack 구현](https://velog.io/@kungsboy/%EC%88%99%EC%A0%9C-Stack-%EA%B5%AC%ED%98%84)                        
