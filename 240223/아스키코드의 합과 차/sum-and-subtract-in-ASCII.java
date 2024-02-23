import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int n1 = (int)a;
        int n2 = (int)b;

        System.out.print(n1 + n2);
        System.out.print(" ");
        System.out.print(n1 > n2 ? n1 - n2 : n2 - n1);

    }
}