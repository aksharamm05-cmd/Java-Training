public class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student1 s = new Student1(101, "Akshara");
        s.display();
    }
}