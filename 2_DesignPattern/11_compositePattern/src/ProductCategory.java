import java.util.ArrayList;

public abstract class ProductCategory {
    int id;
    String name;
    int price;
    public ProductCategory(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public abstract void addProduct(ProductCategory product);
    public abstract void removeProduct(ProductCategory product);
    public abstract int getCount();
    public abstract String getName();
    public abstract int getPrice();
    public abstract int getId();

    public void getProductList(){};
}

class Product extends ProductCategory {
    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public void addProduct(ProductCategory product) {
    }

    @Override
    public void removeProduct(ProductCategory product) {
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getId() {
        return this.id;
    }
}

class Category extends ProductCategory {
    private ArrayList<ProductCategory> productList = new ArrayList<ProductCategory>();
    private String category;

    public Category(int id, String name, int price, String category) {
        super(id, name, price);
        this.category = category;
    }

    @Override
    public void addProduct(ProductCategory product) {
        productList.add(product);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        for (ProductCategory p: productList) {
            if (p.getId() == product.getId()) {
                productList.remove(p);
                return ;
            }
        }
        System.out.println("일치하는 상품이 없습니다.");
    }

    @Override
    public int getCount() {
        int ret = 0;
        for (ProductCategory p: productList)
            ret += p.getCount();
        return ret;
    }

    @Override
    public String getName() {
        return this.toString();
    }

    @Override
    public int getPrice() {
        int ret = 0;
        for (ProductCategory p: productList)
            ret += p.getPrice();
        return ret;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void getProductList() {
        System.out.println("\n =========== " + this.category + " ============ \n");
        for (ProductCategory p: productList)
            System.out.println("ID: " + p.getId() + " | Name: " + p.getName() + " | Price: " + p.getPrice());
    }

    @Override
    public String toString() {
        return this.category;
    }
}