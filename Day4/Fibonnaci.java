import java.util.*;
public class Fibonnaci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter number:");
         int n=sc.nextInt();
         if(n==0){
            System.out.println(0);
         }
         else if(n==1){
            System.out.println(1);
         }
         else{
         int a=0,b=1;
       for(int i =2;i<=n;i++){
        int c=b;
        b=a+b;
        a=c;
       }
       System.out.println(b);
    }
    }
}
