import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isPrime(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0){
            return true;
        }
        return false;
    }
}