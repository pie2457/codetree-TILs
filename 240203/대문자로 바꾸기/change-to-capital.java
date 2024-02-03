import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st[][] = new String[5][3];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                st[i][j] = sc.next();

                System.out.print(st[i][j].toUpperCase() + " ");
            }
            System.out.println();
        }
    }
}