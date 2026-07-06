import java.util.*;
public class UserPalindrome {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter number:");
      int n=sc.nextInt();
       int temp=n;
       int rev =0;
       while(temp>0){
        int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
       }
       if(n==rev){
        System.out.println("palindrome");
       }
       else{
        System.out.println("not palindrome");
       }
       sc.close();
}  
    }
