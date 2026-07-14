public class Teacher extends Person {

    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void teacherDetails() {
        display();
        System.out.println("Subject: " + subject);
    }
}
