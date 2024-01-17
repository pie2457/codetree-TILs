import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i < 20; i++) {
            for(int j = 1; j < 20; j++) {
                System.out.print(i + " * " + j + " = " + i * j);
                if (j % 2 == 0) {
                    System.out.println();
                } else if (j == 19) {
                    continue;
                } else {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}