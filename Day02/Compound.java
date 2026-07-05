public class Compound {
    public static void main(String[] args) {
       double amount = 10000, rate = 10.25, time = 5;
       double CI=amount*Math.pow((1+rate/100),time);
       System.out.println("Compound interest is: " + CI);

    }
}
