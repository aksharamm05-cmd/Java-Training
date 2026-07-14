public class Carr {

    String brand;
    int year;

    Carr(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Year  : " + year);
        System.out.println();
    }

    public static void main(String[] args) {

        Carr c1 = new Carr("Honda", 2022);
        Carr c2 = new Carr("Toyota", 2023);
        Carr c3 = new Carr("Hyundai", 2024);

        c1.display();
        c2.display();
        c3.display();
    }
}
