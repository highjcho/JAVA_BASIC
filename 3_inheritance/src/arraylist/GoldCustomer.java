package arraylist;

public class GoldCustomer extends Customer {

    private double salesRatio;

    public GoldCustomer(int customerID, String customerName)
    {
        super(customerID, customerName);
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int) (price - (price * salesRatio));
    }
}
