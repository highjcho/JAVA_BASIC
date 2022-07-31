import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer customerLee = new Customer("이순신", 40);
        Customer customerKim = new Customer("김유신", 20);
        Customer customerHong = new Customer("홍길동", 13);
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println(" ===== 고객 명단 ===== ");
        customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));

        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용은 : " + total + "원 입니다.");

        System.out.println(" ===== 20세 이상 고객 명단 ===== ");
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
    }
}
