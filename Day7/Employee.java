public class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {

        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Akshara");
        Employee e2 = new Employee(2, "Priya");
        Employee e3 = new Employee(3, "Rahul");

        e1.display();
        e2.display();
        e3.display();
    }
}