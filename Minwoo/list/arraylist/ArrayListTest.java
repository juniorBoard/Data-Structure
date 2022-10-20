package list.arraylist;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();

        numbers.add(13);
        numbers.add(16);
        numbers.add(20);

        System.out.println(numbers);
        
        numbers.add(0, 5);
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(25));
    }
}
