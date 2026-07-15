
class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID");
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            System.out.println("Invalid Name");
    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            System.out.println("Invalid Salary");
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setId(101);
        e.setName("Akshara");
        e.setSalary(35000);

        e.display();
    }
}
