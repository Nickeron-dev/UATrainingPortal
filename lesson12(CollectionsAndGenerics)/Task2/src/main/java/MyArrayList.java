import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> extends AbstractList<T> {
    private int index = 0;
    private T[] dynamycArray;

    public MyArrayList(T[] dynamycArray) {
        this.dynamycArray = dynamycArray;
    }

    public MyArrayList(int capacity) {
        this.dynamycArray = (T[]) new Object[capacity];
    }

    @Override
    public T get(int index) {
        return dynamycArray[index];
    }

    @Override
    public int size() {
        return dynamycArray.length;
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = dynamycArray;
            dynamycArray = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, dynamycArray, 0, temp.length);
            dynamycArray[index] = t;
            index++;
            return true;
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return false;
    }

    @Override
    public T remove(int index) {
        return super.remove(index);
    }

}
