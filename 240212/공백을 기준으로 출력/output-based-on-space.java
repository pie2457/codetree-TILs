import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = "";

        result += s1.replace(" ", "");
        result += s2.replace(" ", "");
        
        System.out.println(result);
    }
}