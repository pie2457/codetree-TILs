import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        String user = "user ";
        String lv = " lv ";

        People people1 = new People();
        System.out.println(user + people1.id + lv + people1.level);

        People people2 = new People(id, level);
        System.out.println(user + people2.id + lv + people2.level);
    }

    static class People {

        String id;
        int level;

        public People() {
            this.id = "codetree";
            this.level = 10;
        }

        public People(String id, int level) {
            this.id = id;
            this.level = level;
        }
    }
}