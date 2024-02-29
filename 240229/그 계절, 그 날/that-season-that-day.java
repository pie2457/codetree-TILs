import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (month(m) && day(y, m, d)) {
            System.out.println(season(m));
        } else {
            System.out.println(-1);
        }
    }

    static boolean year(int y) {
        if (y >= 1 && y <= 3000) {
            return true;
        } else if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return true;
        }
        return false;
    }

    static boolean day(int y,int m, int d) {
        if (d > 31) {
            return false;
        }
        if (year(y) && m == 2 && d <= 29) {
            return true;
        } else if (!year(y) && m == 2 && d <= 28) {
            return true;
        }
        if (d <= 31 && m == 1 || m == 3 || m == 5 || m == 7 ||
        m == 8 || m == 10 || m == 12) {
            return true;
        } else if (d <= 30 && m == 4 || m == 6 || m == 9 || m == 11) {
            return true;
        }
        return false;
    }

    static boolean month(int m) {
        return m <= 12;
    }

    static String season(int m) {
        if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summber";
        } else if (m >= 9 && m <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
}