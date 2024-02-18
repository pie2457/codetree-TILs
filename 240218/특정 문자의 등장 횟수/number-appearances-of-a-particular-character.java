import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int aNum = 0;
        int bNum = 0;

        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == 'e' && s.charAt(i) == 'e') {
                aNum++;
            } else if(s.charAt(i-1) == 'e' && s.charAt(i) == 'b') {
                bNum++;
            }
        }
        System.out.println(aNum + " " + bNum);
    }
}