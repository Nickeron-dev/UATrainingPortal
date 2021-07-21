import java.lang.reflect.Array;
import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
