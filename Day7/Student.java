public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Akshara");
        Student s2 = new Student(102, "Priya");
        Student s3 = new Student(103, "Rahul");

        s1.display();
        s2.display();
        s3.display();
    }
}