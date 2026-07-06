public class ReverseNegative {
    public static void main(String[] args) {
        int num=-56;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);
        int rev =0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse = " + (rev * sign));
    }
}
