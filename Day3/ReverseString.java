import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word =sc.nextLine() ;

        int rev = 0;

        while (word.length() > 0) {
            rev = rev * 10 + word.charAt(word.length() - 1) - '0';
            word = word.substring(0, word.length() - 1);
        }

        System.out.println("Reverse = " + rev);
        sc.close();
    }
}