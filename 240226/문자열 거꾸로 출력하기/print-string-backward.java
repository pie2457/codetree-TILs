import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String end = "END";
        
        while (true) {
            String s = sc.next();
            if (end.equals(s)) {
                break;
            }
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());
        }
    }
}