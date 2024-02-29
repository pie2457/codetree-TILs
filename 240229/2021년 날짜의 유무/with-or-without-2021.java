import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if (calender(m, d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean calender(int m, int d) {
        String day31 = "135781012";
        String day30 = "46911";
        if (m > 12 || d > 31) {
            return false;
        } else if (m == 2 && d > 28) {
            return false;
        }
        if (day31.contains(String.valueOf(m)) && d <= 31) {
            return true;
        } else if (day30.contains(String.valueOf(m)) && d <= 30) {
            return true;
        }
        return false;
    }
}