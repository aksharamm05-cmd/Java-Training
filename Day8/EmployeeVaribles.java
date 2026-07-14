public class EmployeeVaribles {

    // Instance Variable
    int empId = 101;

    // Static Variable
    static String company = "ABC Technologies";

    public void display() {

        // Local Variable
        double salary = 45000.50;

        System.out.println("Employee ID : " + empId);
        System.out.println("Company     : " + company);
        System.out.println("Salary      : " + salary);
    }

    public static void main(String[] args) {

        EmployeeVaribles emp = new EmployeeVaribles();

        emp.display();
    }
}