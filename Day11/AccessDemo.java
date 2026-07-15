

class Sample {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessDemo {

    public static void main(String[] args) {

        Sample s = new Sample();

        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(s.c);
        

        s.display();
    }
}