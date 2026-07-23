import java.util.Stack;

public class Peek {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(100);
        st.push(200);
        st.push(300);

        System.out.println("Top Element: " + st.peek());
        System.out.println(st);
    }
}