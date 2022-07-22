package arraylist;

public class VIPCustomer extends Customer {

    private int agentID;
    private double salesRatio;
    public VIPCustomer(int customerID, String customerName, int agentID)
    {
        super(customerID, customerName);
        this.agentID = agentID;
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

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
    }
}
