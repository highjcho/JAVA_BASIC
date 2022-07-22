package extensionInterface;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        Sell seller = customer;

        System.out.println("Buyer's order: ");
        buyer.order();
        System.out.println("Seller's order: ");
        seller.order();
        System.out.println("Customer's order: ");
        customer.order();
        customer.buy();
        customer.sell();
    }
}