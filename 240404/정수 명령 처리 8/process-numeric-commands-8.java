import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push_front")) {
                int m = sc.nextInt();
                ls.addFirst(m);
                continue;
            } else if (s.equals("push_back")) {
                int m = sc.nextInt();
                ls.addLast(m);
                continue;
            } else if (s.equals("pop_front")) {
                System.out.println(ls.pollFirst());
                continue;
            } else if (s.equals("pop_back")) {
                System.out.println(ls.pollLast());
                continue;
            } else if (s.equals("front")) {
                System.out.println(ls.peekFirst());
                continue;
            } else if (s.equals("back")) {
                System.out.println(ls.peekLast());
                continue;
            } else if (s.equals("size")) {
                System.out.println(ls.size());
                continue;
            } else if (s.equals("empty")) {
                System.out.println(ls.isEmpty() ? 1 : 0);
                continue;
            }
        }
    }
}