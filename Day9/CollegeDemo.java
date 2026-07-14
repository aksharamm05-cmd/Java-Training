class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class College {
    String collegeName;
    Professor professor;

    College(String collegeName, Professor professor) {
        this.collegeName = collegeName;
        this.professor = professor;
    }

    void display() {
        System.out.println(collegeName);
        System.out.println("Professor: " + professor.name);
    }
}

public class CollegeDemo {
    public static void main(String[] args) {

        Professor p = new Professor("Ramesh");

        College c = new College("ABC College", p);

        c.display();
    }
}
