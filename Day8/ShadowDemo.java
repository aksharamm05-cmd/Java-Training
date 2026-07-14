public class ShadowDemo {

    int number = 50;

    void display(int number) {
        System.out.println("Local Variable: " + number);
        System.out.println("Instance Variable: " + this.number);
    }

    public static void main(String[] args) {
        ShadowDemo obj = new ShadowDemo();
        obj.display(100);
    }
}
