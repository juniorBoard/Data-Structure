package Jehyeop.Prac.DataStructurePrac.src.main.java.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ArrayStack extends Stack {

    // 데이터 값을 리스트로 출력 (전체 데이터를 볼수 있다.)
    public void items(Stack<Integer> stack){
        ArrayList<Integer> result = new ArrayList<>(stack);
        result.sort(Collections.reverseOrder());
        System.out.println(result);
    }

    // java에서 제공해주는 Stack class
    // push, pop, peek, empty, search 지원
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i <= 5; i ++){
            stack.push(i);
        }
        System.out.println("stack 세팅");
        arrayStack.items(stack);

        System.out.println("\n< push() : 7 추가 >");
        stack.push(7);
        arrayStack.items(stack);

        System.out.println("\n< pop() >");
        stack.pop();
        arrayStack.items(stack);

        System.out.println("\n< peek() >");
        System.out.println(stack.peek());

        System.out.println("\n< search(2) >");
        System.out.println(stack.search(2)); // 2의 인덱스를 출력

        System.out.println("\n< Empty() >");
        System.out.println(stack.empty());

        System.out.println("\n< clear() >");
        stack.clear();
        arrayStack.items(stack);

        System.out.println("\n< Empty() >");
        System.out.println(stack.empty());
    }

}
