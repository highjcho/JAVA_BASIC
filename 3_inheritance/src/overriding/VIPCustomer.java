package overriding;

public class VIPCustomer extends Customer {

    private int agentID;
    private double salesRatio;
    public VIPCustomer(int customerID, String customerName)
    {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        return (int) (price - (price * salesRatio));
    }
}
