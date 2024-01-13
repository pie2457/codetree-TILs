import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for(int i = 2; i < 10; i+=2) {
            for(int j = max; j >= min; j--) {
                System.out.print(j + " * " + i + " = " + j * i);
                if (j != min) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}