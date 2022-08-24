import java.util.ArrayList;

public abstract class ProductDao {
    public abstract void insertProduct(Product product);
    public abstract void updateProduct(Product product);
    public abstract void deleteProduct(Product product);
    public abstract void getProductList();
}

class ProductMySqlDao extends ProductDao {
    public String db = "MYSQL";
    public ArrayList<Product> productList = new ArrayList<Product>();

    @Override
    public void insertProduct(Product product) {
        productList.add(product);
        System.out.println("insert product " + db + " DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        for (Product p : productList)
        {
            if (p.getProductId().equalsIgnoreCase(product.getProductId()))
            {
                System.out.println("update info " + db + " DB userId = " + p.getProductId());
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void deleteProduct(Product product) {
        for (Product p : productList)
        {
            if (p.getProductId().equalsIgnoreCase(product.getProductId()))
            {
                System.out.println("delete info " + db + " DB userId = " + p.getProductId());
                productList.remove(p);
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void getProductList() {
        System.out.println(" =============== " + db + " ================ ");
        System.out.println();
        System.out.println("  NO |    ID    |  NAME  " );
        int i = 1;
        for (Product p : productList)
        {
            System.out.println("  " + i + "  |  " + p.getProductId() + "  |  " + p.getProductName() + "  |");
            i++;
        }
        System.out.println("\n ======================================" );
    }
}

class ProductOracleDao extends ProductDao {
    public String db = "ORACLE";
    public ArrayList<Product> productList = new ArrayList<Product>();

    @Override
    public void insertProduct(Product product) {
        productList.add(product);
        System.out.println("insert product " + db + " DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        for (Product p : productList)
        {
            if (p.getProductId().equalsIgnoreCase(product.getProductId()))
            {
                System.out.println("update info " + db + " DB userId = " + p.getProductId());
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void deleteProduct(Product product) {
        for (Product p : productList)
        {
            if (p.getProductId().equalsIgnoreCase(product.getProductId()))
            {
                System.out.println("delete info " + db + " DB userId = " + p.getProductId());
                productList.remove(p);
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void getProductList() {
        System.out.println(" =============== " + db + " ================ ");
        System.out.println();
        System.out.println("  NO |    ID    |  NAME  " );
        int i = 1;
        for (Product p : productList)
        {
            System.out.println("  " + i + "  |  " + p.getProductId() + "  |  " + p.getProductName() + "  |");
            i++;
        }
        System.out.println("\n ======================================" );
    }
}