import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        String product = "product ";
        String is = " is ";

        Item item = new Item(name, code);
        Item codetree = new Item("codetree", 50);

        System.out.println(product + codetree.code + is + codetree.name);
        System.out.println(product + item.code + is + item.name);
    }

    static class Item {

        String name;
        int code;

        public Item(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }
}