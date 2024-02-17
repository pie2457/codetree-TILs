import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

		String a1 = a + b;
		String b1 = b + a;

		System.out.println(a1.equals(b1) ? true : false);
    }
}