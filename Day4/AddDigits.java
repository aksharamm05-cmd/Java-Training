public class AddDigits {
    public static void main(String[] args) {
        int num = 45;

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println(num);
    }
}