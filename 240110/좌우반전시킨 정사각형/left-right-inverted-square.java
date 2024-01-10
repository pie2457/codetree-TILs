import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                st.add(i * j);
            }
            while(st.size() != 0) {
                System.out.print(st.pop() + " ");
            }
            System.out.println();
            st.clear();
        }
    }
}