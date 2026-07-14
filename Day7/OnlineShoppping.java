class Customer {

    String name;

    Customer(String name) {
        this.name = name;
    }
}

class Product {

    String productName;
    int price;

    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
}

class Order {

    Customer customer;
    Product product;

    Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    void displayOrder() {
        System.out.println(customer.name + " ordered " + product.productName);
        System.out.println("Price : " + product.price);
    }
}

public class OnlineShoppping {

    public static void main(String[] args) {

        Customer c = new Customer("Akshara");
        Product p = new Product("Laptop", 65000);

        Order order = new Order(c, p);

        order.displayOrder();
    }
}