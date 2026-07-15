

class Teacher {
    String name = "David";
}

class Department {
    Teacher t;

    Department(Teacher t) {
        this.t = t;
    }

    void display() {
        System.out.println(t.name);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Department d = new Department(t);
        d.display();
    }
}