public class List<T> {
    AbstractList<T> impl;
    public List(AbstractList<T> list) {
        impl = list;
    }
    public  void add(T obj) {
        impl.addElement(obj);
    }
    public  T get(int i) {
        return impl.getElement(i);
    }
    public  T remove(int i) {
        return impl.deleteElement(i);
    }
    public  int getSize() {
        return impl.getElementSize();
    }
}
class Queue<T> extends List<T> {
    public Queue(AbstractList<T> list) {
        super(list);
        System.out.println("Queue를 구현합니다.");
    }
    public void enQueue(T obj) {
        impl.addElement(obj);
    }
    public T deQueue() {
        return impl.deleteElement(0);
    }
}

class Stack<T> extends List<T> {
    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack을 구현합니다.");
    }

    public void push(T obj) {
        impl.addElement(obj);
    }

    public T pop() {
        return impl.deleteElement(impl.getElementSize() - 1);
    }
}