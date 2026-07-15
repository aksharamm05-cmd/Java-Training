interface Payment {

    void pay(double amount);
}

class UPI implements Payment {
     @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class Card implements Payment {
    @Override

    public void pay(double amount) {
        System.out.println("Paid using Card: " + amount);
    }
}

public class PaymentApp {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(1000);

        p = new Card();
        p.pay(2000);
    }
}
