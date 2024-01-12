import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String st[] = s.split(" ");

        int max = Math.max(Integer.parseInt(st[0]), Integer.parseInt(st[1]));
        int min = Math.min(Integer.parseInt(st[0]), Integer.parseInt(st[1]));

        for(int i = 1; i < 10; i++) {
            for(int j = max; j >= min; j-=2) {
                System.out.print(j + " * " + i + " = " + j * i);
                if (j != min) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}