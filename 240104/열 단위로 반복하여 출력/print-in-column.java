import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i = 0; i < k; i++) {
            for(int j = 0; j < k; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}