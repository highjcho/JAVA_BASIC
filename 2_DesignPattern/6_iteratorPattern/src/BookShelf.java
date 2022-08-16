import java.util.ArrayList;

public class BookShelf implements Aggregate{
    ArrayList<Book> bookShelf;
    Factory f = IteratorFactory.getInstance();
    int index;
    public BookShelf(int size)
    {
        this.bookShelf = new ArrayList<Book>(size);
    }

    public void appendBook(Book book) {
        bookShelf.add(book);
        index++;
    }

    public Book getBook(int idx) {
        return bookShelf.get(idx);
    }

    @Override
    public Iterator iterator(int type) {
        return f.create(this, type);
    }

    @Override
    public int getLength() {
        return index;
    }
}
