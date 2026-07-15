class Student3 {
    int mark;

    Student3(int mark) {
        this.mark = mark;
    }

    void display() {
        System.out.println(mark);
    }

    public static void main(String[] args) {
        Student3 s = new Student3(95);
        s.display();
    }
}