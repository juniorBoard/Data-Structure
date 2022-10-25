package stack;

public class StackImplTest {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        System.out.printf("초기화 스택 : %s\n", stack);
        System.out.printf("Is Stack Empty? %s\n", stack.isEmpty());
        stack.push(1);
        System.out.printf("요소 추가 : %s\n", stack);
        stack.push(2);
        System.out.printf("요소 추가 : %s\n", stack);
        stack.push(3);
        System.out.printf("요소 추가 : %s\n", stack);
        System.out.printf("크기 : %d\n", stack.size());
        System.out.printf("peek : %s, %s\n", stack.peek(), stack);
        System.out.printf("크기 : %d\n", stack.size());
        System.out.printf("pop : %s, %s\n", stack.pop(), stack);
        System.out.printf("크기 : %d\n", stack.size());
        System.out.printf("pop : %s, %s\n", stack.pop(), stack);
        System.out.printf("pop : %s, %s\n", stack.pop(), stack);
        System.out.printf("pop : %s, %s\n", stack.pop(), stack); // 예외 발생
    }
}
