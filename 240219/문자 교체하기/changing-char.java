import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        char arr[] = b.toCharArray();

        arr[0] = a.charAt(0);
        arr[1] = a.charAt(1);

        System.out.print(String.valueOf(arr));
    }
}