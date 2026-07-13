import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; 
        int n = 5;

        
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (1 to " + (n + 1) + "): ");
        int position = sc.nextInt();

        if (position < 1 || position > n + 1) {
            System.out.println("Invalid Position");
            return;
        }

        
        for (int i = n; i >= position; i--) {
            arr[i] = arr[i - 1];
        }

       
        arr[position - 1] = element;
        n++;

        System.out.println("Array after insertion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
