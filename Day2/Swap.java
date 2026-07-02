package Day2;

public class Swap {
    public static void main(String[] args) {
        int a=90;
        int b=67;
        System.out.println("--before swap--");
        System.out.println("first :"+a);
        System.out.println("second:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("--After swap--");
        System.out.println("first :"+a);
        System.out.println("second:"+b);
    }
}
