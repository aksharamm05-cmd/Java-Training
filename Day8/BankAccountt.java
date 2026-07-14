public class BankAccountt {

    int accountNo;
    String name;
    double balance;

    BankAccountt() {
        this(101);
    }

    BankAccountt(int accountNo) {
        this(accountNo, "Akshara");
    }

    BankAccountt(int accountNo, String name) {
        this(accountNo, name, 5000);
    }

    BankAccountt(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(accountNo);
        System.out.println(name);
        System.out.println(balance);
    }

    public static void main(String[] args) {

        BankAccountt b = new BankAccountt();
        b.display();
    }
}