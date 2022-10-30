package Jehyeop.Prac.DataStructurePrac.src.main.java.Queue;

import java.util.*;

public class QueuePrac {

    // 데이터 값을 리스트로 출력 (전체 데이터를 볼수 있다.)
    public void items(Queue<Integer> queue){
        ArrayList<Integer> result = new ArrayList<>(queue);
        System.out.println(result);
    }

    public static void main(String[] args) {
        QueuePrac queuePrac = new QueuePrac();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<5; i++){
            queue.offer(i);
        }
        System.out.println("queue 세팅");
        queuePrac.items(queue);

        System.out.println("\n< offer() : 6 추가 >");
        queue.offer(6); // 데이터 추가, true or false 출력
        queuePrac.items(queue);

        System.out.println("< add() : 7 추가 >");
        queue.add(7); // 데이터 추가, ture or 예외처리
        queuePrac.items(queue);

        System.out.println("\n< element() >");
        System.out.println(queue.element()); // queue 맨 앞의 값 반환, 비어있는 경우 예외발생

        System.out.println("< peek() >");
        System.out.println(queue.peek()); // queue 맨 앞의 값 반환 후 삭제, 비어있는 경우 null

        System.out.println("\n< remove() >");
        queue.remove(); // queue 맨 앞의 값 반환 후 삭제, 비어있는 경우 예외발생
        queuePrac.items(queue);

        System.out.println("< poll() >");
        queue.poll(); // queue 맨 앞의 값 반환 후 삭제, 비어있는 경우 null
        queuePrac.items(queue);

        System.out.println("< clear() >");
        queue.clear(); // queue 비우기
        queuePrac.items(queue);

        System.out.println("< isEmpty() >");
        System.out.println(queue.isEmpty());
    }
}
