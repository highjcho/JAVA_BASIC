package arraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customerLee = new Customer(10010, "이순신");
        Customer customerSin = new Customer(10020, "신사임당");
        GoldCustomer customerHong = new GoldCustomer(10030, "홍길동");
        GoldCustomer customerYul = new GoldCustomer(10040, "율곡");
        VIPCustomer customerKim = new VIPCustomer(10050, "김유신", 12345);
        customers.add(customerLee);
        customers.add(customerSin);
        customers.add(customerHong);
        customers.add(customerYul);
        customers.add(customerKim);
        System.out.println("========== 고객 정보 출력 ==========");
        for (Customer c : customers){
            System.out.println(c.showCustomerInfo());
        }
        System.out.println("========== 할인율과 보너스 포인트 계산 ==========");
        int price = 10000;
        for (Customer c : customers){
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(c.getCustomerName() + " 님의 현재 보너스 포인트는 " + c.getBonusPoint() + "점 입니다.");
        }
    }
}
