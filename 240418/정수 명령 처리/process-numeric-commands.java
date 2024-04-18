import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push")) {
                int m = sc.nextInt();
                stack.push(m);
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (s.equals("pop")) {
                System.out.println(stack.pop());
            } else if (s.equals("top")) {
                System.out.println(stack.peek());
            }
        }
    }
}