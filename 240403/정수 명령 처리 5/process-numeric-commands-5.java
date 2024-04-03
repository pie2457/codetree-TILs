import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();

        int n = sc.nextInt();

        String push = "push_back";
        String pop = "pop_back";
        String size = "size";
        String get = "get";

        for(int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals(push)) {
                int m = sc.nextInt();
                ls.add(m);
            } else if (s.equals(pop)) {
                ls.remove(ls.size() - 1);
            } else if (s.equals(size)) {
                System.out.println(ls.size());
                continue;
            } else if (s.equals(get)) {
                int m = sc.nextInt();
                System.out.println(ls.get(m - 1));
                continue;
            }
        }
    }
}