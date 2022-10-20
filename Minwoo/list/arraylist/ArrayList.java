package list.arraylist;

public class ArrayList {
    private Object[] array = new Object[100];
    private int size = 0;

    public boolean add(Object element) {
        array[size++] = element;
        return true;
    }

    public boolean add(int index, Object element) {
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
        return true;
    }

    public Object remove(int index) {
        Object removedElement = array[index];
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        array[size] = null;
        return removedElement;
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += array[i];
            if (i < size - 1) str += ", ";
        }
        str += "]";
        return str;
    }
}
