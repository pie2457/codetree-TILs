import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Bomb bomb = new Bomb(code, color, second);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.second);
    }

    static class Bomb {
        String code;
        String color;
        int second;

        public Bomb(String code, String color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }
    }
}