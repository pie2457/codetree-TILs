import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s1[] = sc.next().toCharArray();
        char s2[] = sc.next().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        String s = "Yes";

        for(int i = 0; i < s1.length; i++) {
            if (s1.length != s2.length) {
                s = "No";
                break;
            }
            if (s1[i] != s2[i]) {
                s = "No";
                break;
            }
        }
        System.out.println(s);
    }
}