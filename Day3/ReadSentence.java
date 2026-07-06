import java.util.*;
public class ReadSentence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name:");
        String name= sc.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        sc.close();
    }
}
