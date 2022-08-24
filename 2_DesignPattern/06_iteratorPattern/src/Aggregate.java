interface Iterator{
    public abstract boolean hasNext();
    public abstract Object next();
}

public interface Aggregate {
    public abstract Iterator iterator(int type);
    public int getLength();
}

class Forward implements Iterator {

    private BookShelf bookShelf;
    private int idx;

    public Forward(Aggregate bookShelf) {
        this.bookShelf = (BookShelf)bookShelf;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        if (idx < bookShelf.getLength())
            return true;
        return false;
    }

    @Override
    public Object next() {
        return bookShelf.getBook(idx++);
    }
}

class Reverse implements Iterator {

    private BookShelf bookShelf;
    private int idx;

    public Reverse(Aggregate bookShelf) {
        this.bookShelf = (BookShelf)bookShelf;
        this.idx = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        if (idx >= 0)
            return true;
        return false;
    }

    @Override
    public Object next() {
        return bookShelf.getBook(idx--);
    }
}