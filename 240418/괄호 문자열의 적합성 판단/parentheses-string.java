import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(c);
            } else {
                st.pop();
            }
        }
        System.out.println(st.size() == 0 ? "Yes" : "No");
    }
}