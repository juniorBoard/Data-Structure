package Jehyeop.Prac.DataStructurePrac.src.main.java.Stack;

public class ArrayStack2 {
    int top;
    int size;
    Object[] stack;

    public ArrayStack2 (int size){
        this.size = size;
        stack = new Object[size];
        top = -1;
    }

    public void push(int item) {
        if(isFull(item)) {
            Object[] arr = new Object[size * 2];
            System.arraycopy(stack, 0, arr, 0, size);
            stack = arr;
            size *= 2; // 2배로 증가
        }
        stack[++top] = item;
    }

//    public void push(int item) {
//        if(isFull(item)) {
//            return;
//        }
//        stack[++top] = item;
//    }
    public void pop() {
        if(isEmpty(top)){
            return;
        }
        top--;
    }
    public void peek() {
        if(isEmpty(top)){
            return;
        }

        System.out.println(stack[top]);
    }

    private boolean isEmpty (int cnt) {
        return top == -1;
    }

    private boolean isFull(int cnt) {
        return top + 1 == size;
    }

    public static void main(String[] args) {
        ArrayStack2 stack = new ArrayStack2(6);
        for(int i=0; i <= 4; i ++){
            stack.push(i);
            stack.peek();
        }
        System.out.println("\n< push() : 7 추가 >");
        stack.push(7);
        stack.peek();

        System.out.println("\n< 동적배열 push() 확인 >");
        stack.push(8);
        stack.push(9);
        System.out.println("Max_size = "+stack.size);

        System.out.println("\n< pop() >");
        stack.pop();
        stack.peek();
    }
}

