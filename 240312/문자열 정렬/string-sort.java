import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char chars[] = sc.next().toCharArray();

        Arrays.sort(chars);
        
        for(char c : chars) {
            System.out.print(c);
        }
    }
}