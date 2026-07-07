public class Armstrong {
    public static void main(String[] args){
        int num=123,temp=num;
        int sum=0;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp/=10;
        }
        if(sum == num){
            System.out.println("number is Armstrong");
        }
        else{
           System.out.println("number is not Armstrong");
        }
    }
}
