import java.util.ArrayList;
import java.util.LinkedList;

public interface AbstractList<T> {
    public void addElement(T obj);
    public T deleteElement(int i);
    public int insertElement(T obj, int i);
    public T getElement(int i);
    public int getElementSize();
}

class ArrayImpl<T> implements AbstractList<T> {
    ArrayList<T> arrayList = new ArrayList<T>();
    @Override
    public void addElement(T obj) {
        arrayList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        T tmp = arrayList.get(i);
        arrayList.remove(i);
        return tmp;
    }

    @Override
    public int insertElement(T obj, int i) {
        arrayList.add(i, obj);
        return i;
    }

    @Override
    public T getElement(int i) {
        return arrayList.get(i);
    }

    @Override
    public int getElementSize() {
        return arrayList.size();
    }
}

class LinkedListImpl<T> implements AbstractList<T> {
    public String type = "Linked List";
    LinkedList<T> linkedList = new LinkedList<T>();

    @Override
    public void addElement(T obj) {
        linkedList.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        T tmp = linkedList.get(i);
        linkedList.remove(i);
        return tmp;
    }

    @Override
    public int insertElement(T obj, int i) {
        linkedList.add(i, obj);
        return i;
    }

    @Override
    public T getElement(int i) {
        return linkedList.get(i);
    }

    @Override
    public int getElementSize() {
        return linkedList.size();
    }
}