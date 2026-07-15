class Student {

    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class StudentData {

    public static void main(String[] args) {

        Student s = new Student();

        s.setRollNo(1);
        s.setName("Akshara");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
    }
}