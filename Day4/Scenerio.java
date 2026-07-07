public class Scenerio {
    public static void main(String[] args){
        int balance = 5000;
        int withdraw = 1500;

        if (balance>0)
            System.out.println("Remaining Balance = " + (balance - withdraw));
        else
            System.out.println("Insufficient Balance");
    }
}
