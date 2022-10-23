package Jehyeop.Prac.DataStructurePrac.src.main.java.ArrayList;

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.size());

        list.add(3,5);
        System.out.println(list);

        list.set(2,6);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
