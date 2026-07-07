public class UglyNumber {
    public static void main(String[] args) {
        int num=6;
        if(num<=0){
            System.out.println(false);
            return;
        }
        while(num % 2 == 0) num/=2;
        while(num % 3 == 0)num/=3;
        while(num % 5 ==0)num/=5;
        System.out.println(num==1);
    }
}
