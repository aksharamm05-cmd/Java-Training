import java.util.Stack;

public class PopStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(10);
        st.push(15);

        System.out.println("Removed: " + st.pop());
        System.out.println(st);
    }
}