public class Laptopp {
    String brand;
    int ram;
    double price;

    Laptopp(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Laptopp l1 = new Laptopp("Dell", 16, 65000);

        l1.display();
    }
}
