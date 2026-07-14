public class Laptop {
    String brand;
    int price;

    Laptop() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {

        Laptop lap = new Laptop();

        lap.brand = "Dell";
        lap.price = 65000;

        System.out.println(lap.brand);
        System.out.println(lap.price);
    }
}
