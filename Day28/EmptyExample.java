import java.util.Stack;

public class EmptyExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty());

        st.push(50);

        System.out.println(st.isEmpty());
    }
}
