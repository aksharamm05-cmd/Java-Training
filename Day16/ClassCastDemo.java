

public class ClassCastDemo {

    public static void main(String[] args) {

        try {
            Object obj = "Java";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        }

    }
}