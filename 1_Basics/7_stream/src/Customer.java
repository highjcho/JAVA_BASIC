public class Customer {
    private String name;   //이름
    private int age;       //나이
    private int price;     //가격

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        if (age >= 20)
            this.price = 100;
        else
            this.price = 50;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "name: " + name + "age: " + age + "price: " + price;
    }
}
