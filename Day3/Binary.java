
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {//checking binary number is valid or not1101
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        if (binary.matches("[01]+")) {
            System.out.println("Valid binary number.");
        } else {
            System.out.println("Invalid binary number.");
        }

        sc.close();
    }
}