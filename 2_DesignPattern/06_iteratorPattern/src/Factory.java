public abstract class Factory {
    public final static int FORWARD = 0;
    public final static int REVERSE = 1;

    public final Iterator create(Aggregate list, int type) {
        Iterator i = createProduct(list, type);
        return i;
    }

    protected abstract Iterator createProduct(Aggregate list, int type);
}

class IteratorFactory extends Factory{
    private static IteratorFactory iFactory = new IteratorFactory();
    private IteratorFactory(){}
    public static IteratorFactory getInstance(){
        if(iFactory == null)
            iFactory = new IteratorFactory();
        return iFactory;
    }
    @Override
    protected Iterator createProduct(Aggregate bookShelf, int type) {
        if (type == FORWARD)
            return new Forward((bookShelf));
        else if (type == REVERSE)
            return new Reverse((bookShelf));
        return null;
    }
}