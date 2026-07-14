class Payment {
    void pay(double amount) {
        System.out.println("Payment Processing...");
    }
}

class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Card extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class Cash extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1000);

        p = new Cash();
        p.pay(200);
    }
}